package Jour02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GestionVehicules {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.JULY, 9);
        Date dateAchatVoiture = cal.getTime();

        cal.set(2018, Calendar.JUNE, 18);
        Date dateAchatAvion = cal.getTime();

        Voiture v = new Voiture("Peugeot", dateAchatVoiture, 15560L, 1600, 5, 120, 18235.56);

        Avion a = new Avion("Airbus", dateAchatAvion, 25000000L, Avion.TypeMoteur.REACTION, 12000);

        v.affiche();
        System.out.println("------------");
        a.affiche();
    }
}

class Vehicule {
    private final String marque;
    private final Date dateAchat;
    private final long prix;
    private double prixCourant;

    public Vehicule(String marque,Date dateAchat, long prix ) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public Date  getDateAchat() {
        return dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void affiche() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + sdf.format(dateAchat));
        System.out.println("Prix: " + prix);
    }
}

class Voiture extends Vehicule {

    private final int cylindree;
    private final int nombrePortes;
    private final int puissance;
    private final double kilometrage;

    public Voiture(String marque, Date dateAchat, long prix, int cylindree ,  int nombrePortes , int puissance , double kilometrage ) {
        super(marque, dateAchat, prix);
        this.cylindree = cylindree;
        this.nombrePortes = nombrePortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindree: " + cylindree);
        System.out.println("Nombre Portes: " + nombrePortes);
        System.out.println("Puissance: " + puissance);
        System.out.println("Kilometrage: " + kilometrage);
    }
}

class Avion extends Vehicule {

    enum TypeMoteur {
        HELICES,
        REACTION
    }

    private final TypeMoteur typeMoteur;
    private final int heureVole;

    public Avion(String marque, Date dateAchat, long prix, TypeMoteur typeMoteur, int heureVole) {
        super(marque, dateAchat, prix);
        this.typeMoteur = typeMoteur;
        this.heureVole = heureVole;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Heure Vole: " + heureVole);
        System.out.println("TypeMoteur: " + typeMoteur);

    }
}
