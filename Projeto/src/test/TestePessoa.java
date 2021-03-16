package test;

import negocio.Aluno;
import negocio.Curso;
import negocio.Pessoa;
import negocio.Professor;

public class TestePessoa {
    public static void main(String[] args) {
		
		Curso curso1 = new Curso(243, "Ciência da Computação");
		Curso curso2 = new Curso(765, "Medicina");
		
		System.out.println("Cursos: \n");
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println("------------------" + "\n");

		//Altera o nome do curso1
		curso1.setNome("Ciências Contábeis");

		//Altera o código do curso2
		curso2.setCodigo(456);
		
		//Retorna informações do curso depois da alteração
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println("------------------" + "\n");

		Pessoa aluno1 = new Aluno("Paula", "12389053", 29, curso1);
		Pessoa aluno2 = new Aluno("Paula", "12389053", 29, curso1);
		Pessoa aluno3 = new Aluno("Paula", "12389053", 29, curso1);

		Pessoa professor1 = new Professor("João", "184435659", 35, 8600);

        System.out.println("Alunos: \n");
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());
		System.out.println(aluno3.toString());
		System.out.println("------------------" + "\n");
		
		//Realiza alterações em aluno1
		aluno1.setCpf("897543897654");
		aluno1.setIdade(25);

		//Retorna informações de um aluno após atualização
		System.out.println(aluno1.toString());
		System.out.println("------------------" + "\n");

		System.out.println("Professores: \n");
		System.out.println(professor1.toString());
	}

}