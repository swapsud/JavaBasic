package basicofjava;

public class ExamResult {
//the ExamResult class has 3 field
	private String name;
	private String major;
	private int mark;
	//the ExamResult has one constructor
	public ExamResult(String name,String major,int mark){
		 this.name=name;
		 this.major=major;
		 this.mark=mark;
	}	  
	public void PrintDetails(){
		System.out.println("Student Name="+name);
		System.out.println("Student Major="+major);
		System.out.println("Student Mark="+mark);	
	}
}