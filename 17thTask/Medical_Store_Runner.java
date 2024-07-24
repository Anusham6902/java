public class Medical_Store_Runner{
    public static void main(String args[]){
	    Medical_Store medicalStore = new Medical_Store();
		char[] gradesare ={'A','B','C'};
			    Medical_Store medicalStore1 = new Medical_Store("Apollo", true,(short)10,4.8f,gradesare);
				
				System.out.println("--------------------------------------");		
		        //instance1	
			    Medical_Store medicalStore2 = new Medical_Store();
				medicalStore2.nameIs = "medplus";
				System.out.println("name is:"+medicalStore2.nameIs);
				medicalStore2.avl = true;
				System.out.println("avl:"+medicalStore2.avl);
				medicalStore2.workers = 4;
				System.out.println("Workers are:"+medicalStore2.workers);
				medicalStore2.ratingsare = 4.5f;
				System.out.println("name is:"+medicalStore2.ratingsare);
				
				
				System.out.println("--------------------------------------");		
		        //instance2
			    Medical_Store medicalStore3 = new Medical_Store();
				medicalStore3.nameIs = "Mani store";
				System.out.println("name is:"+medicalStore3.nameIs);
				medicalStore3.avl = true;
				System.out.println("avl:"+medicalStore3.avl);
				medicalStore3.workers = 5;
				System.out.println("Workers are:"+medicalStore3.workers);
				medicalStore3.ratingsare = 4.9f;
				System.out.println("name is:"+medicalStore3.ratingsare);
				
				System.out.println("--------------------------------------");		
		        //instance3
			    Medical_Store medicalStore4 = new Medical_Store();
				medicalStore4.nameIs = "Kavya store";
				System.out.println("name is:"+medicalStore4.nameIs);
				medicalStore4.avl = true;
				System.out.println("avl:"+medicalStore4.avl);
				medicalStore4.workers = 6;
				System.out.println("Workers are:"+medicalStore4.workers);
				medicalStore4.ratingsare = 3.9f;
				System.out.println("name is:"+medicalStore4.ratingsare);
				
				System.out.println("--------------------------------------");		
		        //instance4
			    Medical_Store medicalStore5 = new Medical_Store();
				medicalStore5.nameIs = "Harshitha store";
				System.out.println("name is:"+medicalStore5.nameIs);
				medicalStore5.avl = true;
				System.out.println("avl:"+medicalStore5.avl);
				medicalStore5.workers = 8;
				System.out.println("Workers are:"+medicalStore5.workers);
				medicalStore5.ratingsare = 3.0f;
				System.out.println("name is:"+medicalStore5.ratingsare);
				
				}
}		


  