package basicofjava;

 
//Derived class ExamResult


 class Graduation  extends ExamResult{
	 private String grade;
	
	 public Graduation(String name,String major,int mark,String grade) {
		 super(name,major,mark);
		 this.grade=grade;
	 }
	public void Graduation() {
	PrintDetails();
	System.out.println("Grade="+grade);	
	 }  
	class Main{
	public static void main(String[]args) {
		Graduation grade=new Graduation("Anne","BS",90,"A");
		grade.Graduation();	
	}
	}

	 
	 

	 
}

	 