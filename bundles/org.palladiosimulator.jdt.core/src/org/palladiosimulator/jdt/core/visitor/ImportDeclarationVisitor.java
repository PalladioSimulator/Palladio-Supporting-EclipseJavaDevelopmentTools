package org.palladiosimulator.jdt.core.visitor;

import org.eclipse.jdt.core.dom.ImportDeclaration;

public class ImportDeclarationVisitor extends AstVisitor<ImportDeclaration> {

    public ImportDeclarationVisitor() {
        super();
    }

    public ImportDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final ImportDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
