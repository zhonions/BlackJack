import java.util.ArrayList;

public class Jogador {

	private int id;
	private String nome;
	private ArrayList<Carta> mao;
	private int pontos;
	
	public Jogador(){
		this.pontos = 0;
		this.id = (int) System.currentTimeMillis() % 1000;
		this.mao = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta carta){
		this.pontos += carta.getValor();
		this.mao.add(carta);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	public void setMao(ArrayList<Carta> mao) {
		this.mao = mao;
	}
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public void nextMove(Baralho baralho){
		while (this.nome.equals("Banca")) {
			if (this.pontos > 17) {
				break;
			}

			Carta carta = baralho.remover();
			this.addCarta(carta); // Adicione a carta à mão da banca
		}
	}
}
