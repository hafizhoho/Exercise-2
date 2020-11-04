package Resume2;

public class Biodata {
	String name, birthday, address, marital_status,citizenship, Phone_Number;
	char gender;
	int age;
	
	Biodata() {
		
	

		 this.name = "Muhammad Hafiz Bin Sukhri";
		 this.age = 22;
		 this.gender = 'M';
		 this.birthday = "29 January 1998";
		 this.marital_status = "Single";
		 this.citizenship = "Malaysia";
		 this.address = "B-1-12, Jalan TBK 1/10 Pangsapuri Melur, Taman Bukit Kinrara, 47180 Puchong, Selangor";
		 this.Phone_Number = "011-3789 3552";

}

	public void displayBio() {
			Biodata bio = new Biodata();
			System.out.println("Name: " + bio.name + "\nAge : " +  bio.age + "\nGender : " + bio.gender + "\nBirthday : " + bio.birthday  + "\nMarital Status : " + bio.marital_status + "\nCitizenship : " + bio.citizenship + "\nAddress : " + bio.address + "\nPhone Number : " + bio.Phone_Number);
	}
	
}