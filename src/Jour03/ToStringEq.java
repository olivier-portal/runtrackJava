package Jour03;

public class ToStringEq {
    public static void main(String[] args) {

        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2 :");
        RectangleColore rect1 = new RectangleColore(12.5, 4, "rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, "rouge");
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect1));
        System.out.println(rect1.equals(null));
        System.out.println(rect.equals(rect1));
        System.out.println(rect1.equals(rect));
    }
}

class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n largeur : " + largeur + "\n hauteur : " + hauteur;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (Double.compare(rectangle.largeur, largeur) != 0) return false;
        return Double.compare(rectangle.hauteur, hauteur) == 0;
    }
}

class RectangleColore extends Rectangle {
    String color = "";
    public RectangleColore(double largeur, double hauteur, String color) {
        super(largeur, hauteur);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n couleur = " + color;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleColore rectangle = (RectangleColore) o;
        if (Double.compare(rectangle.largeur, largeur) != 0) return false;
        return Double.compare(rectangle.hauteur, hauteur) == 0;
    }

}
