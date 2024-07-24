public class Jim{
	public String jimName;
	public short totalmembers;
	public float ratings;
	public String[] membersName;
	
	//instance variable
	public String name;
	public short totalmem;
	public float rating;
	public String memName;
	
	public Jim(){
				System.out.println("no arguments present");
	}
	
	public Jim(String jimName,short totalmembers,float ratings,String[] membersName){
	this.jimName = jimName;
	this.totalmembers=totalmembers;
	this.ratings=ratings;
	this.membersName=membersName;
	
	System.out.println(" Name is:"+jimName);
    System.out.println("Total members:"+totalmembers);
	System.out.println("Ratings are:"+ratings);
	for(int i=0;i<membersName.length;i++){
	System.out.println("Members name is:"+membersName[i]);
		}
	
	System.out.println("Members  name:"+membersName);
	}
}
	

	