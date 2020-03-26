package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.FieldDeclaration;

public class FieldDeclarationVisitor extends AstVisitor<FieldDeclaration> {

    public FieldDeclarationVisitor() {
        super();
    }

    public FieldDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
