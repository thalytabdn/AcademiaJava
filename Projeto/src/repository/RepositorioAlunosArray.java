package repository;

import models.Aluno;

public class RepositorioAlunosArray {
    private Aluno[] alunos;
    private int indice;

    public RepositorioAlunosArray(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.indice = 0;
    }

    public void inserir(Aluno aluno){
        alunos[indice] = aluno;
        this.indice++;
    }

    public Aluno procurar(String cpfAluno){
        Aluno procurado = null;
        for (int i = 0; i < indice; i++) {
            Aluno alunoAux = this.alunos[i];
            if(alunoAux.getCpf().equals(cpfAluno)){
                procurado = alunoAux;
            }
        }
        return procurado;
    }

    public void remover(String cpfAluno){
        for (int i = 0; i < indice; i++) {
            Aluno alunoAux = this.alunos[i];
            if(alunoAux.getCpf().equals(cpfAluno)){
                this.alunos[i] = this.alunos[indice - 1];
                this.alunos[indice - 1] = null;
                indice--;
            }

        }
    }
    

    
}
