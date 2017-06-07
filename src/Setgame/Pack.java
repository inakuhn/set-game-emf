/**
 */
package Setgame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Setgame.Pack#getCards <em>Cards</em>}</li>
 * </ul>
 *
 * @see Setgame.SetgamePackage#getPack()
 * @model
 * @generated
 */
public interface Pack extends EObject {
	/**
	 * Returns the value of the '<em><b>Cards</b></em>' reference list.
	 * The list contents are of type {@link Setgame.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' reference list.
	 * @see Setgame.SetgamePackage#getPack_Cards()
	 * @model required="true" upper="81"
	 * @generated
	 */
	EList<Card> getCards();

} // Pack
