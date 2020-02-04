package fr.epita.quiz.launcher;

import java.io.FileNotFoundException;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.datamodel.MCQQuestionCSVDAO;

public class Launcher {

	private static MCQQuestionCSVDAO dao = new MCQQuestionCSVDAO();

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		MCQQuestion question = new MCQQuestion();
		
		question.setId(1L);
		question.setDifficulty(3);
		question.setQuestion("What can we do with JDK?");
		question.setTopics(new String[] {"java", "jdk", "test"});
		
		//when 
		dao.create(question);
		dao.readAll();
		//then
		List<MCQQuestion> allQuestions = dao.readAll();
		MCQQuestion readQuestion = allQuestion.get(0);
		boolean sucess = readQuestion.getId().equals(MCQQuestion.getId));
		System.out.println("sucess?" + sucess);
	}

}
