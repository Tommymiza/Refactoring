package iut.bad;

public class Homme extends Humain {
    // Constructeur par défaut
    public Homme() {
        super(); // Appel du constructeur par défaut de la classe parent Humain
    }

    // Constructeur avec paramètres
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel du constructeur avec paramètres de la classe parent Humain
    }
    
    // Surcharge de la méthode toString() pour les hommes
    @Override
    public String toString() {
        return "C'est un homme\n" + super.toString(); // Appel de la méthode toString() de la classe parent Humain
    }
}
