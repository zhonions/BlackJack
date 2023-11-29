import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackJack {

    private Baralho baralho;
    private ArrayList<Jogador> jogadores;
    private Scanner scan = new Scanner(System.in);
    private int pontosMaior = 0;
    private int opcaoJogo = 1;


    static Colors colors = new Colors();

    public void blackJack() {

        int opcao = 1;
        Jogador jogador;
        String nome;

        baralho = new Baralho();
        baralho.iniciarbaralho();
        baralho.embaralhar();

        jogadores = new ArrayList<Jogador>();

        jogador = new Jogador();
        jogador.setNome("Banca");
        jogadores.add(jogador);

        //Inicio
        while (opcao >= 1) {

            //Menu Inicial
            System.out.println();
            System.out.println("------ Digite sua opção -------");
            System.out.println();
            System.out.println("1 - Adicionar Jogador");
            System.out.println("2 - Iniciar Jogo");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();

            //Add jogador
            if (opcao == 1) {
                jogador = new Jogador();
                System.out.println("\nDigite o nome do jogador:");
                nome = new String(scan.next());
                jogador.setNome(nome);
                jogadores.add(jogador);
            }

            //Jogo
            if (opcao == 2) {
                if (jogadores.size() < 2) {
                    System.out.println("Voce precisa adicionar jogadores!!!");
                } else {
                    while (opcaoJogo >= 1) {

                        //primeira rodada
                        if (opcaoJogo == 1) {
                            darCartas(jogadores, baralho);
                            opcaoJogo = 2;
                        }

                        //demais rodadas
                        else if (opcaoJogo == 2) {

                            for (int j = (jogadores.size() - 1); j >= 0; j--) {
                                if (j != 0) {
                                    while (jogadores.get(j).getPontos() <= 21 && opcaoJogo != 3) {

                                        jogar(jogadores.get(j), baralho);
                                        break;

                                    }
                                }
                                jogadores.get(0).nextMove(baralho);
                                opcaoJogo = 2;
                            }
                            opcaoJogo = -1;
                            vencedor();
                        }
                    }
                    opcao = -1;
                }
            }

        }
    }


    public static void darCartas(ArrayList<Jogador> jogadores, Baralho baralho) {
        for (int i = 1; i <= 2; i++) {
            for (Jogador j : jogadores) {
                j.addCarta(baralho.remover());
            }
        }
    }

    public static void mostrarMesa(ArrayList<Jogador> jogadores) {
        System.out.println();
        System.out.println(colors.getBold() + colors.getLightYellow() +
                "___  ___                \n" +
                "|  \\/  |                \n" +
                "| .  . | ___  ___  __ _ \n" +
                "| |\\/| |/ _ \\/ __|/ _` |\n" +
                "| |  | |  __/\\__ \\ (_| |\n" +
                "\\_|  |_/\\___||___/\\__,_|\n" + colors.getResetColor());

        for (Jogador jogador : jogadores) {
            System.out.println("-------------------------");
            System.out.print("Jogador: ");
            System.out.print("\t" + jogador.getNome());
            System.out.println("\nCartas:");

            for (Carta carta : jogador.getMao()) {
                if (carta.getNome().contains("♥") || carta.getNome().contains("♦")) {
                    System.out.println(colors.getRed() + colors.getBackWhite() + carta.getNome() + colors.getResetColor());
                } else {
                    System.out.println(colors.getBackWhite() + colors.getBlack() + carta.getNome() + colors.getResetColor());
                }
            }

            System.out.println("Pontos -> ");
            System.out.println("\t" + jogador.getPontos());
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------");
    }

    public void jogar(Jogador jogador, Baralho baralho) {
        mostrarMesa(jogadores);
        System.out.println();
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("------ Digite sua opção -------");
        System.out.println("2 - Hit (receber uma carta)");
        System.out.println("3 - Stand (encerrar mao)");
        opcaoJogo = scan.nextInt();
        if (opcaoJogo == 2) {
            jogador.addCarta(baralho.remover());
        }

        //stand
        if (opcaoJogo == 3) {
            System.out.println("Opcao:  Stand -> Pontos: " + jogador.getPontos());
        }

        if (jogador.getPontos() >= pontosMaior && jogador.getPontos() <= 21) {
            pontosMaior = jogador.getPontos();
        }
    }

    public void vencedor() {
        int contEmpate = 0;

        System.out.println("--------------");
        System.out.println("     \\o/     ");
        System.out.println();
        System.out.println("Vencedor(es): ");
        System.out.println();

        for (Jogador j : jogadores) {
            if (j.getPontos() == pontosMaior) {
                System.out.println(j.getNome() + " Pontos -> " + j.getPontos());
                contEmpate++;
            }
        }
        if (contEmpate > 1) {
            System.out.println("Portanto, tivemos um empate!!!!");
        }
        System.out.println();
        System.out.println("     \\o/     ");
        System.out.println("--------------");
        System.out.println();
    }
}

