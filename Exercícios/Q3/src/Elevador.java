public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int ocupacaoElevador;
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getOcupacaoElevador() {
		return ocupacaoElevador;
	}
	public void setOcupacaoElevador(int ocupacaoElevador) {
		this.ocupacaoElevador = ocupacaoElevador;
	}
	
	public void inicializa(int capacidadeElevador, int totalAndares) {
		
		setAndarAtual(0);
		setOcupacaoElevador(0);
		setCapacidadeElevador(capacidadeElevador);
		setTotalAndares(totalAndares);
		
	}
	
	public void entra() {
		if(getOcupacaoElevador() < getCapacidadeElevador()) {
			this.ocupacaoElevador++;
		}else {
			System.out.println("Encheu");
		}
	}
	
	public void sai() {
		if(getOcupacaoElevador() > 0) {
			this.ocupacaoElevador--;
		}else {
			System.out.println("Está vazio");
		}
	}
	
	public void sobe() {
		if(getAndarAtual()<getTotalAndares()) {
			this.andarAtual++;
		}else {
			System.out.println("Já está no último andar");
		}
	}
	
	public void desce() {
		if(getAndarAtual() > 0) {
			this.andarAtual--;
		}else {
			System.out.println("Já está no térreo.");
		}
	}
}
