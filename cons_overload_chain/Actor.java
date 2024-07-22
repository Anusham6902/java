public class Actor{
	public String name;
	public short age;
	public String birth_Place;
	public float height;
	public byte total_movies;
	
	public Actor(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
	
	public Actor(String name,short age,String birth_Place,float height,byte total_movies){
		System.out.println("contain five argument");
		this.name=name;
		this.age=age;
		this.birth_Place=birth_Place;
		this.height=height;
		this.total_movies=total_movies;
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Birth place:"+birth_Place);
		System.out.println("Height is:"+height);
		System.out.println("Total movies :"+total_movies);
	}
}