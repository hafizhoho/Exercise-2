package Resume2;

public class Skill {

	String sf1, sf2;
	
	
	
    Skill() {
    	this.sf1 = "Microsoft Office - 100%";
    	this.sf2 = "Filmora Editor - 60%";
    	
    }
    
    public void displaySkill() {
    	Skill s = new Skill();
    	
    	System.out.println("\nSoftware Skills : ");
    	System.out.println("\nProfessional SKills :" + "\n\t1. " + s.sf1 + "\n\t2. " + s.sf2);
	}
    	
    
    
    
    }
	


