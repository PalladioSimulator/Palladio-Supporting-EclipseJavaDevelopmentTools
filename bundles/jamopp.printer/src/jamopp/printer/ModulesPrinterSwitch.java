package jamopp.printer;

import java.io.BufferedWriter;
import java.io.IOException;

import org.eclipse.emf.ecore.util.Switch;
import org.emftext.language.java.modifiers.Static;
import org.emftext.language.java.modules.AccessProvidingModuleDirective;
import org.emftext.language.java.modules.ExportsModuleDirective;
import org.emftext.language.java.modules.ModuleReference;
import org.emftext.language.java.modules.OpensModuleDirective;
import org.emftext.language.java.modules.ProvidesModuleDirective;
import org.emftext.language.java.modules.RequiresModuleDirective;
import org.emftext.language.java.modules.UsesModuleDirective;
import org.emftext.language.java.modules.util.ModulesSwitch;
import org.emftext.language.java.types.TypeReference;

class ModulesPrinterSwitch extends ModulesSwitch<Boolean> {
	private Switch<Boolean> parent;
	private BufferedWriter writer;
	
	ModulesPrinterSwitch(Switch<Boolean> parent, BufferedWriter writer) {
		this.parent = parent;
		this.writer = writer;
	}
	
	@Override
	public Boolean caseUsesModuleDirective(UsesModuleDirective element) {
		try {
			writer.append("uses ");
			parent.doSwitch(element.getTypeReference());
			writer.append(";\n");
		} catch (IOException e) {
		}
		return true;
	}
	
	@Override
	public Boolean caseProvidesModuleDirective(ProvidesModuleDirective element) {
		try {
			writer.append("provides ");
			parent.doSwitch(element.getTypeReference());
			writer.append(" with ");
			for (int index = 0; index < element.getServiceProviders().size(); index++) {
				TypeReference ref = element.getServiceProviders().get(index);
				parent.doSwitch(ref);
				if (index < element.getServiceProviders().size() - 1) {
					writer.append(".");
				}
			}
			writer.append(";\n");
		} catch (IOException e) {
		}
		return true;
	}
	
	@Override
	public Boolean caseRequiresModuleDirective(RequiresModuleDirective element) {
		try {
			writer.append("requires ");
			if (element.getModifier() != null) {
				if (element.getModifier() instanceof Static) {
					writer.append("static ");
				} else {
					writer.append("transitive ");
				}
			}
			if (element.getRequiredModule().getTarget() != null) {
				writer.append(element.getRequiredModule().getTarget().getNamespacesAsString());
			} else {
				writer.append(element.getRequiredModule().getNamespacesAsString());
			}
			writer.append(";\n");
		} catch (IOException e) {
		}
		return true;
	}
	
	@Override
	public Boolean caseOpensModuleDirective(OpensModuleDirective element) {
		try {
			writer.append("opens ");
			printRemainingAccessProvidingModuleDirective(element);
		} catch (IOException e) {
		}
		return true;
	}
	
	@Override
	public Boolean caseExportsModuleDirective(ExportsModuleDirective element) {
		try {
			writer.append("exports ");
			printRemainingAccessProvidingModuleDirective(element);
		} catch (IOException e) {
		}
		return true;
	}
	
	private void printRemainingAccessProvidingModuleDirective(AccessProvidingModuleDirective element) {
		try {
			if (element.getAccessablePackage() != null) {
				writer.append(element.getAccessablePackage().getNamespacesAsString());
			} else {
				writer.append(element.getNamespacesAsString());
			}
			if (element.getModules().size() > 0) {
				writer.append(" to ");
				ModuleReference m = element.getModules().get(0);
				if (m.getTarget() != null) {
					writer.append(m.getTarget().getNamespacesAsString());
				} else {
					writer.append(m.getNamespacesAsString());
				}
				for (int index = 1; index < element.getModules().size(); index++) {
					writer.append(", ");
					m = element.getModules().get(index);
					if (m.getTarget() != null) {
						writer.append(m.getTarget().getNamespacesAsString());
					} else {
						writer.append(m.getNamespacesAsString());
					}
				}
			}
			writer.append(";\n");
		} catch (IOException e) {
		}
	}
}
