/**
 */
package Setgame.impl;

import Setgame.Card;
import Setgame.SetgamePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Setgame.impl.CardImpl#getColor <em>Color</em>}</li>
 *   <li>{@link Setgame.impl.CardImpl#getForm <em>Form</em>}</li>
 *   <li>{@link Setgame.impl.CardImpl#getFilling <em>Filling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Enumerator color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Enumerator form = FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilling() <em>Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilling()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator FILLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilling() <em>Filling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilling()
	 * @generated
	 * @ordered
	 */
	protected Enumerator filling = FILLING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetgamePackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Enumerator newColor) {
		Enumerator oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetgamePackage.CARD__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Enumerator newForm) {
		Enumerator oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetgamePackage.CARD__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getFilling() {
		return filling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilling(Enumerator newFilling) {
		Enumerator oldFilling = filling;
		filling = newFilling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetgamePackage.CARD__FILLING, oldFilling, filling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetgamePackage.CARD__COLOR:
				return getColor();
			case SetgamePackage.CARD__FORM:
				return getForm();
			case SetgamePackage.CARD__FILLING:
				return getFilling();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SetgamePackage.CARD__COLOR:
				setColor((Enumerator)newValue);
				return;
			case SetgamePackage.CARD__FORM:
				setForm((Enumerator)newValue);
				return;
			case SetgamePackage.CARD__FILLING:
				setFilling((Enumerator)newValue);
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
			case SetgamePackage.CARD__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case SetgamePackage.CARD__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case SetgamePackage.CARD__FILLING:
				setFilling(FILLING_EDEFAULT);
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
			case SetgamePackage.CARD__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case SetgamePackage.CARD__FORM:
				return FORM_EDEFAULT == null ? form != null : !FORM_EDEFAULT.equals(form);
			case SetgamePackage.CARD__FILLING:
				return FILLING_EDEFAULT == null ? filling != null : !FILLING_EDEFAULT.equals(filling);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Color: ");
		result.append(color);
		result.append(", Form: ");
		result.append(form);
		result.append(", Filling: ");
		result.append(filling);
		result.append(')');
		return result.toString();
	}

} //CardImpl
