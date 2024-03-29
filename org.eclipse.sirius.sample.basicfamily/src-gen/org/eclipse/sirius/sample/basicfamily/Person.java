/**
 */
package org.eclipse.sirius.sample.basicfamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicfamily.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicfamily.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicfamily.Person#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicfamily.Person#getFather <em>Father</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicfamily.Person#getMother <em>Mother</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicfamily.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.basicfamily.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson_Children()
	 * @see org.eclipse.sirius.sample.basicfamily.Person#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.sample.basicfamily.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson_Parent()
	 * @see org.eclipse.sirius.sample.basicfamily.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParent();

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Man)
	 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson_Father()
	 * @model derived="true"
	 * @generated
	 */
	Man getFather();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicfamily.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Man value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Woman)
	 * @see org.eclipse.sirius.sample.basicfamily.BasicfamilyPackage#getPerson_Mother()
	 * @model derived="true"
	 * @generated
	 */
	Woman getMother();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicfamily.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Woman value);

} // Person
