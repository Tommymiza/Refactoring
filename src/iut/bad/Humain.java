package iut.bad;

public class Humain {
    private String nom;
    private String prenom;
    private int age;
    
    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    
    
    public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void details() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age);
    }
	
	@Override
    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age;
    }
}
