public class Bus{
	 
	 String type;
	 String busNo;
	 boolean avl;
	 String from;
	 String to;
	 long emergencyNo;
	 String driverName;
	 int driverAge;
	 String conducterName;
	 int conducterAge;
	 
	 public Bus(){
		 System.out.println("contain zero argument");
	 }
	 
	 public Bus( String type,String busNo,boolean avl,String from,String to,long emergencyNo, String driverName,
	 int driverAge, String conducterName,int conducterAge){
		 this.type=type;
		 this.busNo=busNo;
		 this.avl=avl;
		 this.from=from;
		 this.to=to;
		 this.emergencyNo=emergencyNo;
		 this.driverName=driverName;
		 this.driverAge=driverAge;
		 this.conducterName=conducterName;
		 this.conducterAge=conducterAge;
		 
	System.out.println("type:"+type +"Bus no is:"+busNo+"If available:"+avl+"From:"+from+"To:"+to+
		 "Emergency no:"+emergencyNo+"Driver name:"+driverName+"Driver age:"+driverAge+
		 "Conducter name:"+conducterName+"Conducter age:"+conducterAge);
	 }
}
	 
	 
	
