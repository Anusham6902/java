public class App{
	
     //instance variables
	 public String appName;
	 public int id;
	 public float ratings;
	 public long number;
	 public short followers;
	 public byte following;
	 public char grade;
	 public boolean access;
	 
	 
  public App(){
	System.out.println("No arguments");
} 
 public App(String appName){
	System.out.println("contain one arguments");
	this.appName=appName;
	System.out.println("App name is:"+appName);
	System.out.println("---------------------------");

} 
 public App(String appName,int id){
	System.out.println("contain two arguments");
	this.appName=appName;
	this.id=id;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("---------------------------");
 }
public App(String appName,int id,float ratings){
	System.out.println("contain three arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("---------------------------");
 }
 public App(String appName,int id,float ratings,long number){
	System.out.println("contain four arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	this.number=number;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("Number is:"+number);
   System.out.println("---------------------------");
 }
 public App(String appName,int id,float ratings,long number, short followers){
	System.out.println("contain five arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	this.number=number;
	this.followers=followers;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("Number is:"+number);
	System.out.println("Followers are:"+followers);
    System.out.println("---------------------------");
 }	
  public App(String appName,int id,float ratings,long number, short followers,byte following){
	System.out.println("contain six arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	this.number=number;
	this.followers=followers;
	this.following=following;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("Number is:"+number);
	System.out.println("Followers are:"+followers);
	System.out.println("Following:"+following);
    System.out.println("---------------------------");
  }
public App(String appName,int id,float ratings,long number, short followers,byte following,char grade){
	System.out.println("contain seven arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	this.number=number;
	this.followers=followers;
	this.following=following;
	this.grade=grade;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("Number is:"+number);
	System.out.println("Followers are:"+followers);
	System.out.println("Following:"+following);
	System.out.println("Grade Is:"+grade);
    System.out.println("---------------------------");
  }
  public App(String appName,int id,float ratings,long number, short followers,byte following,char grade,boolean access){
	System.out.println("contain eight arguments");
	this.appName=appName;
	this.id=id;
	this.ratings=ratings;
	this.number=number;
	this.followers=followers;
	this.following=following;
	this.grade=grade;
	this.access=access;
	System.out.println("App name is:"+appName);
    System.out.println("Id is:"+id);
	System.out.println("Rating is:"+ratings);
	System.out.println("Number is:"+number);
	System.out.println("Followers are:"+followers);
	System.out.println("Following:"+following);
	System.out.println("Grade Is:"+grade);
	System.out.println("Access:"+access);
    System.out.println("---------------------------");
  }
  
}
 
