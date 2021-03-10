package test;

import models.Aluno;
import models.Curso;
import repository.RepositorioAlunosArray;

public class TesteAlunoArray {
    public static void main(String[] args) {
		
		RepositorioAlunosArray repAlunos = new RepositorioAlunosArray(5);

		Curso curso1 = new Curso(680, "Ciência da Computação");
		Curso curso2 = new Curso(740, "Astrofísica");

		Aluno aluno1 = new Aluno("Aluno1", "123456", 20, curso1);
		Aluno aluno2 = new Aluno("Aluno2", "987654", 18, curso1);
		Aluno aluno3 = new Aluno("Aluno3", "654321", 21, curso1);
		Aluno aluno4 = new Aluno("Aluno4", "456789", 19, curso2);
		Aluno aluno5 = new Aluno("Aluno5", "789456", 22, curso2);

		repAlunos.inserir(aluno1);
		repAlunos.inserir(aluno2);
		repAlunos.inserir(aluno3);
		repAlunos.inserir(aluno4);
		repAlunos.inserir(aluno5);

		System.out.println(repAlunos.procurar("987654"));

		repAlunos.remover("987654");

		//Aluno não existe
		System.out.println(repAlunos.procurar("987654")); 

	}

}