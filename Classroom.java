public class Classroom {

    public static void main(String[] args) {

        // méthode instanciée
    	Wilder jeanClaude = new Wilder("Jean-Claude", true);
    	System.out.println("1. " + jeanClaude.whoAmI());    	
    	System.out.println("");
    	
    	Wilder henri = new Wilder("Henri");
    	System.out.println("2. " + henri.whoAmI());    	
    	System.out.println("");    	
   	
        // utilisation de getters      
        System.out.println("3. Prenom du Wilder : " + henri.getFirstname());
        System.out.println("4. Son état est     : " + String.valueOf(henri.isAware()));       
    	System.out.println("");
    	
        System.out.println("5. Prenom du Wilder : " + jeanClaude.getFirstname());
        System.out.println("6. Son état est     : " + String.valueOf(jeanClaude.isAware()));       
    	System.out.println("");         
        
    	// utilisation d'un setter
    	henri.setAware(true);
        System.out.println("7. Maintenant l'état de " + henri.getFirstname()  +" est : " + String.valueOf(henri.isAware()));    	

    }
}