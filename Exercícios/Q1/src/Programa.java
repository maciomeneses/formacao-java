public class Programa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Mácio");
		pessoa.setDataNascimento("26/02/1996");
		pessoa.setAltura("1,79");
		
		pessoa.printaDados();
	}
}
