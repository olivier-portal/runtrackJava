package Jour02;

public class FiguresGeometriques {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5.0, 10.0);

        System.out.println("Largeur : " + r.getLargeur());
        System.out.println("Longueur : " + r.getLongueur());
        System.out.println("Surface : " + r.surface());

        r.setLargeur(7.5);
        r.setLongueur(12.3);
        System.out.println("Nouvelle surface : " + r.surface());

        Cercle c = new Cercle(3.0, 4.0, 5.0);

        System.out.println("x est à : " + c.getX());
        System.out.println("y est à : " + c.getY());
        c.affiche();
        System.out.println("Surface : " + c.surface());

        System.out.println("Le point (4, 5) est-il dans le cercle ? " + c.estInterieur(4, 5));
        System.out.println("Le point (10, 10) est-il dans le cercle ? " + c.estInterieur(10, 10));

        RectangleColore rectangleColore = new RectangleColore(6.3, 14.5, 255);
        rectangleColore.color();

    }

}

class Rectangle {
    protected double largeur;
    protected double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }

}

class Cercle {

    protected double x;
    protected double y;
    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public boolean estInterieur(double px, double py) {
        double distanceCarree = Math.pow(px - x, 2) + Math.pow(py - y, 2);
        return distanceCarree <= Math.pow(rayon, 2);
    }

    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + "), rayon : " + rayon);
    }
}

class RectangleColore extends Rectangle {
    int color = 255;
    public RectangleColore(double largeur, double longueur, int color) {
        super(largeur, longueur);
        this.color = color;
    }

    public void color() {
        System.out.println("La couleur du rectangle est : " + color);
    }

}