package insper.edu.br.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private Connection connection = null;
	int moedas = 10;
	public DAO() {
	    try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			connection = DriverManager.getConnection(
			"jdbc:mysql://localhost/meus_dados", "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getMoedas(){
		return moedas;
	}
	public void setMoedas(int moedas){
		this.moedas = moedas;
		
	}
	

}