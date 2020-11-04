package Resume2;

public class Result {
	
	String subject; 
	char grade;
	
	
	
	
	 Result(){
		   this.subject = "STIA 1113";
		   this.grade = 'B';
		   
	 }
	  
	 
	 public void displayResult() {
		 Result r = new Result();
		 System.out.println ("\nExam Result" + "\nSubject : " + r.subject + "\nGrade : " + r.grade);
		
	 }
}
