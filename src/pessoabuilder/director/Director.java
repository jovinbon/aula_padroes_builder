package pessoabuilder.director;

import pessoabuilder.builders.PessoaBuilder;
import pessoabuilder.classes.Pessoa;

public class Director {
	
	public Pessoa buildPessoa(PessoaBuilder builder) {
		return builder.build();
	}

}
