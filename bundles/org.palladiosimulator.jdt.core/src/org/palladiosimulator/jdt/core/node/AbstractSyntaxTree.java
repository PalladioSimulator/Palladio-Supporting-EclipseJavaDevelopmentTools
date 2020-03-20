package org.palladiosimulator.jdt.core.node;

import org.eclipse.jdt.core.dom.ASTNode;
import org.palladiosimulator.jdt.core.visitor.AstVisitor;

public class AbstractSyntaxTree {

    private final ASTNode root;

    public AbstractSyntaxTree(ASTNode node) {
        root = node.getRoot();
    }

    public void accept(AstVisitor<?> visitor) {
        root.accept(visitor);
    }

}
