public class Bakery{
	public String location;
	public byte totalItems;
	public char grade;
	public String[] itemsare;
		//instance variable
	public String locationis;
	public byte items;
	public char gradeis;
	public String nameOfItem;
	
	public Bakery(){
						System.out.println("no arguments present");
	}
	
	public Bakery(String location,byte totalItems,char grade,String[] itemsare){
	this.location = location;
	this.totalItems=totalItems;
	this.grade=grade;
	this.itemsare=itemsare;
	
	System.out.println("location:"+location);
    System.out.println("totalItems:"+totalItems);
	System.out.println("grade is:"+grade);
	for(int i=0;i<itemsare.length;i++){
	System.out.println("Items are:"+itemsare[i]);
		}
	
	System.out.println("Itemsare:"+itemsare);
	}
}

