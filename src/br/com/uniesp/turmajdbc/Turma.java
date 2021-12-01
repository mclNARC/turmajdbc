package br.com.uniesp.turmajdbc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Turma implements Comparable<Turma> {
	private String descricao;
	private int id ;
	private List<Object> alunos = new ArrayList<>();
	

	
	
	public Turma(String descricao, Integer id ) {
	
		if(id.equals(null)) {
				throw new NullPointerException("'id' Field couldnt be null !!!");
		}
			
				this.descricao = descricao;
				this.id = id;
				
		}






	public String getDescricao() {
		return descricao;
	}





	public int getId() {
		return id;
	}






	





	public List<Object> getAlunos() {
		return  alunos;
	}


	public void matricula(Aluno aluno) {
		this.alunos.add(aluno); 
		
		
	}



	@Override
	public int compareTo(Turma o) { //comparar descrição para saber se não é a mesma
		
		return this.descricao.compareTo(o.getDescricao());
	}
	
}
