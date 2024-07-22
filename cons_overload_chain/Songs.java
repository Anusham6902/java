public class Songs{
	public String name;
	public String language;
	public float ratings;
	public boolean available;
	public int released_Year;
	public String singer;
	
	public Songs(String name){
		System.out.println("contain one argument");
		this.name=name;
				this("kannada");

				//this("nin indale");

		System.out.println("Name is:"+name);
		System.out.println("------------------------");
	}
	public Songs(String language){
		System.out.println("contain one argument");
	
		this.language=language;
		this(4.9f);

		System.out.println("Name is:"+name);
		System.out.println("Language is:"+language);
        System.out.println("------------------------");
	}
	public Songs(float ratings){
		System.out.println("contain one argument");
		this.ratings=ratings;
				this("kannada");

		System.out.println("Name is:"+name);
		System.out.println("Language is:"+language);
		System.out.println("Ratings are:"+ratings);
        System.out.println("------------------------");
	}
	public Songs(boolean available){
		System.out.println("contain one argument");
	     this.available=available;
		this(true);
		

		System.out.println("Name is:"+name);
		System.out.println("Language is:"+language);
		System.out.println("Ratings are:"+ratings);
        System.out.println("------------------------");
	}
	public Songs(int released_Year){
		System.out.println("contain one argument");
	    this.released_Year=released_Year;
		this(2012);

		System.out.println("Name is:"+name);
		System.out.println("Language is:"+language);
		System.out.println("Ratings are:"+ratings);
		System.out.println("Released Year:"+released_Year);
        System.out.println("------------------------");
	}
public Songs(String singer){
		System.out.println("contain one argument");
	    this.singer=singer;
		this("Nin indale");
		System.out.println("Name is:"+name);
		System.out.println("Language is:"+language);
		System.out.println("Ratings are:"+ratings);
		System.out.println("Released Year:"+released_Year);
		System.out.println("singer:"+singer);
       System.out.println("------------------------");
	}
}