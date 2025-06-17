package Jour02;

public class FiguresGeometriques {

    public static void main(String[] args) {

        Cercle c = new Cercle(3.0, 4.0, 5.0);

        c.affiche();
        System.out.println("Le rayon du cercle est de : " + c.getRayon());
        System.out.println("La surface du cercle est de : " + c.surface());

        System.out.println("Le point (4, 5) est-il dans le cercle ? " + c.estInterieur(4, 5));
        System.out.println("Le point (10, 10) est-il dans le cercle ? " + c.estInterieur(10, 10));

        Rectangle r = new Rectangle(5.0, 10.0, 12.5, 20.6);

        r.affiche();
        System.out.println("La surface du rectangle est de : " + r.surface());

        r.setLargeur(7.5);
        r.setLongueur(12.3);
        System.out.println("La nouvelle surface du rectangle : " + r.surface());

        RectangleColore rc = new RectangleColore(6.3, 14.5, 20.8, 30.2, 255);
        rc.color();

    }

}

class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Le centre de la figure est aux coordonnées : " + this.x + ", " + this.y);
    }
}

class Cercle extends Figure {

    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
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

    @Override
    public void affiche() {
        System.out.println("Le centre du cercle est aux coordonnées : " + this.x + ", " + this.y);
    }
}

class Rectangle extends Figure {
    protected double largeur;
    protected double longueur;

    public Rectangle(double x, double y, double largeur, double longueur) {
        super(x, y);
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

    @Override
    public void affiche() {
        System.out.println("Le centre du rectangle est aux coordonnées : " + this.x + ", " + this.y);
    }

}

class RectangleColore extends Rectangle {
    int color = 255;
    public RectangleColore(double x, double y, double largeur, double longueur, int color) {
        super(x, y, largeur, longueur);
        this.color = color;
    }

    public void color() {
        System.out.println("La couleur du rectangle est : " + color);
    }

}