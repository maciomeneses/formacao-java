public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public String getAltura() {
		return this.altura;
	}
	
	public void printaDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Altura: " + this.altura);
	}
	
	public void getIdade() {
		//String diaStr, mesStr, anoStr;
		//int diaInt, mesInt, anoInt;
		
		
	}
}