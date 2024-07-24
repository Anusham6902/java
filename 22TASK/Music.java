public class Music{


public Music(){


System.out.println("instance method");
}





public void song(){


System.out.println("retro");


}

public Music(String name){
	
	
	System.out.println(name);
}


public void playlist(String name){

System.out.println(name);

return;
}


public Music(int year,float rate){
	
	System.out.println(year);
	System.out.println(rate);
}

public void retro(float rate, int year){
	
	
	System.out.println(rate);
	System.out.println(year);
}
public Music(int year,float rate,int budget){
	
	System.out.println(year);
	System.out.println(rate);
	System.out.println(budget);

}
public void like(int no,float rating,int budget){
	
	System.out.println(no);
	System.out.println(rating);
	System.out.println(budget);

	
}}