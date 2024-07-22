public class Days{	
	//static String  weekDay[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		static String w = "saturday";
	 static String nw = "Monday";
	public static void main(String[]args){
	//for(int array=0;array<weekDay.length;array++){
	if(w=="Saturday"||nw=="Sunday"){
		System.out.println("The weekend days are:"+w);
		}
		else{
			System.out.println("it is not a weekend:" +nw);
		}
		}
	}