package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.TypeDeclaration;

public class ClassDeclarationVisitor extends AstVisitor<TypeDeclaration> {

    public ClassDeclarationVisitor() {
        super();
    }

    public ClassDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
        if (containsVisitedNode(node) || node.isInterface()) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
