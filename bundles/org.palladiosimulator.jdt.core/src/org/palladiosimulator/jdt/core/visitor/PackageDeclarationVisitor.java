package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.PackageDeclaration;

public class PackageDeclarationVisitor extends AstVisitor<PackageDeclaration> {

    public PackageDeclarationVisitor() {
        super();
    }

    public PackageDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final PackageDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
