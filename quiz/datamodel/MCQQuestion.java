package fr.epita.quiz.datamodel;

import java.io.FileWriter;

public class MCQQuestion {
	
	private Long id;
	private String question;
	private Integer difficulty;//primitive type vs default value
	private String[] topics;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public String[] getTopics() {
		return topics;
	}
	public void setTopics(String[] topics) {
		this.topics = topics;
	}
	
	

	

}
