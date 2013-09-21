package edu.cmu.hw2.annotators;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.internal.util.TextTokenizer;
import org.apache.uima.jcas.JCas;

import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.Question;
import edu.cmu.deiis.types.Token;



public class TokenAnnotator extends JCasAnnotator_ImplBase {
  private JCas aJCas = null; 
  private int globalPosition = 0;
  private static int QUESTION=0;
  private static int ANSWER=1;
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    //reset the documents and the globalPosition
    this.aJCas= aJCas;
    this.globalPosition=0;
    FSIndex questionIndex = aJCas.getAnnotationIndex(Question.type);
    FSIndex answerIndex = aJCas.getAnnotationIndex(Answer.type);
    
    Iterator questionIterator = questionIndex.iterator();
    Iterator answerIterator   = answerIndex.iterator();
    //parse the tokens in the 
    while(questionIterator.hasNext()){
          Question question = ((Question)questionIterator.next());
          String text = question.getCoveredText();
          this.globalPosition = question.getBegin();
          parseTokens(text);
          
    }
    
    while (answerIterator.hasNext()){
          Answer answer = ((Answer)answerIterator.next());
          String text = answer.getCoveredText();
          this.globalPosition = answer.getBegin();
          parseTokens(text);
    }
  }
  
  public void parseTokens(String text){
         TextTokenizer t =  new  TextTokenizer(text);
         t.setSeparators(".,!?");
         t.setShowWhitespace(false);
         t.setShowSeparators(false);
         int offset = 0;
         while(t.hasNext()){
           int begin = this.globalPosition+offset;
           offset+=t.nextToken().length();
           int end = this.globalPosition+offset;
           Token token = new Token(aJCas, begin, end);
           token.setConfidence(1.0);
           token.setCasProcessorId(this.getClass().getName());
           token.addToIndexes(aJCas);
           offset+=1; 
         }   
  }

}
