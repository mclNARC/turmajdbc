package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TesteInsertTurma {

	public static void main(String[] args) throws SQLException {
		
		
		Conexao cnx = new Conexao();
		Connection connection = cnx.conexao();
		
		connection.setAutoCommit(false);
		try{
		PreparedStatement stm = connection.prepareStatement("INSERT INTO turmas (idturma, descricao) VALUES (?,?)");
		addParemeter(0,  "Turma de ADM", stm);
		addParemeter(0,  "Turma de Sistemas de Informações", stm);
		addParemeter(0,  "Turma de Direito", stm);
		addParemeter(0,  "Turma de Enfermagem", stm);
		addParemeter(0,  "Turma de Culinária", stm);
		
		} 
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			connection.rollback();
		}
		
	
		
		
		
		connection.commit();	
	

	}
	private static void addParemeter( int idturma, String descricao, PreparedStatement stm) throws SQLException {
		stm.setInt(1, idturma);
		stm.setNString(2, descricao);
		
		stm.execute();
	}
}
