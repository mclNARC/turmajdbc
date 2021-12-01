package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
		
	public Connection conexao() throws SQLException {
		return DriverManager.
				getConnection("jdbc:mysql://localhost/uniesp?useTimezone=true&serverTimezone=UTC",
						"root", "$mclNARC99");
		
	}

}
