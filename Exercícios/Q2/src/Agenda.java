public class Agenda {
	
	private String[] nome = new String[10];
	private int[] idade = new int[10];
	private double[] altura = new double[10];
	
	int numEntrada = 0;
	
	
	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public int[] getIdade() {
		return idade;
	}

	public void setIdade(int[] idade) {
		this.idade = idade;
	}

	public double[] getAltura() {
		return altura;
	}

	public void setAltura(double[] altura) {
		this.altura = altura;
	}

	public int getNumEntrada() {
		return numEntrada;
	}

	public void setNumEntrada(int numEntrada) {
		this.numEntrada = numEntrada;
	}

	void armazenaPessoa(String nome, int idade, double altura) {
		if(numEntrada < 10) {
			this.nome[numEntrada] = nome;
			this.idade[numEntrada] = idade;
			this.altura[numEntrada] = altura;
			
			numEntrada++;
		}else {
			System.out.println("Não é possível adicionar mais pessoas.");
		}
	}
	
	int buscaPessoa(String nome) {
		
		int i=0;
		for(i=0; i<10; i++) {
			if(this.nome[i] == nome) {
				break;
			}
		}
		return i;
	}
	
	void removePessoa(String nome) {
		int index = buscaPessoa(nome);
		
		for(int i = index; i<numEntrada-1; i++) {
			this.nome[i] = this.nome[i + 1];
		}
		this.nome[numEntrada] = "";
		numEntrada--;
	}
	
	
	void imprimePessoa(int index) {
		System.out.println(index + ": " + this.nome[index] + ", " + this.idade[index] + "anos, " + this.altura[index] + " metros.");
	}
	
	void imprimeAgenda() {
		for(int i = 0; i<numEntrada; i++) {
			imprimePessoa(i);
		}
	}
}
