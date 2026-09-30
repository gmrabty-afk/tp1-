package tp1é;

public class personnes {
	private String  nom;
	private String prenom;
	private int age;
	private String sexe;
	

	public personnes() {
	    nom = "Ben Ali";
	    prenom = "Med";
	    age = 30;
	    sexe = "masculin";
	}
	personnes p1 = new personnes();
	
	public personnes(String nom, String prenom, int age, String sexe) {
	    this.nom = nom;
	    this.prenom = prenom;
	    this.age = age;
	    this.sexe = sexe;
}
	public String getNom() {
	    return nom;
	}
	public String getPrenom() {
	    return prenom;
	}
	public int getAge() {
	    return age;
	}
	public String getSexe() {
	    return sexe;
	}
	 public void affiche() {
	        System.out.println("Nom : " + nom);
	        System.out.println("Prénom : " + prenom);
	        System.out.println("Age : " + age);
	        System.out.println("Sexe : " + sexe);
	    }

	    public boolean sLastName(personnes p) {
	        return this.nom== p.nom ;
	    }
	
	
       

        
        
        
}
