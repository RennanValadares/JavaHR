package recursosHumanos;

import autenticador.Autenticavel;

public abstract class Funcionario implements Autenticavel {

	private double salario;
	private double bonus;
	private String nome;
	private String ultimoNome;
	private String cpf;
	private String usuario;
	private int nivelDeAcesso;
	private int senha;



	public int getSenha() {
		return senha;
	}

	public int getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(int nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public double getSalario() {
		return salario;
	}

	public double getBonus() {
		return bonus;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void alteraSalario(double valor, Funcionario f) {
		if (checaNivelAcessoGerente(f)) {
			this.salario = valor;
			System.out.println("Sal�rio Alterado com Sucesso !");
		} else {
			System.out.println("Voc� n�o tem permiss�o para alterar sal�rios !");
		}
	}

	void alteraBonus(double taxa, Funcionario f) {
		if (checaNivelAcessoGerente(f)) {
			this.bonus = this.salario * taxa;
			System.out.println("B�nus Alterado com Sucesso !");
		}else {
			System.out.println("Voc� n�o possui permiss�o para alterar o B�nus !");
		}
	}

	public boolean checaNivelAcessoGerente(Funcionario f) {
		if (f.getNivelDeAcesso() == 1) {
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
}
