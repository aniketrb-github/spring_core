package com.javabrains.entities;

import java.util.List;

public class Question {
	private int questionId;
	private String questionName;
	private List<String> answersList;
	
	public Question(int qid, String name, List<String> ansList) {
		this.questionId = qid;
		this.questionName = name;
		this.answersList = ansList;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public List<String> getAnswersList() {
		return answersList;
	}
	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}

	public void displayQuestion(){
		System.out.println("Question: "+questionName);
	}
	
	public void displayAnswers(){
		
		for(int count=0; count<answersList.size(); count++){
			System.out.println("Answer "+(count+1)+". : "+answersList.get(count));
		}
	}
}
