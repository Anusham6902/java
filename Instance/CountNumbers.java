public class CountNumbers{
   public static void main(String args[]){
   int number[]={0,1,0,0,1,0,1,0,1};
   int ZeroCount=0;
   int OneCount=0;
   for(int index=0;index<number.length;index++){
	    if(number[index]==0){
		      ZeroCount++;
			   System.out.println("display  zero Count:" +number[index]);
		    }else if(number[index]==0){
			   OneCount++;
		     System.out.println("display ones Count:" +number[index]);
		   }
	   }
   }
}
	
	
