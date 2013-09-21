

/* First created by JCasGen Sat Sep 21 00:23:38 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** Maintain a AnswerTokens for each question. In this way, it can limit the range of tokens so that there is no need to analyze the wholr JCas object again.
 * Updated by JCasGen Sat Sep 21 00:54:20 EDT 2013
 * XML source: /home/jerry/workspace2/hw2-chens1/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnswerTokens extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerTokens.class);
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
  protected AnswerTokens() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerTokens(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerTokens(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerTokens(JCas jcas, int begin, int end) {
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

  /** getter for tokens - gets The list of tokens of each Answer. Convienient for Token Overlap method.
   * @generated */
  public FSList getTokens() {
    if (AnswerTokens_Type.featOkTst && ((AnswerTokens_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.AnswerTokens");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTokens_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The list of tokens of each Answer. Convienient for Token Overlap method. 
   * @generated */
  public void setTokens(FSList v) {
    if (AnswerTokens_Type.featOkTst && ((AnswerTokens_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.deiis.types.AnswerTokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerTokens_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets 
   * @generated */
  public Answer getAnswer() {
    if (AnswerTokens_Type.featOkTst && ((AnswerTokens_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.deiis.types.AnswerTokens");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTokens_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets  
   * @generated */
  public void setAnswer(Answer v) {
    if (AnswerTokens_Type.featOkTst && ((AnswerTokens_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.deiis.types.AnswerTokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerTokens_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    