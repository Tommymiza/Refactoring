package iut.bad;

public class Femme extends Humain{
	private String nom;
    private String prenom;
    private int age;

    
    public Femme() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
