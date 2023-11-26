public class Colors {
    private String lightBlue = "\u001B[38;5;87m";
    private String yellow = "\u001b[38;5;11m";
    private String lightYellow = "\u001b[38;5;229m";

    private String red = "\u001b[38;5;197m";
    private String blue = "\u001b[38;5;39m";
    private String green = "\u001b[38;5;83m";
    private String redDark = "\u001b[38;5;124m";
    private String orange = "\u001b[38;5;208m";
    private String bold = "\u001b[1m";
    private String resetColor = "\u001b[0m";


    public String getBold() {
        return bold;
    }

    public String getResetColor() {
        return resetColor;
    }

    public String getYellow() {
        return yellow;
    }

    public String getLightYellow() {
        return lightYellow;
    }

    public String getRed() {
        return red;
    }

    public String getBlue() {
        return blue;
    }

    public String getGreen() {
        return green;
    }

    public String getRedDark() {
        return redDark;
    }

    public String getOrange() {
        return orange;
    }

    public String getLightBlue() {
        return lightBlue;
    }
}
