public class Hospital{
	public String loc;
	public String name;
	public int started_Year;
	public boolean open;
	public long contact_No;
	public float ratings;
	public Hospital(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
	 
	 	public Hospital(String loc){
		System.out.println("contain one argument");
		this.loc=loc;
		System.out.println("Location is:"+loc);
		System.out.println("------------------------");
	}
		public Hospital(String loc,String name){
		System.out.println("contain two argument");
		this.loc=loc;
		this.name=name;
		System.out.println("location is:"+loc);
		System.out.println("Name is:"+name);
        System.out.println("------------------------");
	}
	public Hospital(String loc,String name, int started_Year){
		System.out.println("contain two argument");
		this.loc=loc;
		this.name=name;
		this.started_Year=started_Year;
		System.out.println("location is:"+loc);
		System.out.println("Nme is:"+name);
	    System.out.println("Started Year:"+started_Year);
         System.out.println("------------------------");
	}
	public Hospital(String loc,String name, int started_Year,boolean open){
		System.out.println("contain two argument");
		this.loc=loc;
		this.name=name;
		this.started_Year=started_Year;
		this.open=open;
		System.out.println("location is:"+loc);
		System.out.println("Nme is:"+name);
	    System.out.println("Started Year:"+started_Year);
	    System.out.println("Open:"+open);
		System.out.println("------------------------");
	}
	public Hospital(String loc,String name, int started_Year,boolean open,long contact_No){
		System.out.println("contain two argument");
		this.loc=loc;
		this.name=name;
		this.contact_No=contact_No;
		this.open=open;
		this.started_Year=started_Year;
		System.out.println("location is:"+loc);
		System.out.println("Nme is:"+name);
	    System.out.println("Contact number:"+contact_No);
	    System.out.println("Open:"+open);
	    System.out.println("Started Year:"+started_Year);
         System.out.println("------------------------");
	}
	public Hospital(String loc,String name, int started_Year,boolean open,long contact_No, float ratings){
		System.out.println("contain two argument");
		this.loc=loc;
		this.name=name;
		this.contact_No=contact_No;
		this.open=open;
		this.started_Year=started_Year;
		this.ratings=ratings;
		System.out.println("location is:"+loc);
		System.out.println("Nme is:"+name);
	    System.out.println("Contact number:"+contact_No);
	    System.out.println("Open:"+open);
	    System.out.println("Started Year:"+started_Year);
		System.out.println("Ratings:"+ratings);
        System.out.println("------------------------");
	}
}