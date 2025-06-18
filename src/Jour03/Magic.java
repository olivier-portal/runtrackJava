package Jour03;

public class Magic {

    public static void main(String[] args) {
        Map map1 = new Map('B', 10);
        Map map2 = new Map('b', 10);
        Map map3 = new Map('n', 10);
        Map map4 = new Map('r', 10);
        Map map5 = new Map('v', 10);

        Magician mag1 = new Magician("Merlin", 50, 2, 56);
        Magician mag2 = new Magician("Gandalf", 73, 6, 85);
        Magician mag3 = new Magician("Harry Potter", 22, 4, 35);
        Magician mag4 = new Magician("Hermione Granger", 22, 4, 35);
        Magician mag5 = new Magician("Ron Wisley", 22, 4, 35);

        Spell spell1 = new Spell("Abracadabra", "Does whatever you want", 25);
        Spell spell2 = new Spell("Avadacadabra", "Kill the enemy", 99);
        Spell spell3 = new Spell("Lumus maxima", "Enlight the environment", 15);
        Spell spell4 = new Spell("Leviato", "Make fly objects", 18);
        Spell spell5 = new Spell("Bouhhh", "Scare kids", 2);

        map1.show();
        map2.show();
        map3.show();
        map4.show();
        map5.show();

        mag1.show();
        mag2.show();
        mag3.show();
        mag4.show();
        mag5.show();

        spell1.show();
        spell2.show();
        spell3.show();
        spell4.show();
        spell5.show();
    }
}

class Card{

    private int cost;

    public Card(int cost) {
        this.cost = cost;
    }

    public void show() {
        System.out.println("Cost : " + cost);
    }
}

class Magician extends Card{

    private String name;
    private int lifePoints;
    private int damagePoints;

    public Magician(String name, int lifePoints, int damagePoints, int cost) {
        super(cost);
        this.name = name;
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
    }

    @Override
    public void show() {
        System.out.println("Magician Card : ");
        System.out.println("Name : " + name);
        System.out.println("Life Points : " + lifePoints);
        System.out.println("Damage Points : " + damagePoints);
        super.show();
        System.out.println("-------------------" );
    }
}

class Map extends Card{
    private char color;

    public Map(char color, int cost) {
        super(cost);
        this.color = color;
    }

    @Override
    public void show() {
        System.out.println("Map card : " );
        System.out.println("Color : " + color);
        super.show();
        System.out.println("-------------------" );
    }
}

class Spell extends Card{
    private String spellName;
    private String spellExplaination;

    public Spell(String spellName, String spellExplaination, int cost) {
        super(cost);
        this.spellName = spellName;
        this.spellExplaination = spellExplaination;
    }
    @Override
    public void show() {
        System.out.println("Spell card : " );
        System.out.println("Spell : " + spellName);
        System.out.println("Explaination : " + spellExplaination);
        super.show();
        System.out.println("-------------------" );
    }
}