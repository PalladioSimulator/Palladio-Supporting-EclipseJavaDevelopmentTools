package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethodDeclarationVisitor extends AstVisitor<MethodDeclaration> {

    public MethodDeclarationVisitor() {
        super();
    }

    public MethodDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
