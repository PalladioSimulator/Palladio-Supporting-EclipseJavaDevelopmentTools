/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationParameter;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationInstanceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationInstanceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationInstanceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationInstanceImpl extends ReferenceImpl implements AnnotationInstance {
    /**
     * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespaces()
     * @generated
     * @ordered
     */
    protected EList<String> namespaces;

    /**
     * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotation()
     * @generated
     * @ordered
     */
    protected Classifier annotation;

    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected AnnotationParameter parameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnnotationInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnnotationsPackage.Literals.ANNOTATION_INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getNamespaces() {
        if (namespaces == null) {
            namespaces = new EDataTypeEList<String>(String.class, this,
                    AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES);
        }
        return namespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Classifier getAnnotation() {
        if (annotation != null && annotation.eIsProxy()) {
            InternalEObject oldAnnotation = (InternalEObject) annotation;
            annotation = (Classifier) eResolveProxy(oldAnnotation);
            if (annotation != oldAnnotation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
            }
        }
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetAnnotation() {
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnnotation(Classifier newAnnotation) {
        Classifier oldAnnotation = annotation;
        annotation = newAnnotation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION,
                    oldAnnotation, annotation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationParameter getParameter() {
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameter(AnnotationParameter newParameter, NotificationChain msgs) {
        AnnotationParameter oldParameter = parameter;
        parameter = newParameter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, oldParameter, newParameter);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameter(AnnotationParameter newParameter) {
        if (newParameter != parameter) {
            NotificationChain msgs = null;
            if (parameter != null)
                msgs = ((InternalEObject) parameter).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
            if (newParameter != null)
                msgs = ((InternalEObject) newParameter).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
            msgs = basicSetParameter(newParameter, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER,
                    newParameter, newParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNamespacesAsString() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getClassifierAtNamespaces() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
            return basicSetParameter(null, msgs);
        default:
            return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
            return getNamespaces();
        case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
            if (resolve)
                return getAnnotation();
            return basicGetAnnotation();
        case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
            return getParameter();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
            getNamespaces().clear();
            getNamespaces().addAll((Collection<? extends String>) newValue);
            return;
        case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
            setAnnotation((Classifier) newValue);
            return;
        case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
            setParameter((AnnotationParameter) newValue);
            return;
        default:
            super.eSet(featureID, newValue);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
            getNamespaces().clear();
            return;
        case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
            setAnnotation((Classifier) null);
            return;
        case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
            setParameter((AnnotationParameter) null);
            return;
        default:
            super.eUnset(featureID);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
            return namespaces != null && !namespaces.isEmpty();
        case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
            return annotation != null;
        case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
            return parameter != null;
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AnnotationInstanceOrModifier.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == NamespaceAwareElement.class) {
            switch (derivedFeatureID) {
            case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
                return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AnnotationInstanceOrModifier.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == NamespaceAwareElement.class) {
            switch (baseFeatureID) {
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
                return AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == AnnotationInstanceOrModifier.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == NamespaceAwareElement.class) {
            switch (baseOperationID) {
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING:
                return AnnotationsPackage.ANNOTATION_INSTANCE___GET_NAMESPACES_AS_STRING;
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES:
                return AnnotationsPackage.ANNOTATION_INSTANCE___GET_CLASSIFIER_AT_NAMESPACES;
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case AnnotationsPackage.ANNOTATION_INSTANCE___GET_NAMESPACES_AS_STRING:
            return getNamespacesAsString();
        case AnnotationsPackage.ANNOTATION_INSTANCE___GET_CLASSIFIER_AT_NAMESPACES:
            return getClassifierAtNamespaces();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (namespaces: ");
        result.append(namespaces);
        result.append(')');
        return result.toString();
    }

} //AnnotationInstanceImpl
