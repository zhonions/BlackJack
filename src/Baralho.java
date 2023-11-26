public class Baralho {

    private Pilha<Carta> baralho;

    public Baralho() {
        this.baralho = new Pilha<Carta>();
    }

    public void iniciarbaralho() {
        if (baralho.vazia()) {
            criarBaralho();
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


    private void criarBaralho() {
        Colors colors = new Colors();
        Carta c1;
        //COPAS
        c1 = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♥   │\n" +
                "│       │\n" +
                "│   ♥   │\n" +
                "│      A│\n" +
                "└───────┘",10);
        baralho.inserir(c1);
        for (int i = 2; i < 10; i++) {
            c1 = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♥   │\n" +
                    "│       │\n" +
                    "│   ♥   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘\n");
            baralho.inserir(c1);
        }

        c1 = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♥   │\n" +
                "│   |   │\n" +
                "│   ♥   │\n" +
                "│     10│\n" +
                "└───────┘\n",10);
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♥   │\n" +
                "│  \\│/  │\n" +
                "│   ↑   │\n" +
                "│      J│\n" +
                "└───────┘");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♥   │\n" +
                "│  /█\\  │\n" +
                "│   ↓   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♥   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        baralho.inserir(c1);

        //PAUS
        c1 = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♣   │\n" +
                "│       │\n" +
                "│   ♣   │\n" +
                "│      A│\n" +
                "└───────┘");
        baralho.inserir(c1);
        for (int i = 2; i < 10; i++) {
            c1 = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♣   │\n" +
                    "│       │\n" +
                    "│   ♣   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            baralho.inserir(c1);

        }
        c1 = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♣   │\n" +
                "│   |   │\n" +
                "│   ♣   │\n" +
                "│     10│\n" +
                "└───────┘\n",10);
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♣   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘\n");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♣   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♣   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        baralho.inserir(c1);

        //OURO
        c1 = new Carta( "┌───────┐\n" +
                "│A      │\n" +
                "│   ♦   │\n" +
                "│       │\n" +
                "│   ♦   │\n" +
                "│      A│\n" +
                "└───────┘");
        baralho.inserir(c1);
        for (int i = 2; i < 10; i++) {
            c1 = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♦   │\n" +
                    "│       │\n" +
                    "│   ♦   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            baralho.inserir(c1);

        }
        c1 = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♦   │\n" +
                "│   |   │\n" +
                "│   ♦   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♦   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♦   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♦   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        baralho.inserir(c1);

        //ESPADAS
        c1 = new Carta("┌───────┐\n" +
                "│A      │\n" +
                "│   ♠   │\n" +
                "│       │\n" +
                "│   ♠   │\n" +
                "│      A│\n" +
                "└───────┘");
        baralho.inserir(c1);
        for (int i = 2; i < 10; i++) {
            c1 = new Carta("┌───────┐\n" +
                    "│" + i + "      │\n" +
                    "│   ♠   │\n" +
                    "│       │\n" +
                    "│   ♠   │\n" +
                    "│      " + i + "│\n" +
                    "└───────┘");
            baralho.inserir(c1);

        }
        c1 = new Carta("┌───────┐\n" +
                "│10     │\n" +
                "│   ♠   │\n" +
                "│   |   │\n" +
                "│   ♠   │\n" +
                "│     10│\n" +
                "└───────┘\n");
        c1.setValor(10);
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│J      │\n" +
                "│   ♠   │\n" +
                "│  /│\\  │\n" +
                "│   |   │\n" +
                "│      J│\n" +
                "└───────┘\n");
        c1.setValor(10);
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│Q      │\n" +
                "│   ♠   │\n" +
                "│  /█\\  │\n" +
                "│   │   │\n" +
                "│      Q│\n" +
                "└───────┘\n");
        baralho.inserir(c1);
        c1 = new Carta("┌───────┐\n" +
                "│K      │\n" +
                "│   ♠   │\n" +
                "│  /█\\  │\n" +
                "│   █   │\n" +
                "│      K│\n" +
                "└───────┘\n");
        baralho.inserir(c1);


    }

}
