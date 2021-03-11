package test;

import models.Aluno;
import models.Curso;
import models.Pessoa;
import models.Professor;
import repository.RepositorioPessoasArray;

public class TestPessoasArray {

    public static void main(String[] args) {
		
		RepositorioPessoasArray repPessoas = new RepositorioPessoasArray(5);
		
		// Criando os cursos
		Curso adm = new Curso(165, "administração");
		Curso cc = new Curso(166, "computação");

		// Criando os alunos e professores
		Pessoa Pessoa1 = new Aluno("Jorge","176584921", 20, adm);
		Pessoa Pessoa2 = new Professor("Camilla", "18766321", 27, 1200);
		Pessoa Pessoa3 = new Aluno("Pedro", "654321876", 21, cc);
		Pessoa Pessoa4 = new Professor("José", "456789123", 58, 3700);
		Pessoa Pessoa5 = new Aluno("Karen", "781239456", 22, adm);

		// Inserindo pessoas 
		repPessoas.inserir(Pessoa1);
		repPessoas.inserir(Pessoa2);
		repPessoas.inserir(Pessoa3);
		repPessoas.inserir(Pessoa4);
		repPessoas.inserir(Pessoa5);
		
		
		// Procurando pelo cpf
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
