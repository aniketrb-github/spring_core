package com.javabrains.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javabrains.entities.Question;

public class ExecuteTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question question = (Question) context.getBean("question");
		
		question.displayQuestion();
		question.displayAnswers();
	}

}
