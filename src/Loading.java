
public class Loading {
    public void loadingAnimation() {
        try {
            System.out.println("Loading...");
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100); // Atraso de 100 milissegundos (0.1 segundos)
                System.out.print("\b\b\b" + (i + 1) + "%");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nDone!");
    }
}
