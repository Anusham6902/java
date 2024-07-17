public class Wine_Store_Runner{
	    public static void main(String args[]){
		Wine_Store wineStore = new Wine_Store();
		String[] itemsNames ={"Whisky","Vodka","Brandy"};
		Wine_Store wineStore1 = new Wine_Store("Balaji",20,(byte)80,itemsNames);
		
		
				System.out.println("--------------------------------------");		
		        //instance1	
			    Wine_Store wineStore2 = new Wine_Store();
				wineStore2.name = "ram";
				System.out.println("name is:"+wineStore2.name);
				wineStore2.totalItemsare = 18;
				System.out.println("Total items are :"+wineStore2.totalItemsare);
				wineStore2.priceIs = 50;
				System.out.println("Price is:"+wineStore2.priceIs);
				wineStore2.itemName = "vodka";
				System.out.println("Item name is:"+wineStore2.itemName);
				
				System.out.println("--------------------------------------");		
		        //instance2
			    Wine_Store wineStore3 = new Wine_Store();
				wineStore3.name = "Manjunatha";
				System.out.println("name is:"+wineStore3.name);
				wineStore3.totalItemsare = 14;
				System.out.println("Total items are:"+wineStore3.totalItemsare);
				wineStore3.priceIs = 80;
				System.out.println("Price is:"+wineStore3.priceIs);
				wineStore3.itemName = "Beer";
				System.out.println("Item name is:"+wineStore3.itemName);
		
		System.out.println("--------------------------------------");		
		        //instance3
			    Wine_Store wineStore4 = new Wine_Store();
				wineStore4.name = "Isiri";
				System.out.println("name is:"+wineStore4.name);
				wineStore4.totalItemsare = 20;
				System.out.println("Total items are:"+wineStore4.totalItemsare);
				wineStore4.priceIs = 90;
				System.out.println("Price is:"+wineStore4.priceIs);
				wineStore4.itemName = "Whisky";
				System.out.println("Item name is:"+wineStore4.itemName);
		
		System.out.println("--------------------------------------");		
		        //instance4	
			    Wine_Store wineStore5 = new Wine_Store();
				wineStore5.name = "ram";
				System.out.println("name is:"+wineStore5.name);
				wineStore5.totalItemsare = 18;
				System.out.println("Total items are:"+wineStore5.totalItemsare);
				wineStore5.priceIs =70;
				System.out.println("Price is:"+wineStore5.priceIs);
				wineStore5.itemName = "Oldmonk";
				System.out.println("Item name is:"+wineStore5.itemName);
		
		}
}
					


