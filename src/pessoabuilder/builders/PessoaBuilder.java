package pessoabuilder.builders;

import pessoabuilder.classes.Pessoa;

public class PessoaBuilder {
	
	public String nome;
	public String nomeDoMeio;
	public String ultimoNome;
	public String cpf;
	public String rg;
	public String nomeDoPai;
	public String nomeDaMae;
	public String endereco;
	public String grupoSanguineo;
	public String estadoCivil;
	public String profissao;
	
	public PessoaBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
		return this;
	}
	
	public PessoaBuilder ultimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
		return this;
	}
	
	public PessoaBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
	
	public PessoaBuilder rg(String rg) {
		this.rg = rg;
		return this;
	}
	
	public PessoaBuilder nomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
		return this;
	}
	
	public PessoaBuilder nomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
		return this;
	}
	
	public PessoaBuilder endereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public PessoaBuilder grupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
		return this;
	}
	
	public PessoaBuilder estadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}
	
	public PessoaBuilder profissao(String profissao) {
		this.profissao = profissao;
		return this;
	}
	
	public Pessoa build() {
		return new Pessoa(nome, nomeDoMeio, ultimoNome, cpf, rg, nomeDoPai, nomeDaMae, endereco, grupoSanguineo, estadoCivil, profissao);
	}

}
