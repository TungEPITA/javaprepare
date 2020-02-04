package fr.epita.quiz.datamodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.Configuration;

public class MCQQuestionCSVDAO {
	
	private static final String TOPIC_DELIMITER_SPLIT = "\\|\\|\\|";
	private static final String TOPIC_DELIMITER = "###"; //use "|\ |\|"
	private static final String COLUMN_DELIMITER = "@@@@";
	private PrintWriter writer;
	private File file = new File("application.csv");
	private static final String DATA_FILE = Configuration.getValueFromkey;

	public MCQQuestionCSVDAO(String path) {
		this.DATA_FILE = path;
	}

	public void create(MCQQuestion mcqQuestion) throws FileNotFoundException {
		//
		String formatted = String.valueOf(mcqQuestion.getId()) + COLUMN_DELIMITER;
		formatted += String.valueOf(mcqQuestion.getDifficulty()) + COLUMN_DELIMITER;
		formatted += mcqQuestion.getQuestion() + COLUMN_DELIMITER;
		String[] topics = mcqQuestion.getTopics();
		for (int i = 0; i < topics.length; i++) {
			formatted += topics[i] + TOPIC_DELIMITER;
		}
		// for != while: for, knowing the limit
		// TODO write the formatted string in a file
		
		
		try (PrintWriter writer = new PrintWriter(DATA_FILE);) {
				writer.println(formatted);
				
				
			} catch(FileNotFoundException e) {
				// Todo custom exception to be written
				e.printStackTrace();
			} //Finally, always run
			
		this.writer = new PrintWriter(new FileOutputStream(this.file, true));

		this.writer.println(formatted);
		this.writer.flush();

	}

	public void readAll() throws FileNotFoundException {

		// TODO read all the "line" values from the file
		//List<MCQQuestion> red
		Scanner scanner = new Scanner(this.file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();

			String[] parts = line.split(COLUMN_DELIMITER);
			Long id = Long.valueOf(parts[0]);
			Integer difficulty = Integer.valueOf(parts[1]);
			String question = parts[2];
			String[] readTopics = parts[3].split(TOPIC_DELIMITER);

			MCQQuestion reconstructed = new MCQQuestion();
			reconstructed.setDifficulty(difficulty);
			reconstructed.setId(id);
			reconstructed.setQuestion(question);
			reconstructed.setTopics(readTopics);
			//results.add(recontructed);

			
			
			
			
			System.out.println("Question " + reconstructed.getId() + ": " + reconstructed.getQuestion());
			System.out.print("Topics: ");
			for (int i = 0; i < reconstructed.getTopics().length; i++) {
				if (i < reconstructed.getTopics().length - 1) {
					System.out.print(reconstructed.getTopics()[i] + " - ");
				} else {
					System.out.print(reconstructed.getTopics()[i]);
					System.out.println("");
				}
			}
			System.out.println("Difficulty: " + reconstructed.getDifficulty() + "\n");
		}
		scanner.close();
	}

}