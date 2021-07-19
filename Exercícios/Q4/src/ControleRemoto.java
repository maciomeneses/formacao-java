public class ControleRemoto extends Televisao{

	public void aumentaVolume(Televisao televisao){
		televisao.setVolume(televisao.getVolume()+1);
	}
	public void diminuirVolume(Televisao televisao){
		if(televisao.getVolume()>0)
			televisao.setVolume(getVolume()-1);
	}
	public void trocarCanal(Televisao televisao, int canal) {
		televisao.setCanal(canal);
	}
	public void consultaCanal(Televisao televisao) {
		System.out.println("O canal atual é: " + televisao.getCanal());
	}
}
