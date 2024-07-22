public class Integers{	
	public static void main(String[]args){
		int numbers[]={-1,2,-3,4,-8,-9};
		int pcount=0;
		int ncount=0;
		for(int i=0;i<numbers.length;i++){
			
				if (numbers[i]>=0){
					pcount ++;
					
				}
				else{
					ncount++;
					
				}
			}
		System.out.println("The	positive numbers are:"+pcount);
		System.out.println("The	negative numbers are:"+ncount);
	}
}