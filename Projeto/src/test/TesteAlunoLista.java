package test;

import repository.RepositorioAlunosLista;
import models.Aluno;
import models.Curso; 

public class TesteAlunoLista {

    public static void main(String[] args) {
        
        RepositorioAlunosLista repAlunos = new RepositorioAlunosLista();

        Curso curso1 = new Curso(680, "Ciência da Computação");
		Curso curso2 = new Curso(740, "Design");

		Aluno aluno1 = new Aluno("Aluno1", "000001", 20, curso1);
		Aluno aluno2 = new Aluno("Aluno2", "201010", 18, curso1);
		Aluno aluno3 = new Aluno("Aluno3", "098456", 21, curso1);
		Aluno aluno4 = new Aluno("Aluno4", "456789", 19, curso2);
		Aluno aluno5 = new Aluno("Aluno5", "789456", 22, curso2);

        //Adiciona aluno na lista
		repAlunos.inserir(aluno1);
		repAlunos.inserir(aluno2);
		repAlunos.inserir(aluno3);
		repAlunos.inserir(aluno4);
        repAlunos.inserir(aluno5);
        
        System.out.println(repAlunos.procurar("000001"));

		repAlunos.remover("000001");

		//Aluno não existe
        System.out.println(repAlunos.procurar("000001"));
        
       
    }
    
}
