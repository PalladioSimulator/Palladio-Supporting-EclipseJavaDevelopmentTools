package org.palladiosimulator.jdt.core.visitor;

import static java.util.function.Predicate.not;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class TypeDeclarationVisitor extends AstVisitor<AbstractTypeDeclaration> {

    public TypeDeclarationVisitor() {
        super();
    }

    public TypeDeclarationVisitor(final boolean visitDocTags, final boolean visitChildren) {
        super(visitDocTags, visitChildren);
    }

    public Set<AnnotationTypeDeclaration> getAnnotationDeclarations() {
        return getDeclarations(AnnotationTypeDeclaration.class).collect(Collectors.toUnmodifiableSet());
    }

    public Set<TypeDeclaration> getClassDeclarations() {
        return getDeclarations(TypeDeclaration.class).filter(not(TypeDeclaration::isInterface))
                .collect(Collectors.toUnmodifiableSet());
    }

    private <T> Stream<T> getDeclarations(final Class<T> clazz) { // TODO move
        return getVisitedNodes().stream().filter(clazz::isInstance).map(clazz::cast);
    }

    public Set<EnumDeclaration> getEnumDeclarations() {
        return getDeclarations(EnumDeclaration.class).collect(Collectors.toUnmodifiableSet());
    }

    public Set<TypeDeclaration> getInterfaceDeclarations() {
        return getDeclarations(TypeDeclaration.class).filter(TypeDeclaration::isInterface)
                .collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public boolean visit(final AnnotationTypeDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

    @Override
    public boolean visit(final EnumDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
        if (containsVisitedNode(node)) {
            return false;
        }
        addVisitedNode(node);

        return visitChildren;
    }

}
