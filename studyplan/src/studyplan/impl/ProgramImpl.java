/**
 */
package studyplan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import studyplan.Course;
import studyplan.Program;
import studyplan.ProgramTypeAndDuration;
import studyplan.Semester;
import studyplan.Specialization;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyplan.impl.ProgramImpl#getType <em>Type</em>}</li>
 *   <li>{@link studyplan.impl.ProgramImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyplan.impl.ProgramImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplan.impl.ProgramImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgramTypeAndDuration TYPE_EDEFAULT = ProgramTypeAndDuration.BACHELOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProgramTypeAndDuration type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramTypeAndDuration getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ProgramTypeAndDuration newType) {
		ProgramTypeAndDuration oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.PROGRAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyplanPackage.PROGRAM__SPECIALIZATIONS);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyplanPackage.PROGRAM__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyplanPackage.PROGRAM__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.PROGRAM__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case StudyplanPackage.PROGRAM__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyplanPackage.PROGRAM__NAME:
				return getName();
			case StudyplanPackage.PROGRAM__TYPE:
				return getType();
			case StudyplanPackage.PROGRAM__SPECIALIZATIONS:
				return getSpecializations();
			case StudyplanPackage.PROGRAM__SEMESTERS:
				return getSemesters();
			case StudyplanPackage.PROGRAM__MANDATORY_COURSES:
				return getMandatoryCourses();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case StudyplanPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyplanPackage.PROGRAM__TYPE:
				setType((ProgramTypeAndDuration)newValue);
				return;
			case StudyplanPackage.PROGRAM__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyplanPackage.PROGRAM__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyplanPackage.PROGRAM__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyplanPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyplanPackage.PROGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StudyplanPackage.PROGRAM__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyplanPackage.PROGRAM__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyplanPackage.PROGRAM__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyplanPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyplanPackage.PROGRAM__TYPE:
				return type != TYPE_EDEFAULT;
			case StudyplanPackage.PROGRAM__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyplanPackage.PROGRAM__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyplanPackage.PROGRAM__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
