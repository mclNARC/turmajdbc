package br.com.uniesp.turmajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

import com.mysql.cj.xdevapi.Statement;

public class TesteInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		Collection<Aluno> alunos = new HashSet<>();
//		alunos.add(new Aluno(01,"Mateus", "mateus.silva@uniesp.com.br"));
//		alunos.add(new Aluno(02,"João", "joao23@uniesp.com.br"));
//		alunos.add(new Aluno(03,"Maria", "maria_jp@uniesp.com.br"));
//		alunos.add(new Aluno(04,"Ana", "ana2015@uniesp.com.br"));
//		alunos.add(new Aluno(05,"Pedro", "pdr_crb@uniesp.com.br"));
//		
//		Turma turma = new Turma("Turma de Sistemas de Info", 01, alunos);
	
		Conexao cnx = new Conexao();
		Connection connection = cnx.conexao();
		
		connection.setAutoCommit(false);
		try{
		PreparedStatement stm = connection.prepareStatement("INSERT INTO aluno (id,nome,email) VALUES (?,?,?)");
		addParemeter(01, "Mateus", "mateus.silva@uniesp.com.br", stm);
		addParemeter(02, "João", "joao23@uniesp.com.br", stm);
		addParemeter(03, "Maria", "maria_jp@uniesp.com.br", stm);
		addParemeter(04, "Ana", "ana2015@uniesp.com.br", stm);
		addParemeter(05, "Pedro", "pdr_crb@uniesp.com.br", stm);
		addParemeter(06, "Livia", "livs009.22@uniesp.com.br", stm);
		} 
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			connection.rollback();
		}
		
	
		
		
		
		connection.commit();
	
	}
	private static void addParemeter(int id,String nome, String email, PreparedStatement stm) throws SQLException {
		stm.setInt(1, id);
		stm.setString(2, nome);
		stm.setNString(3, email);
		
		stm.execute();
	}
}
