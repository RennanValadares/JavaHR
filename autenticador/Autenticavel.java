package autenticador;

import recursosHumanos.Funcionario;

public interface Autenticavel {
	boolean autentica(String usuario,int senha);
	boolean checaNivelAcessoGerente(Funcionario f);
	
	
	}
	
	

