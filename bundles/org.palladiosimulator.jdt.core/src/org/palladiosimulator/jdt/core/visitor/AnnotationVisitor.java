package org.palladiosimulator.jdt.core.visitor;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;

public class AnnotationVisitor extends AstVisitor<Annotation> {

    @SuppressWarnings("unchecked")
    public static List<Annotation> getAnnotations(BodyDeclaration node) {
        return (List<Annotation>) node.modifiers().stream().filter(Annotation.class::isInstance)
                .map(Annotation.class::cast).collect(Collectors.toList());
    }

    public AnnotationVisitor() {
        super();
    }

    public AnnotationVisitor(boolean visitDocTags, boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    private boolean visitAnnotation(Annotation node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

    @Override
    public boolean visit(MarkerAnnotation node) {
        return visitAnnotation(node);
    }

    @Override
    public boolean visit(NormalAnnotation node) {
        return visitAnnotation(node);
    }

    @Override
    public boolean visit(SingleMemberAnnotation node) {
        return visitAnnotation(node);
    }

}
