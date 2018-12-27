package org.javabrains.entities;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<String, String> answerMap;
	
	public Question(int id, String name, Map<String, String> answerMap){
		this.id = id;
		this.name = name;
		this.answerMap = answerMap;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getanswerMap() {
		return answerMap;
	}
	public void setanswerMap(Map<String, String> answerMap) {
		this.answerMap = answerMap;
	}
	
	public void displayQuestion(){
		System.out.println("Question: "+name);
	}
	
	public void displayAnswers(){
		Set<Entry<String, String>> answerSet = answerMap.entrySet();
		Iterator<Entry<String, String>> iterator = answerSet.iterator();
		
		int count=0;
		while(iterator.hasNext()){
			count++;
			System.out.println("Answer "+count+". :"+iterator.next());
		}
	}
}
