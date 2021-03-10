package repository;

import models.Aluno;

public class RepositorioAlunosArray {
	
	private Aluno[] alunos;
	
	private int indice;

	public RepositorioAlunosArray(int tamanho) {
		this.indice = 0;
		this.alunos = new Aluno[tamanho];
	}
	
	public void inserir(Aluno aluno) {
		this.alunos[indice] = aluno;
		indice += 1;
	}
	
	public Aluno procurar(String cpf) {
		Aluno alunoProcurado = null;

		for (int i = 0; i < indice; i++) {
			
			if (alunos[i].getCpf().equals(cpf)) {
				alunoProcurado = alunos[i];
			}
		}

		return alunoProcurado;
	}
	
	public void remover(String cpf) {
		
		for (int i = 0; i < indice; i++) {
			if (alunos[i].getCpf().equals(cpf)) {
				alunos[i] = alunos[indice - 1];
				indice -= 1;
			}
		}
	}

}