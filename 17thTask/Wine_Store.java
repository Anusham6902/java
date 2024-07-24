public class Wine_Store{
	
	public String storeName;
	public int totalItems;
	public byte price;
	public String[] itemsName;
	
		//instance variable
      public String name;
	public int totalItemsare;
	public byte priceIs;
	public String itemName;
	
				public Wine_Store(){
		System.out.println("no arguments present");
	}
	public Wine_Store(String storeName,int totalItems, byte price,String[] itemsName){
		
	this.storeName = storeName;
	this.totalItems=totalItems;
	this.price=price;
	this.itemsName=itemsName;
	
	System.out.println(" Name is:"+storeName);
    System.out.println("Total Items are:"+totalItems);
	System.out.println("Price:"+price);
	for(int i=0;i<itemsName.length;i++){
	System.out.println("Items Name:"+itemsName[i]);
		}
	
	System.out.println("itemsName:"+itemsName);
	
	}

}
	