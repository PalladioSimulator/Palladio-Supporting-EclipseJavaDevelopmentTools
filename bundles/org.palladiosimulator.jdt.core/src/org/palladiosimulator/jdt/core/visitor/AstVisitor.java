package org.palladiosimulator.jdt.core.visitor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;

public abstract class AstVisitor<T> extends ASTVisitor {

    protected final boolean visitChildren;

    private final Set<T> visitedNodes;

    protected AstVisitor() {
        this(true, true);
    }

    protected AstVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags);
        this.visitChildren = visitChildren;
        visitedNodes = new HashSet<>();
    }

    public boolean addVisitedNode(final T node) {
        if (containsVisitedNode(node)) {
            return false;
        }

        return visitedNodes.add(node);
    }

    public boolean containsVisitedNode(final T node) {
        return node == null || visitedNodes.contains(node);
    }

    public Set<T> getVisitedNodes() {
        return Collections.unmodifiableSet(visitedNodes);
    }

}
