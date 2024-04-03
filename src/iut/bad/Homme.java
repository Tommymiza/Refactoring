package iut.bad;

public class Homme extends Humain{
    // Champs
    private String nom;
    private String prenom;
    private int age;

    
    public Homme() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

   
}
