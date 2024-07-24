public class Jim_Runner{
 public static void main(String args[]){
	    Jim jim = new Jim();
		String[] membersName ={"hema","latha","ravi","rekha"};
	     Jim jim1 = new Jim("fitnesszone",(short)40,5.0f,membersName);
		 
		 
		
				System.out.println("--------------------------------------");		
		        //instance1	
			    Jim jim2 = new Jim();
				jim2.name = "vikas fitness zone";
				System.out.println("name is:"+jim2.name);
				jim2.totalmem = 18;
				System.out.println("Total items are :"+jim2.totalmem);
				jim2.rating = 4.9f;
				System.out.println("Price is:"+jim2.rating);
				jim2.memName = "lokesh";
				System.out.println("Item name is:"+jim2.memName); 
				
						
				System.out.println("--------------------------------------");		
		        //instance2	
			    Jim jim3 = new Jim();
				jim.name = "manoj fitness zone";
				System.out.println("name is:"+jim3.name);
				jim3.totalmem = 50;
				System.out.println("Total items are :"+jim3.totalmem);
				jim3.rating = 3.9f;
				System.out.println("Price is:"+jim3.rating);
				jim3.memName = "chandan";
				System.out.println("Item name is:"+jim3.memName); 
						
				System.out.println("--------------------------------------");		
		        //instance3	
			    Jim jim4 = new Jim();
				jim4.name = "kiran fitness zone";
				System.out.println("name is:"+jim4.name);
				jim4.totalmem = 70;
				System.out.println("Total items are :"+jim4.totalmem);
				jim4.rating = 4.8f;
				System.out.println("Price is:"+jim4.rating);
				jim4.memName = "Sangeetha";
				System.out.println("Item name is:"+jim4.memName); 
						
				System.out.println("--------------------------------------");		
		        //instance4	
			    Jim jim5 = new Jim();
				jim5.name = "pavan fitness zone";
				System.out.println("name is:"+jim5.name);
				jim5.totalmem = 18;
				System.out.println("Total items are :"+jim5.totalmem);
				jim5.rating = 4.5f;
				System.out.println("Price is:"+jim5.rating);
				jim5.memName = "pooja";
				System.out.println("Item name is:"+jim5.memName); 
				
		 }
 }
		 