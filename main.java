package tp1é;

public class main {
	    public static void main(String[] args) {

	    	personnes p1 = new personnes();

	        personnes p2 = new personnes("ayari", "Ahmed", 25, "masculin");

	        p1.affiche();
	        p2.affiche();

	        if (p1.sLastName(p2)) {
	            System.out.println("meme nom de famille");
	        } else {
	            System.out.println("Nom de famille différents");
	        }

	        if (p1.getAge() > p2.getAge()) {
	            System.out.println("p1 est la plus agée");
	        } else if (p2.getAge() > p1.getAge()) {
	            System.out.println("p2 est la plus agée");
	        } else {
	            System.out.println("meme age");
	        }
	    }
	}

