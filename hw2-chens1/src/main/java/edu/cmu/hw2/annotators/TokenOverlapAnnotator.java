package edu.cmu.hw2.annotators;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.deiis.types.AnswerScore;
import edu.cmu.deiis.types.AnswerTokens;
import edu.cmu.deiis.types.QuestionTokens;
import edu.cmu.deiis.types.Token;

public class TokenOverlapAnnotator  extends JCasAnnotator_ImplBase{
   FSArray questionTokens = null;   
   FSArray answerTokens=null;
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    FSIndex questionTokensIndex = aJCas.getAnnotationIndex(QuestionTokens.type);
    FSIndex answerTokensIndex = aJCas.getAnnotationIndex(AnswerTokens.type);
    Iterator questionTokensIterator = questionTokensIndex.iterator();
    Iterator answerTokensIterator = answerTokensIndex.iterator();
    
    while(questionTokensIterator.hasNext()){
      QuestionTokens qts = (QuestionTokens)questionTokensIterator.next();
      this.questionTokens = qts.getTokens();
    }
    
    while(answerTokensIterator.hasNext()){
      AnswerTokens ats = (AnswerTokens)answerTokensIterator.next();
      this.answerTokens = ats.getTokens();
      int count = 0;
      for(int i=0;i<this.questionTokens.size();i++){
        Token qs = (Token)this.questionTokens.get(i);
        for(int j=0;j<this.answerTokens.size();j++){
          Token as = (Token)this.answerTokens.get(j);
          if(qs.getCoveredText().equals(as.getCoveredText())){
            count ++;
          }
        }
      }
      AnswerScore answerS = new AnswerScore(aJCas);
      answerS.setBegin(ats.getBegin());
      answerS.setEnd(ats.getEnd());
      answerS.setAnswer(ats.getAnswer());
      answerS.setScore((count*1.0)/this.answerTokens.size());
      answerS.setConfidence(0.8);
      answerS.addToIndexes(aJCas);
      }
      
    }
    
    // TODO Auto-generated method stub
    
  }


