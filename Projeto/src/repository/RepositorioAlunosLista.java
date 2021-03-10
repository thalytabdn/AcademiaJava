package repository;

import java.util.ArrayList;
import java.util.List;

import models.Aluno;

public class RepositorioAlunosLista implements RepositorioAlunos{
    private List<Aluno> alunos;
    
    public RepositorioAlunosLista(){
        alunos = new ArrayList<Aluno>();
    }

    @Override
    public void inserir(Aluno aluno){
        this.alunos.add(aluno);
    }

    @Override
    public Aluno procurar(String cpfAluno) {
        Aluno alunoProcurado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpfAluno)){
                alunoProcurado = aluno;
            }
        }
        
        return alunoProcurado;
    }

    @Override
    public void remover(String cpfAluno) {
        int posicao = -1;
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpfAluno)){
                posicao = alunos.indexOf(aluno);
                break;
            }
        }

        if (posicao != -1){
            alunos.remove(posicao);
        }
    }

    public List<Aluno> listarAlunos(){
        return this.alunos;
    }


}
