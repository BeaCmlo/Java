public class Girafa extends Animal {
	private int tamanoLingua;
	
	
	public Girafa() {
		super();
		tamanoLingua = 0;
	}


	public int getTamanoLingua() {
		return tamanoLingua;
	}


	public void setTamanoLingua(int tamanoLingua) {
		this.tamanoLingua = tamanoLingua;
	}


	public void comer() {
		quantidadeAlimento = peso * (10/100);
	}

}
