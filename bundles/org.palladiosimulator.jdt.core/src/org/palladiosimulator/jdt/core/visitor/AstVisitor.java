package org.palladiosimulator.jdt.core.visitor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;

public abstract class AstVisitor<T> extends ASTVisitor {

    private final Set<T> visitedNodes;

    public Set<T> getVisitedNodes() {
        return Collections.unmodifiableSet(visitedNodes);
    }

    protected final boolean visitChildren;

    protected AstVisitor() {
        this(true, true);
    }

    protected AstVisitor(boolean visitDocTags, boolean visitChildren) {
        super(visitDocTags);
        this.visitChildren = visitChildren;
        visitedNodes = new HashSet<>();
    }

    public boolean addVisitedNode(T node) {
        if (containsVisitedNode(node)) {
            return false;
        }

        return visitedNodes.add(node);
    }

    public boolean containsVisitedNode(T node) {
        return (node == null) || visitedNodes.contains(node);
    }

}
