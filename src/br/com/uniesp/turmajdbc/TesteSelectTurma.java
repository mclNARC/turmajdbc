package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class TesteSelectTurma {

	public static void main(String[] args) throws SQLException {
		Conexao cnx = new Conexao();
		Connection connection = cnx.conexao();

		PreparedStatement stm = connection.prepareStatement("SELECT idaluno, idturma, descricao FROM turma");
		stm.execute();
		
		ResultSet result = stm.getResultSet();
		while(result.next()) {
			Integer idaluno = result.getInt("idaluno");
			Integer idturma = result.getInt("idturma");
			String descricao = result.getString("descricao");
			System.out.println(idaluno);
			System.out.println(idturma);
			System.out.println(descricao);
		}
		
		result.close();
		stm.close();
		connection.close();
		

	}

}
