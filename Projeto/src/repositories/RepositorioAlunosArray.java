package repositories;

import models.Aluno;

public class RepositorioAlunosArray {
	
	private Aluno[] alunos;
	
	private int indice;

	public RepositorioAlunosArray(int tamanho) {
		this.alunos = new Aluno[tamanho];
	}
	
	public void inserir(Aluno aluno) {
		this.alunos[indice] = aluno;
		indice += 1;
	}
	
	public Aluno procurar(String numCpf) {
		
		Aluno aluno = null;
		for(int i =0; i < this.alunos.length; i++) {
			
			if(alunos[i].getCpf() == numCpf) {
				aluno = alunos[i];
			}
		}
		return aluno;
	}
	
	public void remover(String numCpf) {
		
		for(int i =0; i < this.alunos.length; i++) {
			if(alunos[i].getCpf() == numCpf) {
				alunos[i] = null;
			}
		}
	}
	

}
