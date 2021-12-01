package br.com.uniesp.turmajdbc;

public class Aluno {
	private int id;
	private String nome;
	private String email;
	
	public Aluno(Integer id, String nome, String email) {
		if (nome.equals(null)&& id.equals(null)) {
			throw new  NullPointerException("Invalid parameter, 'nome' or 'id' couldn't be null");
		}
		
		
		this.email = email;
		this.id = id;
		this.nome = nome;
	
	}

	public String getNome() {
		return this.nome;
	}
	public String getEmail() {
		return this.email;
	}
	public int getId() {
		return this.id;

	}

	@Override
	public String toString() {
		
		return "[Nome: " + this.nome + ", " + " Email:   " +  this.email;
	}
}
