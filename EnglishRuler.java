
/*
* The English ruler pattern is a simple example of a fractal,
* i.e. a shape that has a self-recursive structure at various levels of magnification.
* Major ticks designate whole inches while minor ticks are placed at intervals 12, 14, etc. between two major ticks
* */

public class EnglishRuler {
    public static void main(String[] args) {
      drawRuler(1, 5);
    }

    public static void drawRuler(int inches, int majorLength) {
        drawLine(majorLength, 0);
        for(int i=1; i<=inches; i++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, i);
        }

    }

    public static void drawInterval(int centralTick) {
        if(centralTick >= 1) {
            drawInterval(centralTick - 1);
            drawLine(centralTick);
            drawInterval(centralTick -1);
        }
    }

    public static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }

    public static void drawLine(int tickLength, int tickLabel) {
        for(int i=0; i<tickLength; i++) {
            System.out.print("-");
        }
        if(tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }
}