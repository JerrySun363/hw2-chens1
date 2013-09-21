

/* First created by JCasGen Sat Sep 21 00:23:38 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.FSList;


/** Used for storing tokens from a single question. When using tokens overlap method, there is no need to analyze the question again to identify the tokens.
 * Updated by JCasGen Sat Sep 21 00:54:20 EDT 2013
 * XML source: /home/jerry/workspace2/hw2-chens1/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class QuestionTokens extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionTokens.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected QuestionTokens() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QuestionTokens(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QuestionTokens(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QuestionTokens(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets The tokens in a specific question. Since usually one JCas usually holds one question, there is no need to hold an Question in it.
   * @generated */
  public FSList getTokens() {
    if (QuestionTokens_Type.featOkTst && ((QuestionTokens_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.QuestionTokens");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuestionTokens_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens in a specific question. Since usually one JCas usually holds one question, there is no need to hold an Question in it. 
   * @generated */
  public void setTokens(FSList v) {
    if (QuestionTokens_Type.featOkTst && ((QuestionTokens_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.QuestionTokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuestionTokens_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    