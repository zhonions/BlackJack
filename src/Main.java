public class Main {
    public static void main(String[] args) throws InterruptedException {
        Loading loading = new Loading();
        loading.loadingAnimation();
        Menus menus = new Menus();
        menus.printBlackJack();
        BlackJack blackJack = new BlackJack();
        blackJack.blackJack();
    }
}