public class College{
	     
	//instance variables
    public String collegeName;
	public int total_Staff;
	public boolean open;
	public String principalName;
	public float ratings;
	public char grade;
	public int totalStudents;
     public long contactNo;
	 
	 public College(){
		System.out.println("No arguments");
	}
	
	public College(String collegeName){
				System.out.println("Contain one argument");
				 this.collegeName=collegeName;
                 System.out.println(" College name is:"+collegeName);
				 System.out.println("---------------------------");
               }
 	public College(String collegeName,int total_Staff){
				System.out.println("Contain two argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("---------------------------");
          }
	 public College(String collegeName,int total_Staff, boolean open){
				System.out.println("Contain three argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
         System.out.println("---------------------------");
               }
	public College(String collegeName,int total_Staff, boolean open,String principalName){
				System.out.println("Contain four argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
				 this.principalName=principalName;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
		 System.out.println("Principal name:"+principalName);
          System.out.println("---------------------------");
               }		   
			   
	public College(String collegeName,int total_Staff, boolean open,String principalName,float ratings){
				System.out.println("Contain five argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
				 this.principalName=principalName;
				 this.ratings=ratings;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
		 System.out.println("Principal name:"+principalName);
		 System.out.println("Ratings are:"+ratings);
		 System.out.println("---------------------------");
               }
public College(String collegeName,int total_Staff, boolean open,String principalName,float ratings,char grade){
				System.out.println("Contain six argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
				 this.principalName=principalName;
				 this.ratings=ratings;
				 this.grade=grade;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
		 System.out.println("Principal name:"+principalName);
		 System.out.println("Ratings are:"+ratings);
		 System.out.println("Grade is:"+grade);
        System.out.println("---------------------------");
}		 

public College(String collegeName,int total_Staff, boolean open,String principalName,float ratings,char grade, int totalStudents){
				System.out.println("Contain seven argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
				 this.principalName=principalName;
				 this.ratings=ratings;
				 this.grade=grade;
				 this.totalStudents=totalStudents;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
		 System.out.println("Principal name:"+principalName);
		 System.out.println("Ratings are:"+ratings);
		 System.out.println("Grade is:"+grade);
		 		 System.out.println("Total Students:"+totalStudents);
				 System.out.println("---------------------------");
}	
public College(String collegeName,int total_Staff, boolean open,String principalName,float ratings,char grade, int totalStudents, long contactNo){
				System.out.println("Contain eight argument");
				 this.collegeName=collegeName;
				 this.total_Staff=total_Staff;
				 this.open=open;
				 this.principalName=principalName;
				 this.ratings=ratings;
				 this.grade=grade;
				 this.totalStudents=totalStudents;
				 this.contactNo=contactNo;
         System.out.println("College name is:"+collegeName);
         System.out.println("Total staff members:"+total_Staff);
         System.out.println("Opened:"+open);
		 System.out.println("Principal name:"+principalName);
		 System.out.println("Ratings are:"+ratings);
		 System.out.println("Grade is:"+grade);
		 System.out.println("Total Students:"+totalStudents);
		System.out.println("Contact No:"+contactNo);
         System.out.println("---------------------------");
}		 	 
}
	 