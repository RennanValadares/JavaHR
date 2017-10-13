package recursosHumanos;

public class testaFuncionario {
	public static void main(String[] args) {
//		 Testando o Gerente
		Gerente andre = new Gerente();
		andre.setCpf("011.250.501.52");
		andre.setNome("Rennan");
		andre.setUltimoNome("Valadares");
		andre.setUsuario("Rennan.Valadares");
		andre.setSenha(123);
		System.out.println("Digite seu Login: ");
		String login = andre.pegaLogin();
		System.out.println("Digite sua Senha: ");
		int pass = andre.pegaSenha();
		andre.autentica(login, pass);
		andre.alteraSalario(10000, andre);
		
		//Testando o Supervisor
		Supervisor lourima = new Supervisor();
		lourima.setNome("Lourima");
		lourima.setUsuario("Lourima.Teste");
		lourima.setSenha(123);
		String loginLourima = lourima.pegaLogin();
		int passLourima = lourima.pegaSenha();
		lourima.autentica(loginLourima, passLourima);
		lourima.alteraSalario(10000, lourima);
		lourima.alteraSalario(10000, lourima);
		System.out.println(lourima.getSalario());
	}
}
