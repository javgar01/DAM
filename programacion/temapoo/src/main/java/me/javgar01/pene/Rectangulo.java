package me.javgar01.pene;

public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        // Comprobamos si es un rectángulo válido
        if ((x1 < x2) && (y1 < y2)) {
            this.setX1(x1);
            this.setY1(y1);
            this.setX2(x2);
            this.setY2(y2);

        } else {
            System.err.println("ERROR al intanciar el Rectángulo (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }

    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int setX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

}
