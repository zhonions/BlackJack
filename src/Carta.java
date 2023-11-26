public class Carta {
	private String nome;
	private int valor;

	public Carta(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public Carta(String nome) {
		this.nome = nome;
	}
	public Carta(String nome,int valor) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}

