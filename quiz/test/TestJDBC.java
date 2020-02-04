package fr.epita.quiz.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) throws SQLException {
	//testConnection
		
		Connection connection = getConnection();
		connection.prepareStatement("CREATE TABLE MCQQUESTIONS(ID INT AUTO_INCREMENT PRIMARY KEY, QUESTION VARCHAR(500), DIFFICULTY INT);");
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO MCQQUESTIONS (QUESTION, DIFFICULTY) VALUES('What is Java?', 2);");
		preparedStatement.setInt(1, question.getConnection());
		preparedStatement.setInt(2, question.getDifficulty());
		int id = preparedStatement.executeUpdate();
		
	//public TestJDBC() {
		//
		//
		String url = "jdbc:h2:C:/TUNG/EPITA/Java";
		String user = "sa";
		String password = "";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		String schema = connection.getSchema();
		
		boolean success = "PUBLIC".equals(schema);
		
		System.out.println("Success ?" + success);
		
		
		
	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
