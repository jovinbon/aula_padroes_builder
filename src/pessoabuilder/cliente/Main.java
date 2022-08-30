package pessoabuilder.cliente;

import pessoabuilder.builders.PessoaBuilder;
import pessoabuilder.classes.Pessoa;
import pessoabuilder.director.Director;

public class Main {

	public static void main(String[] args) {
		
        System.out.println();
		System.out.println(">>>>>>>> Chamando diretamente o builder: <<<<<<<<<<");
   
		Pessoa p = new PessoaBuilder()
				.nome("Fulano")
				.nomeDoMeio("Alves")
				.ultimoNome("Farofa")
				.cpf("000.001.002-01")
				.rg("3.125.458")
				.nomeDoPai("Ciclano Farofa")
				.nomeDaMae("Fulana Alves Farofa")
				.endereco("Rau das Fábricas das Farinhas, 1092, Bairro Mandioca")
				.grupoSanguineo("O+")
				.estadoCivil("Solteiro")
				.profissao("Estudante")
				.build();
		
		System.out.println(p);
		System.out.println();
		
		System.out.println(">>>>>>>> De outra forma, o diretor acionando o construtor (builder): <<<<<<<<<");
		
		Director d = new Director(); //aqui o diretor conhece o construtor de pessoa
		
		PessoaBuilder p2 = new PessoaBuilder()
				.nome("Maria")
				//.nomeDoMeio("Cigana") //aqui poderiamos omitir qualquer construtor... pessoa não teria o nome do meio.
				.ultimoNome("Borges")
				.cpf("000.002.003-04")
				.rg("4.234.458") 
				.nomeDoPai("Carlos Borges")
				.nomeDaMae("Juliana Cigana Borges")
				.endereco("Av. das Palmeiras, 98, Bairro Centroa")
				.grupoSanguineo("A+")
				.estadoCivil("Solteira")
				.profissao("Estudante");
		
		System.out.println(d.buildPessoa(p2)); //aqui o construtor devolve a pessoa construida ao diretor
		
	}

}
