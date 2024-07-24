public class Bakery_Runner{
    public static void main(String[] args){
         Bakery bakery = new Bakery();
		String[] itemsare ={"kanthisweets","pups","anarkali","chips"};
	     Bakery bakery1 = new Bakery("Chitradurga",(byte)80,'A',itemsare); 
		 
		 System.out.println("--------------------------------------");		
		        //instance1	
			    Bakery bakery2 = new Bakery();
				bakery2.locationis = "Bengaluru";
				System.out.println("Location  is:"+bakery2.locationis);
				bakery2.items = 70;
				System.out.println("items are :"+bakery2.items);
				bakery2.gradeis = 'A';
				System.out.println("gradeis:"+bakery2.gradeis);
				bakery2.nameOfItem = "dilkush";
				System.out.println("Item name is:"+bakery2.nameOfItem);
				
		 System.out.println("--------------------------------------");		
            //instance2	
			    Bakery bakery3 = new Bakery();
				bakery3.locationis = "Davanagere";
				System.out.println("Location  is:"+bakery3.locationis);
				bakery3.items = 60;
				System.out.println("items are :"+bakery3.items);
				bakery3.gradeis = 'D';
				System.out.println("gradeis:"+bakery3.gradeis);
				bakery3.nameOfItem = "honycake";
				System.out.println("Item name is:"+bakery3.nameOfItem); 
		 
		 		 System.out.println("--------------------------------------");		

                //instance3
			    Bakery bakery4 = new Bakery();
				bakery4.locationis = "Mangaluru";
				System.out.println("Location  is:"+bakery4.locationis);
				bakery4.items = 90;
				System.out.println("items are :"+bakery4.items);
				bakery4.gradeis = 'C';
				System.out.println("gradeis:"+bakery4.gradeis);
				bakery4.nameOfItem = "cake";
				System.out.println("Item name is:"+bakery4.nameOfItem); 
		 
		 		 System.out.println("--------------------------------------");		

                //instance4	
			    Bakery bakery5 = new Bakery();
				bakery5.locationis = "Mysuru";
				System.out.println("Location  is:"+bakery5.locationis);
				bakery5.items = 40;
				System.out.println("items are :"+bakery5.items);
				bakery5.gradeis = 'B';
				System.out.println("gradeis:"+bakery5.gradeis);
				bakery5.nameOfItem = "peda";
				System.out.println("Item name is:"+bakery5.nameOfItem); 
		 		 }
}	