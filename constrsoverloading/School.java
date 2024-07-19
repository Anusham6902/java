public class School{
	
	public String name;
	public int total_Students;
	public short total_Staffs;
	public short total_Toppers;
	public float ratings;
	public boolean open;
	public long hm_Number;
	public char grade;
	public String[] top5_Std;
	
	
	public School(){
		System.out.println("No arguments");
	}
	
	public School(String name){
				System.out.println("Contain one argument");
				 this.name=name;
                 System.out.println("Name is:"+name);
				  System.out.println("---------------------------");

				 
				
	}
	public School(String name, int total_Students){
		System.out.println("Contain two argument");
		this.name = name;
		this.total_Students = total_Students;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("---------------------------");

		
}
      public School(String name, int total_Students,short total_Staffs){
		System.out.println("Contain three argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("---------------------------");

	  }
	    public School(String name, int total_Students,short total_Staffs,short toppers_Name){
		System.out.println("Contain four argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		System.out.println("---------------------------");

	}
	public School(String name, int total_Students,short total_Staffs,short toppers_Name, float ratings){
		System.out.println("Contain five argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		this.ratings=ratings;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		 System.out.println("Ratings:"+ratings);
          System.out.println("---------------------------");
	}
	public School(String name, int total_Students,short total_Staffs,short toppers_Name, float ratings,boolean open){
		System.out.println("Contain six argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		this.ratings=ratings;
		this.open=open;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		 System.out.println("Ratings:"+ratings);
		 System.out.println("Open:"+open);
         System.out.println("---------------------------");
	}
	public School(String name, int total_Students,short total_Staffs,short toppers_Name, float ratings,boolean open,long hm_Number){
		System.out.println("Contain seven argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		this.ratings=ratings;
		this.open=open;
		this.hm_Number=hm_Number;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		 System.out.println("Ratings:"+ratings);
		 System.out.println("Open:"+open);
		 System.out.println("HM Number:"+hm_Number);
          System.out.println("---------------------------");
	}
	public School(String name, int total_Students,short total_Staffs,short toppers_Name, float ratings,boolean open,long hm_Number,char grade){
		System.out.println("Contain eight argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		this.ratings=ratings;
		this.open=open;
		this.hm_Number=hm_Number;
		this.grade=grade;
		
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		 System.out.println("Ratings:"+ratings);
		 System.out.println("Open:"+open);
		 System.out.println("HM Number:"+hm_Number);
		 System.out.println("Grade is:"+grade);
          System.out.println("---------------------------");
	}
	public School(String name, int total_Students,short total_Staffs,short toppers_Name, float ratings,boolean open,long hm_Number,char grade,String[] top5_Std){
		System.out.println("Contain nine argument");
		this.name = name;
		this.total_Students = total_Students;
		this.total_Staffs = total_Staffs;
		this.total_Toppers = total_Toppers;
		this.ratings=ratings;
		this.open=open;
		this.hm_Number=hm_Number;
		this.grade=grade;
		this.top5_Std = top5_Std;
		System.out.println("Name is:"+name);
		System.out.println("Total students are:"+total_Students);
		System.out.println("Total staffs are:"+total_Staffs);
		System.out.println("Toppers are:"+total_Toppers);
		 System.out.println("Ratings:"+ratings);
		 System.out.println("Open:"+open);
		 System.out.println("HM Number:"+hm_Number);
		 System.out.println("Grade is:"+grade);
		 System.out.println("Top 5 Students:"+top5_Std);
		 for(int i=0;i<top5_Std.length;i++){
			 	System.out.println("top5_Std:"+top5_Std[i]);
		 }

         
	
}
