import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loading loading = new Loading();
        loading.loadingAnimation();
        Menus menus = new Menus();
        menus.imageASII();
        menus.printBlackJack();
        BlackJack blackJack = new BlackJack();
        Scanner scanner =new Scanner(System.in);
        boolean continuarJogo = true;
        while (continuarJogo) {
            blackJack.blackJack();
            System.exit(0);
        }
    }
}