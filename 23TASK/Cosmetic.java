public class Cosmetic{
	String name;
	int price;
	float ratings;
	boolean avl;
	String expDate;
	
	
	//contain all arguments
	public Cosmetic(String name,int price,float ratings,boolean avl,String expDate){
		this.name=name;
		this.price=price;
		this.ratings=ratings;
		this.avl=avl;
		this.expDate=expDate;
		System.out.println("name is:"+name);
		System.out.println("price is:"+price);
		System.out.println("ratings is:"+ratings);
		System.out.println("available:"+avl);
		System.out.println("expDate is:"+expDate);
	}
	
	public void  getinformation(){
		System.out.println("contain zero arguments");
	}
	
	public void getinformation(String name){
this.name=name;
if(name==name){
System.out.println("present in shop");

}else{
	System.out.println("not present in shop");
}
}
	public boolean getinformation(boolean avl){
		this.avl=avl;
		if(avl==true){
			System.out.println("cosmetic is present");
			return true;
		}else{
						System.out.println("cosmetic is not present");
		}return false;
	}

	public 		
		


}

	

	

