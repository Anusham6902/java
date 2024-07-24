public class Medical_Store{
	
	public String name;
	public boolean available;
    public short total_Workers; 
    public float ratings;
    public char[] grades; 
	
		//instance variable
		
	public String nameIs;
	public boolean avl;
    public short workers; 
    public float ratingsare;
    public char grade; 
	

	
			public Medical_Store(){
		System.out.println("no arguments present");
	}
	public Medical_Store(String name,boolean available,short total_Workers,float ratings,char[] grades){
		
	this.name = name;
	this.available=available;
	this.total_Workers=total_Workers;
	this.ratings=ratings;
	this.grades=grades;
	
	System.out.println(" Name is:"+name);
    System.out.println("Availability:"+available);
	System.out.println("Total workers are:"+total_Workers);
	System.out.println("ratings are:"+ratings);
	for(int i=0;i<grades.length;i++){
	System.out.println("grades are:"+grades[i]);
		}
	
	System.out.println("Grades:"+grades);
	
	}

}
	
