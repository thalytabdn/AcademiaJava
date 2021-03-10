package test;

import models.Pessoa;
import repository.RepositorioPessoasArray;

public class TestPessoasArray {

    public static void main(String[] args) {
		
		RepositorioPessoasArray repPessoas = new RepositorioPessoasArray(5);

		Pessoa Pessoa1 = new Pessoa("Pessoa1", "123456", 20);
		Pessoa Pessoa2 = new Pessoa("Pessoa2", "987654", 18);
		Pessoa Pessoa3 = new Pessoa("Pessoa3", "654321", 21);
		Pessoa Pessoa4 = new Pessoa("Pessoa4", "456789", 19);
		Pessoa Pessoa5 = new Pessoa("Pessoa5", "789456", 22);

		repPessoas.inserir(Pessoa1);
		repPessoas.inserir(Pessoa2);
		repPessoas.inserir(Pessoa3);
		repPessoas.inserir(Pessoa4);
		repPessoas.inserir(Pessoa5);

		System.out.println(repPessoas.procurar("987654"));

		repPessoas.remover("987654");

		//Pessoa não existe
		System.out.println(repPessoas.procurar("987654")); 

	}
    
}
