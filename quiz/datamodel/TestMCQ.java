package fr.epita.quiz.datamodel;

import java.util.Arrays;

public class TestMCQ {
	
	private static final String COLUMN_DELIMITER = ";";
	private static final String TOPIC_DELIMITTER = null;

	public static void main(String[] args) {
		
		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can we do with JDK");
		mcqQuestion.setTopics(new String[] {"java","compliation","environment"});
	    mcqQuestion.setId(1l);
				
		//formatting to csv
	    //id;difficulty,question_content;topics1|topics2[topics3
		String formatted = String.valueOf(mcqQuestion.getId())+ COLUMN_DELIMITER;
		formatted += String.valueOf(mcqQuestion.getDifficulty())+ COLUMN_DELIMITER;
		formatted += mcqQuestion.getQuestion()+ COLUMN_DELIMITER;
		String[] topics = mcqQuestion.getTopics();
		for (int i = 0; i < topics.length; i++) {
			formatted += topics[i] + "|";
		}
			System.out.println("formatted");
			System.out.println(formatted);
		
		String line = null;
		String[] parts = line.split(COLUMN_DELIMITER);
		System.out.println(Arrays.asList(parts));
		Long id = Long.valueOf(parts[0]);
		Integer difficulty = Integer.valueOf(parts[1]);
		String question = parts[2];
		String[] readTopics = parts[3].split(TOPIC_DELIMITTER);
		
		MCQQuestion reconstructed = new MCQQuestion();
		reconstructed.setDifficulty(difficulty);
		reconstructed.setQuestion(question);
		reconstructed.setTopics(readTopics);
		reconstructed.setId(id);
		
			
		
			
		}
			
		
		
		} 
		
		
	


