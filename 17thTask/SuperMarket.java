public class SuperMarket{
	
	public String storeName;
	public float ratings;
	public String[] itemsName;
	
		//instance variable
		
	public String storeNameIs;
	public float ratingsAre;
	public String itemsNameIs;
	
	public SuperMarket(){
						System.out.println("no arguments present");
	}
	
	public SuperMarket(String storeName,float ratings,String[] itemsName){
	this.storeName = storeName;
	this.ratings=ratings;
	this.itemsName=itemsName;
	
	System.out.println("storeName:"+storeName);
    System.out.println("ratings:"+ratings);
   for(int i=0;i<itemsName.length;i++){
	System.out.println("itemsName:"+itemsName[i]);
		}
	
	System.out.println("itemsName:"+itemsName);
	}
}

    	