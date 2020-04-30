package org.palladiosimulator.jdt.core.visitor;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;

public class AnnotationVisitor extends AstVisitor<Annotation> {

    @SuppressWarnings("unchecked")
    public static Set<Annotation> getAnnotations(final BodyDeclaration node) {
        return (Set<Annotation>) node.modifiers().stream().filter(Annotation.class::isInstance)
                .map(Annotation.class::cast).collect(Collectors.toUnmodifiableSet());
    }

    public AnnotationVisitor() {
        super();
    }

    public AnnotationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    @Override
    public boolean visit(final MarkerAnnotation node) {
        return visitAnnotation(node);
    }

    @Override
    public boolean visit(final NormalAnnotation node) {
        return visitAnnotation(node);
    }

    @Override
    public boolean visit(final SingleMemberAnnotation node) {
        return visitAnnotation(node);
    }

    private boolean visitAnnotation(final Annotation node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
