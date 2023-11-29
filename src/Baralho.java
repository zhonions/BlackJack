public class Baralho {

    private Pilha<Carta> baralho;

    public Baralho() {
        this.baralho = new Pilha<Carta>();
    }

    public void iniciarbaralho() {
        if (baralho.vazia()) {
            Jogador jogador = new Jogador();
            criarBaralho(jogador);
        }

    }

    public void embaralhar() {
        baralho.embaralhar();
    }

    public int tamanho() {
        return baralho.size();
    }

    public Carta remover() {
        return (Carta) this.baralho.remover();
    }

    public void mostrarBaralho() {
        for (int i = 0; i < baralho.size(); i++) {
            System.out.println(((Carta) baralho.get(i)).getNome());
        }
    }


    private void criarBaralho(Jogador jogador) {
        Colors colors = new Colors();
        Carta carta;
        //COPAS
        carta = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♥   │\n" +
                "│       │\n" +
                "│   ♥   │\n" +
                "│      A│\n" +
                "└───────┘");
        if(jogador.getPontos()+11<=21){
            carta.setValor(11);
        }else {
            carta.setValor(1);
        }
        baralho.inserir(carta);
        for (int i = 2; i < 10; i++) {
            carta = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♥   │\n" +
                    "│       │\n" +
                    "│   ♥   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘\n");
            carta.setValor(i);
            baralho.inserir(carta);
        }
        carta = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♥   │\n" +
                "│   |   │\n" +
                "│   ♥   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♥   │\n" +
                "│  \\│/  │\n" +
                "│   ↑   │\n" +
                "│      J│\n" +
                "└───────┘");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♥   │\n" +
                "│  /█\\  │\n" +
                "│   ↓   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♥   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);

        //PAUS
        carta = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♣   │\n" +
                "│       │\n" +
                "│   ♣   │\n" +
                "│      A│\n" +
                "└───────┘");
        if(jogador.getPontos()+11<=21){
            carta.setValor(11);
        }else {
            carta.setValor(1);
        }
        baralho.inserir(carta);
        for (int i = 2; i < 10; i++) {
            carta = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♣   │\n" +
                    "│       │\n" +
                    "│   ♣   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            carta.setValor(i);
            baralho.inserir(carta);
        }
        carta = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♣   │\n" +
                "│   |   │\n" +
                "│   ♣   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);

        carta = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♣   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♣   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♣   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);

        //OURO
        carta = new Carta( "┌───────┐\n" +
                "│A      │\n" +
                "│   ♦   │\n" +
                "│       │\n" +
                "│   ♦   │\n" +
                "│      A│\n" +
                "└───────┘");
        if(jogador.getPontos()+11<=21){
            carta.setValor(11);
        }else {
            carta.setValor(1);
        }
        baralho.inserir(carta);
        for (int i = 2; i < 10; i++) {
            carta = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♦   │\n" +
                    "│       │\n" +
                    "│   ♦   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            carta.setValor(i);
            baralho.inserir(carta);

        }
        carta = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♦   │\n" +
                "│   |   │\n" +
                "│   ♦   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♦   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♦   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♦   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);

        //ESPADAS
        carta = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♠   │\n" +
                "│       │\n" +
                "│   ♠   │\n" +
                "│      A│\n" +
                "└───────┘");
        if(jogador.getPontos()+11<=21){
            carta.setValor(11);
        }else {
            carta.setValor(1);
        }
        baralho.inserir(carta);
        for (int i = 2; i < 10; i++) {
            carta = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♠   │\n" +
                    "│       │\n" +
                    "│   ♠   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            carta.setValor(i);
            baralho.inserir(carta);

        }
        carta = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♠   │\n" +
                "│   |   │\n" +
                "│   ♠   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♠   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♠   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        carta.setValor(10);
        baralho.inserir(carta);
        carta = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♠   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        baralho.inserir(carta);
        carta.setValor(10);


    }

}
