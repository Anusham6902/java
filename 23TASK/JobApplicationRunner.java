public class JobApplicationRunner{
  public static void main(String args[]){
	  
  JobApplication job=new JobApplication();
   JobApplication job1=new JobApplication("developer",30000,"BE",4.8f,true,2,"sarika",23);
  job.getJobApplication(43);
    job.getJobApplication(23,"B.E");
	String[] skills = {"Java", "Python", "MySql"};
 job.getJobApplication("B.E",skills);
 job.percentage();
 job.getJobApplication(7.5f,"B.E");
 
  
  
  }



}