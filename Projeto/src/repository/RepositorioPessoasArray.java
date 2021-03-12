package repository;

import java.util.Arrays;

import models.Pessoa;

public class RepositorioPessoasArray {
	
	private Pessoa[] pessoas;
	private int indice;
	
	public RepositorioPessoasArray(int tamanho) {
		this.pessoas = new Pessoa[tamanho];
		this.indice = 0;
	}
	
	public void inserir(Pessoa pessoa) {
		this.pessoas[indice] = pessoa;
		indice += 1;
	}
	
	public Pessoa procurar(String cpf) {
		for (int i = 0; i < indice; i++) {
			
			if (pessoas[i].getCpf().equals(cpf)) {
				return pessoas[i];
			}
		}

		return null;
	}
	
	public void remover(String cpf) {
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getCpf().equals(cpf)) {
				pessoas[i] = pessoas[indice - 1];
				indice -= 1;
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(pessoas);
	}
	
}
