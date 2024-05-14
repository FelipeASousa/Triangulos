package classes;

public class Funcionario {
	private String nome;
	private String salario;
	private Double salario_base;
	private String cargo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Double getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(Double salario_base) {
		this.salario_base = salario_base;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Funcionario(String nome, String salario, Double salario_base, String cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.salario_base= salario_base;
		this.cargo = cargo;
	}
	
	
}
