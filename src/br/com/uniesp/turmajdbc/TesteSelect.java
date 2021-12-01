package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class TesteSelect {

	public static void main(String[] args) throws SQLException{
		Conexao cnx = new Conexao();
		Connection connection = cnx.conexao();
		
		ArrayList<Object> lista = new ArrayList();
		
		Turma turma = new Turma("Turma de Direito", 03);
		turma.getAlunos().add(lista);
		
		PreparedStatement stm = connection.prepareStatement("SELECT id, nome, email FROM aluno");
		stm.execute();
		
		ResultSet result = stm.getResultSet();
		while(result.next()) {
			lista.add(result.getInt(1));
			lista.add(result.getString(2));
			lista.add(result.getString(3));
			
		
			System.out.println(lista);
		}
		
		result.close();
		stm.close();
		connection.close();
		

	}

}
