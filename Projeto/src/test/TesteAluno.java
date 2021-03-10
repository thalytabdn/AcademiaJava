package test;

import models.Aluno;
import models.Curso;

public class TesteAluno {
    public static void main(String[] args) {
		
        //Criação de cursos
		Curso curso1 = new Curso(243, "Ciência da Computação");
		Curso curso2 = new Curso(765, "Medicina");
		
        //Retorna informações dos cursos
		System.out.println("Cursos: \n");
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println("\n" + "------------------" + "\n");

		//Altera o nome do curso1
		curso1.setNome("Ciências Contábeis");

		//Altera o código do curso1
		curso2.setCodigo(456);
		
		//Retorna informações do curso depois da alteração
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println("\n" + "------------------" + "\n");

		//Cria um novo aluno
		Aluno aluno1 = new Aluno("Paula", "1238905340", 29, curso1);
		
		//Retorna informações de um aluno
        System.out.println("Alunos: \n");
		System.out.println(aluno1.toString());
		System.out.println("\n" + "------------------" + "\n");
		
		//Realiza alterações em aluno1
		aluno1.setCpf("897543897654");
		aluno1.setIdade(25);
		aluno1.setNome("Paula Nogueira");
		aluno1.setCurso(curso2);

		//Retorna informações de um aluno após atualização
		System.out.println(aluno1.toString());
	}

}