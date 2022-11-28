/**
 * generated by Xtext 2.28.0
 */
package fr.imt.dsl.ds.jallais.exo2.exo2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.dsl.ds.jallais.exo2.exo2.Section#getName <em>Name</em>}</li>
 *   <li>{@link fr.imt.dsl.ds.jallais.exo2.exo2.Section#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.imt.dsl.ds.jallais.exo2.exo2.Exo2Package#getSection()
 * @model
 * @generated
 */
public interface Section extends GuiComponent
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imt.dsl.ds.jallais.exo2.exo2.Exo2Package#getSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imt.dsl.ds.jallais.exo2.exo2.Section#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.dsl.ds.jallais.exo2.exo2.GuiComponent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.imt.dsl.ds.jallais.exo2.exo2.Exo2Package#getSection_Elements()
   * @model containment="true"
   * @generated
   */
  EList<GuiComponent> getElements();

} // Section
