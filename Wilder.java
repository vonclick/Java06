public class Wilder {

    // attributs
    private String firstname;
    private boolean aware;

    // constructeurs
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // méthode instanciée
    public String whoAmI() {
    	if (this.isAware() == true) {
    	 return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
    	else {
    		return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
    	
    	
    // accesseurs (getters)
    public String getFirstname() {
        return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // mutateurs (setters)
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}