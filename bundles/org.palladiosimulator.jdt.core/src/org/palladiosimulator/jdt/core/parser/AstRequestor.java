package org.palladiosimulator.jdt.core.parser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FileASTRequestor;
import org.eclipse.jdt.core.dom.IBinding;

public class AstRequestor extends FileASTRequestor {

    private final Map<String, IBinding> bindings;
    private final Map<String, CompilationUnit> compilationUnits;

    public AstRequestor() {
        compilationUnits = new HashMap<>();
        bindings = new HashMap<>();
    }

    @Override
    public void acceptAST(final String sourceFilePath, final CompilationUnit ast) {
        compilationUnits.put(sourceFilePath, ast);
    }

    @Override
    public void acceptBinding(final String bindingKey, final IBinding binding) {
        bindings.put(bindingKey, binding);
    }

    public Map<String, IBinding> getBindings() {
        return Collections.unmodifiableMap(bindings);
    }

    public Map<String, CompilationUnit> getCompilationUnits() {
        return Collections.unmodifiableMap(compilationUnits);
    }

}
