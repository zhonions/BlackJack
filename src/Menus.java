public class Menus {
    Colors colors = new Colors();
    String space = "\t\t\t\t\t\t\t\t\t\t\t";

    public void printBlackJack() {
        printLines();
        System.out.println(colors.getLightYellow()
                + space + "██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗\n"
                + space + "██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝\n"
                + space + "██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝ \n"
                + space + "██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗ \n"
                + space + "██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗\n"
                + space + "╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n" + "\n" + colors.getResetColor());
    }
    public void printLines() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
}
