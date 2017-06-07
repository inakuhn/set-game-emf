/**
 */
package Setgame;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Setgame.Card#getColor <em>Color</em>}</li>
 *   <li>{@link Setgame.Card#getForm <em>Form</em>}</li>
 *   <li>{@link Setgame.Card#getFilling <em>Filling</em>}</li>
 * </ul>
 *
 * @see Setgame.SetgamePackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Enumerator)
	 * @see Setgame.SetgamePackage#getCard_Color()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Enumerator getColor();

	/**
	 * Sets the value of the '{@link Setgame.Card#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see #setForm(Enumerator)
	 * @see Setgame.SetgamePackage#getCard_Form()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Enumerator getForm();

	/**
	 * Sets the value of the '{@link Setgame.Card#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Filling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filling</em>' attribute.
	 * @see #setFilling(Enumerator)
	 * @see Setgame.SetgamePackage#getCard_Filling()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Enumerator getFilling();

	/**
	 * Sets the value of the '{@link Setgame.Card#getFilling <em>Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filling</em>' attribute.
	 * @see #getFilling()
	 * @generated
	 */
	void setFilling(Enumerator value);

} // Card
