public class Programa2 {

	public static void main(String[] args) {
	
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa("Mácio", 25, 1.79);
		agenda.imprimePessoa(0);
		agenda.armazenaPessoa("Rayssa", 30, 1.60);
		agenda.imprimeAgenda();
		agenda.removePessoa("Mácio");
		agenda.imprimeAgenda();
		
		
	}
}
