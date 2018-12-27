package org.javabrains.mains;

import org.javabrains.entities.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question question = (Question)context.getBean("questionBean");
		question.displayQuestion();
		question.displayAnswers();
	}

}
