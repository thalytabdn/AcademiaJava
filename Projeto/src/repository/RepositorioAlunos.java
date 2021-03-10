package repository;

import models.Aluno;

public interface RepositorioAlunos {

    public void inserir(Aluno aluno);

    public Aluno procurar(String cpfAluno);

    public void remover(String cpfAluno);

}
