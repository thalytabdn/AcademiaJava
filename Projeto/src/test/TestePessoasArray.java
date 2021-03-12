package test;

import models.Aluno;
import models.Curso;
import models.Pessoa;
import models.Professor;
import repository.RepositorioPessoasArray;

public class TestePessoasArray {

    public static void main(String[] args) {
		
		RepositorioPessoasArray repPessoas = new RepositorioPessoasArray(5);
		
		//Criando os cursos
		Curso curso1 = new Curso(165, "Administração");
		Curso curso2 = new Curso(166, "Ciência da Computação");

		//Criando os alunos e professores
		Pessoa pessoa1 = new Aluno("Jorge","176584921", 20, curso1);
		Pessoa pessoa2 = new Aluno("Karen", "781239456", 22, curso1);
		Pessoa pessoa3 = new Aluno("Pedro", "654321876", 21, curso2);
		Pessoa pessoa4 = new Professor("Camilla", "18766321", 27, 1200);
		Pessoa pessoa5 = new Professor("José", "456789123", 58, 3700);

		//Inserindo pessoas 
		repPessoas.inserir(pessoa1);
		repPessoas.inserir(pessoa2);
		repPessoas.inserir(pessoa3);
		repPessoas.inserir(pessoa4);
		repPessoas.inserir(pessoa5);
		
		//Procurando pelo cpf
		System.out.println(repPessoas.procurar("176584921"));
		System.out.println(repPessoas.procurar("18766321"));
		System.out.println(repPessoas.procurar("654321876"));
		System.out.println(repPessoas.procurar("781239456"));

		//Removendo pessoas
		repPessoas.remover("18766321");

		//Pessoa não existe
		System.out.println(repPessoas.procurar("987654")); 

	}
    
}
