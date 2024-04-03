package iut.bad;

public class Femme extends Humain {
    // Constructeur par défaut
    public Femme() {
        super(); // Appel du constructeur par défaut de la classe parent Humain
    }

    // Constructeur avec paramètres
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel du constructeur avec paramètres de la classe parent Humain
    }
    
    // Surcharge de la méthode toString() pour les femmes
    @Override
    public String toString() {
        return "C'est une femme\n" + super.toString(); // Appel de la méthode toString() de la classe parent Humain
    }
}
