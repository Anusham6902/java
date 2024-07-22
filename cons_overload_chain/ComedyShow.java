public class ComedyShow{
	public String name;
	public int started_Year;
	public String language;
	public float ratings;
	public boolean present;
	public byte total_Episodes;
	
	public ComedyShow(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
		public ComedyShow(String name){
		System.out.println("contain one argument");
		this.name=name;
		System.out.println("Name is:"+name);
		System.out.println("------------------------");
	}
	

public ComedyShow(String name, int started_Year){
		System.out.println("contain two argument");
		this.name=name;
		this.started_Year=started_Year;
		System.out.println("Name is:"+name+"Started year:"+started_Year);
		System.out.println("------------------------");
	}
	public ComedyShow(String name,int started_Year,String language){
		System.out.println("contain three argument");
		this.name=name;
		this.started_Year=started_Year;
		this.language=language;
		System.out.println("Name is:"+name+"Started year:"+started_Year+"Language is:"+language);
		System.out.println("------------------------");
	}
	
	public ComedyShow(String name,int started_Year,String language,float ratings){
		System.out.println("contain four argument");
		this.name=name;
		this.started_Year=started_Year;
		this.language=language;
		this.ratings=ratings;
		System.out.println("Name is:"+name+ "Started year:"+started_Year+"Language is:"+language+"Ratings are:"+ratings);
		System.out.println("------------------------");
	}
	public ComedyShow(String name,int started_Year,String language,float ratings,boolean present){
		System.out.println("contain five argument");
		this.name=name;
		this.started_Year=started_Year;
		this.language=language;
		this.ratings=ratings;
		this.present=present;
		System.out.println("Name is:"+name+"Started year:"+started_Year+"Language is:"+language+"Ratings are:"+ratings+"Present:"+present);
		System.out.println("------------------------");
	}
	public ComedyShow(String name,int started_Year,String language,float ratings,boolean present,byte total_Episodes){
		System.out.println("contain six argument");
		this.name=name;
		this.started_Year=started_Year;
		this.language=language;
		this.ratings=ratings;
		this.present=present;
		this.total_Episodes=total_Episodes;
		System.out.println("Name is:"+name+"Started year:"+started_Year+"Language is:"+language+"Ratings are:"+ratings+"Present:"+present+"Total episodes:"+total_Episodes);
		System.out.println("------------------------");
	}
}
	