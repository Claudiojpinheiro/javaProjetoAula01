package entities; //definição do pacote

import java.util.UUID;

public class Cliente { // declaração da classe

	// declaração dos atributos
	private UUID id;
	private String nome;
	private String email;
	private String cpf;

	// método para preencher/modificar o id do cliente
	public UUID getId() {
		return id;
	}

	// método para retornar o id do cliente
	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
