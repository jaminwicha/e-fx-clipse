/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.AttributeSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FuncTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NumberTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.PseudoClass;
import at.bestsolution.efxclipse.tooling.css.cssDsl.PseudoClassFunction;
import at.bestsolution.efxclipse.tooling.css.cssDsl.PseudoClassName;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StringTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SymbolTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UniversalSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.UrlTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.charset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_not;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.importExpression;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.page;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssDslPackageImpl extends EPackageImpl implements CssDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stylesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulesetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass css_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass css_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoClassNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoClassFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass universalSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wsTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funcTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorTokEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum css_notEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CssDslPackageImpl()
  {
    super(eNS_URI, CssDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CssDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CssDslPackage init()
  {
    if (isInited) return (CssDslPackage)EPackage.Registry.INSTANCE.getEPackage(CssDslPackage.eNS_URI);

    // Obtain or create and register package
    CssDslPackageImpl theCssDslPackage = (CssDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CssDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CssDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCssDslPackage.createPackageContents();

    // Initialize created meta-data
    theCssDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCssDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CssDslPackage.eNS_URI, theCssDslPackage);
    return theCssDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstylesheet()
  {
    return stylesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Charset()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Imports()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Ruleset()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Media()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Page()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcharset()
  {
    return charsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcharset_Charset()
  {
    return (EAttribute)charsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getimportExpression()
  {
    return importExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimportExpression_Value()
  {
    return (EAttribute)importExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpage_PseudoPage()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpage_Declarations()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmedia()
  {
    return mediaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmedia_Medialist()
  {
    return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmedia_Rulesets()
  {
    return (EReference)mediaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleset()
  {
    return rulesetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleset_Selectors()
  {
    return (EReference)rulesetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleset_Declarations()
  {
    return (EReference)rulesetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselector_Simpleselectors()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getselector_Combinator()
  {
    return (EAttribute)selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselector_Selector()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_selector()
  {
    return simple_selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_selector_Element()
  {
    return (EReference)simple_selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_selector_Universal()
  {
    return (EReference)simple_selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsimple_selector_SubSelectors()
  {
    return (EReference)simple_selectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCssSelector()
  {
    return cssSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcss_declaration()
  {
    return css_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcss_declaration_Property()
  {
    return (EReference)css_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcss_declaration_ValueTokens()
  {
    return (EReference)css_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcss_declaration_Important()
  {
    return (EAttribute)css_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcss_property()
  {
    return css_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcss_property_Name()
  {
    return (EAttribute)css_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoClass()
  {
    return pseudoClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPseudoClass_Name()
  {
    return (EAttribute)pseudoClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoClassName()
  {
    return pseudoClassNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoClassFunction()
  {
    return pseudoClassFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPseudoClassFunction_Params()
  {
    return (EReference)pseudoClassFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCssTok()
  {
    return cssTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_Params()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURLType()
  {
    return urlTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURLType_MediaList()
  {
    return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURLType_Url()
  {
    return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeSelector()
  {
    return attributeSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSelector_Name()
  {
    return (EAttribute)attributeSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSelector_Op()
  {
    return (EAttribute)attributeSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSelector_Value()
  {
    return (EAttribute)attributeSelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassSelector()
  {
    return classSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassSelector_Name()
  {
    return (EAttribute)classSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementSelector()
  {
    return elementSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementSelector_Name()
  {
    return (EAttribute)elementSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniversalSelector()
  {
    return universalSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUniversalSelector_Namespece()
  {
    return (EAttribute)universalSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdSelector()
  {
    return idSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdSelector_Name()
  {
    return (EAttribute)idSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolTok()
  {
    return symbolTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolTok_Symbol()
  {
    return (EAttribute)symbolTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWSTok()
  {
    return wsTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringTok()
  {
    return stringTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringTok_Value()
  {
    return (EAttribute)stringTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuncTok()
  {
    return funcTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFuncTok_Func()
  {
    return (EReference)funcTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberTok()
  {
    return numberTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberTok_Num()
  {
    return (EAttribute)numberTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberTok_Unit()
  {
    return (EAttribute)numberTokEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierTok()
  {
    return identifierTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierTok_Id()
  {
    return (EAttribute)identifierTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlTok()
  {
    return urlTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUrlTok_Url()
  {
    return (EReference)urlTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorTok()
  {
    return colorTokEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorTok_Color()
  {
    return (EAttribute)colorTokEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getcss_not()
  {
    return css_notEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslFactory getCssDslFactory()
  {
    return (CssDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stylesheetEClass = createEClass(STYLESHEET);
    createEReference(stylesheetEClass, STYLESHEET__CHARSET);
    createEReference(stylesheetEClass, STYLESHEET__IMPORTS);
    createEReference(stylesheetEClass, STYLESHEET__RULESET);
    createEReference(stylesheetEClass, STYLESHEET__MEDIA);
    createEReference(stylesheetEClass, STYLESHEET__PAGE);

    charsetEClass = createEClass(CHARSET);
    createEAttribute(charsetEClass, CHARSET__CHARSET);

    importExpressionEClass = createEClass(IMPORT_EXPRESSION);
    createEAttribute(importExpressionEClass, IMPORT_EXPRESSION__VALUE);

    pageEClass = createEClass(PAGE);
    createEAttribute(pageEClass, PAGE__PSEUDO_PAGE);
    createEReference(pageEClass, PAGE__DECLARATIONS);

    mediaEClass = createEClass(MEDIA);
    createEAttribute(mediaEClass, MEDIA__MEDIALIST);
    createEReference(mediaEClass, MEDIA__RULESETS);

    rulesetEClass = createEClass(RULESET);
    createEReference(rulesetEClass, RULESET__SELECTORS);
    createEReference(rulesetEClass, RULESET__DECLARATIONS);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__SIMPLESELECTORS);
    createEAttribute(selectorEClass, SELECTOR__COMBINATOR);
    createEReference(selectorEClass, SELECTOR__SELECTOR);

    simple_selectorEClass = createEClass(SIMPLE_SELECTOR);
    createEReference(simple_selectorEClass, SIMPLE_SELECTOR__ELEMENT);
    createEReference(simple_selectorEClass, SIMPLE_SELECTOR__UNIVERSAL);
    createEReference(simple_selectorEClass, SIMPLE_SELECTOR__SUB_SELECTORS);

    cssSelectorEClass = createEClass(CSS_SELECTOR);

    css_declarationEClass = createEClass(CSS_DECLARATION);
    createEReference(css_declarationEClass, CSS_DECLARATION__PROPERTY);
    createEReference(css_declarationEClass, CSS_DECLARATION__VALUE_TOKENS);
    createEAttribute(css_declarationEClass, CSS_DECLARATION__IMPORTANT);

    css_propertyEClass = createEClass(CSS_PROPERTY);
    createEAttribute(css_propertyEClass, CSS_PROPERTY__NAME);

    pseudoClassEClass = createEClass(PSEUDO_CLASS);
    createEAttribute(pseudoClassEClass, PSEUDO_CLASS__NAME);

    pseudoClassNameEClass = createEClass(PSEUDO_CLASS_NAME);

    pseudoClassFunctionEClass = createEClass(PSEUDO_CLASS_FUNCTION);
    createEReference(pseudoClassFunctionEClass, PSEUDO_CLASS_FUNCTION__PARAMS);

    cssTokEClass = createEClass(CSS_TOK);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__PARAMS);

    urlTypeEClass = createEClass(URL_TYPE);
    createEAttribute(urlTypeEClass, URL_TYPE__MEDIA_LIST);
    createEAttribute(urlTypeEClass, URL_TYPE__URL);

    attributeSelectorEClass = createEClass(ATTRIBUTE_SELECTOR);
    createEAttribute(attributeSelectorEClass, ATTRIBUTE_SELECTOR__NAME);
    createEAttribute(attributeSelectorEClass, ATTRIBUTE_SELECTOR__OP);
    createEAttribute(attributeSelectorEClass, ATTRIBUTE_SELECTOR__VALUE);

    classSelectorEClass = createEClass(CLASS_SELECTOR);
    createEAttribute(classSelectorEClass, CLASS_SELECTOR__NAME);

    elementSelectorEClass = createEClass(ELEMENT_SELECTOR);
    createEAttribute(elementSelectorEClass, ELEMENT_SELECTOR__NAME);

    universalSelectorEClass = createEClass(UNIVERSAL_SELECTOR);
    createEAttribute(universalSelectorEClass, UNIVERSAL_SELECTOR__NAMESPECE);

    idSelectorEClass = createEClass(ID_SELECTOR);
    createEAttribute(idSelectorEClass, ID_SELECTOR__NAME);

    symbolTokEClass = createEClass(SYMBOL_TOK);
    createEAttribute(symbolTokEClass, SYMBOL_TOK__SYMBOL);

    wsTokEClass = createEClass(WS_TOK);

    stringTokEClass = createEClass(STRING_TOK);
    createEAttribute(stringTokEClass, STRING_TOK__VALUE);

    funcTokEClass = createEClass(FUNC_TOK);
    createEReference(funcTokEClass, FUNC_TOK__FUNC);

    numberTokEClass = createEClass(NUMBER_TOK);
    createEAttribute(numberTokEClass, NUMBER_TOK__NUM);
    createEAttribute(numberTokEClass, NUMBER_TOK__UNIT);

    identifierTokEClass = createEClass(IDENTIFIER_TOK);
    createEAttribute(identifierTokEClass, IDENTIFIER_TOK__ID);

    urlTokEClass = createEClass(URL_TOK);
    createEReference(urlTokEClass, URL_TOK__URL);

    colorTokEClass = createEClass(COLOR_TOK);
    createEAttribute(colorTokEClass, COLOR_TOK__COLOR);

    // Create enums
    css_notEEnum = createEEnum(CSS_NOT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    pseudoClassEClass.getESuperTypes().add(this.getCssSelector());
    pseudoClassNameEClass.getESuperTypes().add(this.getPseudoClass());
    pseudoClassFunctionEClass.getESuperTypes().add(this.getPseudoClass());
    urlTypeEClass.getESuperTypes().add(this.getimportExpression());
    attributeSelectorEClass.getESuperTypes().add(this.getCssSelector());
    classSelectorEClass.getESuperTypes().add(this.getCssSelector());
    elementSelectorEClass.getESuperTypes().add(this.getCssSelector());
    universalSelectorEClass.getESuperTypes().add(this.getCssSelector());
    idSelectorEClass.getESuperTypes().add(this.getCssSelector());
    symbolTokEClass.getESuperTypes().add(this.getCssTok());
    wsTokEClass.getESuperTypes().add(this.getCssTok());
    stringTokEClass.getESuperTypes().add(this.getCssTok());
    funcTokEClass.getESuperTypes().add(this.getCssTok());
    numberTokEClass.getESuperTypes().add(this.getCssTok());
    identifierTokEClass.getESuperTypes().add(this.getCssTok());
    urlTokEClass.getESuperTypes().add(this.getCssTok());
    colorTokEClass.getESuperTypes().add(this.getCssTok());

    // Initialize classes and features; add operations and parameters
    initEClass(stylesheetEClass, stylesheet.class, "stylesheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstylesheet_Charset(), this.getcharset(), null, "charset", null, 0, 1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstylesheet_Imports(), this.getimportExpression(), null, "imports", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstylesheet_Ruleset(), this.getruleset(), null, "ruleset", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstylesheet_Media(), this.getmedia(), null, "media", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstylesheet_Page(), this.getpage(), null, "page", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charsetEClass, charset.class, "charset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcharset_Charset(), ecorePackage.getEString(), "charset", null, 0, 1, charset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importExpressionEClass, importExpression.class, "importExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getimportExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, importExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, page.class, "page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpage_PseudoPage(), ecorePackage.getEString(), "pseudoPage", null, 0, 1, page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpage_Declarations(), this.getcss_declaration(), null, "declarations", null, 0, -1, page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaEClass, media.class, "media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmedia_Medialist(), ecorePackage.getEString(), "medialist", null, 0, 1, media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmedia_Rulesets(), this.getruleset(), null, "rulesets", null, 0, -1, media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulesetEClass, ruleset.class, "ruleset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getruleset_Selectors(), this.getselector(), null, "selectors", null, 0, -1, ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleset_Declarations(), this.getcss_declaration(), null, "declarations", null, 0, -1, ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, selector.class, "selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselector_Simpleselectors(), this.getsimple_selector(), null, "simpleselectors", null, 0, -1, selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getselector_Combinator(), ecorePackage.getEString(), "combinator", null, 0, 1, selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselector_Selector(), this.getselector(), null, "selector", null, 0, 1, selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_selectorEClass, simple_selector.class, "simple_selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsimple_selector_Element(), this.getCssSelector(), null, "element", null, 0, 1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_selector_Universal(), this.getCssSelector(), null, "universal", null, 0, 1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsimple_selector_SubSelectors(), this.getCssSelector(), null, "subSelectors", null, 0, -1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssSelectorEClass, CssSelector.class, "CssSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(css_declarationEClass, css_declaration.class, "css_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcss_declaration_Property(), this.getcss_property(), null, "property", null, 0, 1, css_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcss_declaration_ValueTokens(), this.getCssTok(), null, "valueTokens", null, 0, -1, css_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcss_declaration_Important(), ecorePackage.getEBoolean(), "important", null, 0, 1, css_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(css_propertyEClass, css_property.class, "css_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcss_property_Name(), ecorePackage.getEString(), "name", null, 0, 1, css_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoClassEClass, PseudoClass.class, "PseudoClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPseudoClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, PseudoClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoClassNameEClass, PseudoClassName.class, "PseudoClassName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pseudoClassFunctionEClass, PseudoClassFunction.class, "PseudoClassFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPseudoClassFunction_Params(), this.getCssTok(), null, "params", null, 0, -1, PseudoClassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssTokEClass, CssTok.class, "CssTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionEClass, function.class, "function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_Params(), this.getCssTok(), null, "params", null, 0, -1, function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlTypeEClass, URLType.class, "URLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURLType_MediaList(), ecorePackage.getEString(), "mediaList", null, 0, 1, URLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURLType_Url(), ecorePackage.getEString(), "url", null, 0, 1, URLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeSelectorEClass, AttributeSelector.class, "AttributeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeSelector_Op(), ecorePackage.getEString(), "op", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeSelector_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classSelectorEClass, ClassSelector.class, "ClassSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementSelectorEClass, ElementSelector.class, "ElementSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(universalSelectorEClass, UniversalSelector.class, "UniversalSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUniversalSelector_Namespece(), ecorePackage.getEString(), "namespece", null, 0, 1, UniversalSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idSelectorEClass, IdSelector.class, "IdSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolTokEClass, SymbolTok.class, "SymbolTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbolTok_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, SymbolTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wsTokEClass, WSTok.class, "WSTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringTokEClass, StringTok.class, "StringTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringTok_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funcTokEClass, FuncTok.class, "FuncTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFuncTok_Func(), this.getfunction(), null, "func", null, 0, 1, FuncTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberTokEClass, NumberTok.class, "NumberTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberTok_Num(), ecorePackage.getEString(), "num", null, 0, 1, NumberTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberTok_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, NumberTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierTokEClass, IdentifierTok.class, "IdentifierTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifierTok_Id(), ecorePackage.getEString(), "id", null, 0, 1, IdentifierTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlTokEClass, UrlTok.class, "UrlTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUrlTok_Url(), this.getURLType(), null, "url", null, 0, 1, UrlTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorTokEClass, ColorTok.class, "ColorTok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorTok_Color(), ecorePackage.getEString(), "color", null, 0, 1, ColorTok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(css_notEEnum, css_not.class, "css_not");
    addEEnumLiteral(css_notEEnum, css_not.NOT);

    // Create resource
    createResource(eNS_URI);
  }

} //CssDslPackageImpl
