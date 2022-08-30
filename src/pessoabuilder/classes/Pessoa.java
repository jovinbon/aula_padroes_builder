package pessoabuilder.classes;

public class Pessoa {
	
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
	
	public Pessoa() {
	}

	public Pessoa(String nome, String nomeDoMeio, String ultimoNome, String cpf, String rg, String nomeDoPai,
			String nomeDaMae, String endereco, String grupoSanguineo, String estadoCivil, String profissao) {
		this.nome = nome;
		this.nomeDoMeio = nomeDoMeio;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
		this.rg = rg;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
		this.endereco = endereco;
		this.grupoSanguineo = grupoSanguineo;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeDoPai() {
		return nomeDoPai;
	}

	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Pessoa [\n Nome = " + nome + ",\n Nome do meio = " + nomeDoMeio + ",\n Último nome = " + ultimoNome + ",\n CPF = " + cpf
				+ ",\n RG = " + rg + ",\n Nomed o pai = " + nomeDoPai + ",\n Nome da mãe = " + nomeDaMae + ",\n Endereço = " + endereco
				+ ",\n Grupo sanguineo = " + grupoSanguineo + ",\n Estado civil = " + estadoCivil + "\n Profissão = " + profissao
				+ "\n]";
	}
	
}
