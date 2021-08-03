public class Programa {
	public static void main(String[] args) {
		Televisao televisao = new Televisao();
		ControleRemoto controle = new ControleRemoto();
		
		controle.aumentaVolume(televisao);
		controle.aumentaVolume(televisao);
		controle.diminuirVolume(televisao);
		System.out.println("Volume da tv: " + controle.getVolume());
		controle.trocarCanal(televisao, 10);
		controle.consultaCanal(televisao);
	}
}
