import java.util.*;

public class Caminhao {
	private String tipo;
	private int totalPluviometros;
	private List<String> pluviometros;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTotalPluviometros() {
		return totalPluviometros;
	}
	public void setTotalPluviometros(int totalPluviometros) {
		this.totalPluviometros = totalPluviometros;
	}
	public List<String> getPluviometros() {
		return pluviometros;
	}
	public void setPluviometros(List<String> pluviometros) {
		this.pluviometros = pluviometros;
	}
	public Caminhao(String tipo, int totalPluviometros, List<String> pluviometros) {
		this.tipo = tipo;
		this.totalPluviometros = totalPluviometros;
		this.pluviometros = pluviometros;
	}
}
