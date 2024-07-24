public class JobApplication{
  //properties
  String job_name;
  int salary;
  String qualification;
  float ctc;
  boolean isfresher;
  int experience;
  String e_name;
  int age;
  String[] skills;
  float percentage;
  
  
  //constructor
  public JobApplication(){
    System.out.println("no argument constructor");
	}
	//all argument constructer
	 public JobApplication(String job_name,int salary,String qualification,float ctc,boolean isfresher,
	 int experience,String e_name,int age){
		 this.job_name=job_name;
		 this.salary=salary;
		 this.qualification=qualification;
		 this.ctc=ctc;
		 this.isfresher=isfresher;
		 this.experience=experience;
		 this.e_name=e_name;
		 this.age=age;
		 System.out.println("name is:"+job_name);
		 System.out.println("salary is:"+salary);
		 System.out.println("qualification is:"+qualification);
		 System.out.println("ctc is:"+ctc);
		 System.out.println("isfresher:"+isfresher);
		 System.out.println("experience is:"+experience);
		 System.out.println("Employee name:"+e_name);
		 System.out.println("age is:"+age);

	 }

  public String getJobApplication(int age){
       this.age=age;
	if(this.age>18){
		System.out.println("eligible for job");
		return " eligible";
  }else{
	  		System.out.println("not eligible for job");

  return "not eligible";
  }
  }
  
 public String getJobApplication(int age,String qualification){
    this.age=age;
    this.qualification=qualification;
	if(this.qualification=="B.E" && this.age>21){
	  System.out.println("eligible for software jobs");
	  return "eligible";
	  }else{
	  System.out.println("not eligible for software jobs");
	  return "not eligible";
	  }
 }
	  
	 public boolean getJobApplication(String qualification,String[] skills){
		 this.qualification=qualification;
		  this.skills=skills;
if(qualification=="B.E" && skills[1]=="Java" && skills[2]=="MySql"){
	System.out.println("eligible to apply for software developer");
				 
	 }else{
		 	System.out.println("Not eligible to apply for software developer");
	 }
		 return true;
	 
	 }
	 
	   public double  percentage(){
		   int marks=80;
		   int totalmarks=90;
		   double percentage=(marks*100)/totalmarks;
		   System.out.println(percentage+"%");
		   if(percentage>5.0 && qualification=="B.E"){
			   System.out.println("percentage:"+percentage);
		   }else{
		 
		   }		   return percentage;

	   }

	 public int getJobApplication(float percentage,String qualification){
		 this.percentage=percentage;
		  this.qualification=qualification;
		 if(this.percentage>5.0){
				  System.out.println("eligible to apply for software developer");
				  return 6;
	 }else{
		 	System.out.println("Not eligible to apply for software developer");

		 return 0;
 
	 }
	 }
}