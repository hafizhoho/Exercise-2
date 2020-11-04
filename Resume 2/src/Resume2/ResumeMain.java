package Resume2;

public class ResumeMain {
	
	
	  public static void main(String[] args) {
		  
		  
		  System.out.println("RESUME\n");
		  
		  Biodata bio = new Biodata();
		  CGPA cg = new CGPA();
		  Result r = new Result();
		  Skill s = new Skill();
		  WorkExp w = new WorkExp();
		  
		  
		  
		  bio.displayBio();
		  cg.displayCGPA();
		  r.displayResult();
		  s.displaySkill();
		  w.displayExp();
		  
		  
		  
		  
	  }

}
