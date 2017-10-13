package recursosHumanos;

import java.util.Scanner;

import autenticador.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	private Scanner entra;
	String login;
	int pass;

	String pegaLogin() {
		entra = new Scanner(System.in);
		login = entra.next();
		return login;
	}

	int pegaSenha() {
		entra = new Scanner(System.in);
		pass = entra.nextInt();
		return pass;
	}

	@Override
	public boolean autentica(String usuario, int senha) {
		if (this.getUsuario().equals(usuario) && this.getSenha() == senha) {
			setNivelDeAcesso(1);
			System.out.println("Acesso Concedido !");
			return true;
		} else {
			System.out.println("Acesso Negado !");
			return false;
		}
	}
}
