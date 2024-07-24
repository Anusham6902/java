public class SuperMarket_Runner{
	    public static void main(String[] args){

	     SuperMarket supermarket = new SuperMarket();
		String[] itemsName ={"Soap","books","masalaitems"};
	     SuperMarket supermarket1 = new SuperMarket("vinutha",4.5f,itemsName); 
		 
		 System.out.println("--------------------------------------");		
		        
				//instance1	
				
			    SuperMarket supermarket2 = new SuperMarket();
				supermarket2.storeNameIs = "savi super market";
				System.out.println("Name  is:"+supermarket2.storeNameIs);
				supermarket2.ratingsAre = 3.8f;
				System.out.println("ratings :"+supermarket2.ratingsAre);
				supermarket2.itemsNameIs = "Beautyproducts";
				System.out.println("Product name is:"+supermarket2.itemsNameIs);
				
				System.out.println("--------------------------------------");		
		       
			   //instance2	
			   
			    SuperMarket supermarket3 = new SuperMarket();
				supermarket3.storeNameIs = "pallavi super market";
				System.out.println("Name  is:"+supermarket3.storeNameIs);
				supermarket3.ratingsAre = 2.8f;
				System.out.println("ratings :"+supermarket3.ratingsAre);
				supermarket3.itemsNameIs = "Icecreams";
				System.out.println("Product name is:"+supermarket3.itemsNameIs);
				
				System.out.println("--------------------------------------");		
		       
			   //instance3
			   
                 SuperMarket supermarket4 = new SuperMarket();
				supermarket4.storeNameIs = "deepu super market";
				System.out.println("Name  is:"+supermarket4.storeNameIs);
				supermarket4.ratingsAre = 4.8f;
				System.out.println("ratings :"+supermarket4.ratingsAre);
				supermarket4.itemsNameIs = "Juicebottole";
				System.out.println("Product name is:"+supermarket4.itemsNameIs);
				
				System.out.println("--------------------------------------");
				
		        //instance4	
				
			    SuperMarket supermarket5 = new SuperMarket();
				supermarket5.storeNameIs = "saaku super market";
				System.out.println("Name  is:"+supermarket5.storeNameIs);
				supermarket5.ratingsAre = 4.3f;
				System.out.println("ratings :"+supermarket5.ratingsAre);
				supermarket5.itemsNameIs = "Chips";
				System.out.println("Product name is:"+supermarket5.itemsNameIs);
		}
}

				
