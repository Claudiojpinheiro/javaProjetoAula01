
package main; // Identificação do pacote

import java.util.Scanner;
import java.util.UUID;

import entities.Cliente;

public class Main { // Declaração da Classe

	public static void main(String[] args) { // Método/ função para executar a classe

		System.out.println("\n*** CADASTRO DE CLIENTE ****\n");

		// criando um objeto para a classe cliente
		Cliente cliente = new Cliente();

		// criando um objeto para a classe Scanner
		Scanner scanner = new Scanner(System.in);

		// Scanner, espera a pessoa escrever e dar enter

		cliente.setId(UUID.randomUUID());
		
		System.out.println("\nINFORME O NOME DO CLIENTE: ");
		cliente.setNome(scanner.nextLine()); // Digitou e deu enter, ele captura

		System.out.println("\nINFORME O CPF DO CLIENTE: ");
		cliente.setCpf(scanner.nextLine());

		System.out.println("\nINFORME O EMAIL DO CLIENTE: ");
		cliente.setEmail(scanner.nextLine());

		// imprimindo os dados do cliente
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("ID.....: " + cliente.getId());
		System.out.println("Nome...: " + cliente.getNome());
		System.out.println("CPF....: " + cliente.getCpf());
		System.out.println("EMAIL.: " + cliente.getEmail());

		scanner.close();
	}

}
