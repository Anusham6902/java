public class College1{
//instance varables
   public  String name;
   public  int fee;
   public  float rate;
   public  int totalstudents;
   public  String subject;
   public  int marks;
   
   public College1(int fee){
       this(4000);
	   this.fee=fee;
	   System.out.println("fee is:"+fee);
   }
   
   public College1(float rate){
       this("xworkz");
	   this.rate=rate;
	   System.out.println("rate is:"+rate);
	   
   }
	public College1(byte totalstudents){
       this(3.5f);
	   this.totalstudents=totalstudents;
	   System.out.println("total students is:"+totalstudents);
	   
   }
   public College1(String subject){
       this(50);
	   this.subject=subject;
	   System.out.println("subject is:"+subject);
	}
	
	public College1(short marks){
       this("java");
	   this.marks=marks;
	   System.out.println("marks is:"+marks);
	}

    
    
 


}