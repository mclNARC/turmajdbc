package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteDelete {

	public static void main(String[] args) throws SQLException{
		Conexao cnx = new Conexao();
		Connection connection = cnx.conexao();

		PreparedStatement stm = connection.prepareStatement("DELETE FROM aluno WHERE ID = ?");
		stm.setInt(1, 06);
		stm.execute();
		
		Integer modificadas = stm.getUpdateCount();
		System.out.println(modificadas);
		stm.close();
		connection.close();
	
	}

}
