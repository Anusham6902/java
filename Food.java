public class Food{
	public static void foodmenu(){
		
String[] items ={"puliyogere","idily","dose","poori","pongal","ricebath","palav","vangibath","alooparata","chapathi","jolada rotti","masala dosa","kaalidosa","annasamber","parota",
"vegbiriyani","chickenbiriyani","bisibelebath","eggrice"}; 
		
		int[] itemQuatity={1,5,3,7,1,1,4,5,6,9,3,6,4,9,20,12,10,16,4,9};
		
		int[] itemPrice={50,40,35,20,90,80,40,20,10,30,50,80,80,70,60,50,40,30,20,90};
		
		for(int i=0; i<items.length ; i++){
			
			System.out.println("Item are:"+items[i]);
			System.out.println("Quatity is:"+itemQuatity[i]);
			System.out.println("Price is:"+itemPrice[i]);
			
			int sum = itemQuatity[i] * itemPrice[i];
			System.out.println("Total Price is:"+sum);
			}
		
	}

			
		
	}


		
		