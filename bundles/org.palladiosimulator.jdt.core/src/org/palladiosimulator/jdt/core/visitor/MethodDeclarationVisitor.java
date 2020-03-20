package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethodDeclarationVisitor extends AstVisitor<MethodDeclaration> {

    public MethodDeclarationVisitor() {
        super();
    }

    public MethodDeclarationVisitor(boolean visitDocTags, boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(MethodDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
