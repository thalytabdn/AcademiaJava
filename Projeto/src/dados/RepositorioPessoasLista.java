package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Pessoa;
import negocio.RepositorioPessoas;

public class RepositorioPessoasLista implements RepositorioPessoas {

    private List<Pessoa> pessoas;

    public RepositorioPessoasLista() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    @Override
    public void inserir(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    @Override
    public Pessoa procurar(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public void remover(String cpf) {
        this.pessoas.remove(procurar(cpf));
    }

    public List<Pessoa> listarPessoas() {
        return this.pessoas;
    }
    
}
