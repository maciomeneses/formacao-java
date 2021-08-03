import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private String altura;
	private Integer idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public void setIdade(Integer idade)
	{
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void calculaIdade(){
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		data.format(this.dataNascimento.getTime());
		
		Calendar dataDeHoje = Calendar.getInstance();
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.setTime(dataNascimento);
		
		if(dataDeHoje.get(Calendar.MONTH) > dataNasc.get(Calendar.MONTH))
			idade = dataDeHoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
		else if(dataDeHoje.get(Calendar.MONTH) == dataNasc.get(Calendar.MONTH)) {
			if(dataDeHoje.get(Calendar.DATE) == dataNasc.get(Calendar.DATE))
					idade = dataDeHoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
		}
		else
			idade = dataDeHoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR) - 1;
	}
	
	public void printaDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + getDataNascimento());
		System.out.println("Altura: " + altura);
		calculaIdade();
		System.out.println("Idade: " + idade);
	}
}