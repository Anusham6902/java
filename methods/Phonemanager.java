public class Phonemanager{
	
  public static void datausage(String thisMonth){
  System.out.println("total data used this month:"+thisMonth);
  }
  
    public static void tools(String hideApps,String password){
		System.out.println("appname is:"+hideApps);
	 if(hideApps!=password){
		 System.out.println("Entered correct password:"+password);
	 }else{
		 		 System.out.println("Entered wrong password:"+password);
	 }
       
	}
	
	public static boolean storage(String clean,boolean storagespace){
		if(storagespace== true){
		System.out.println("Storage clear:"+clean);
		}else{
		System.out.println("Storage full");
		}return true;
	}
	
	public static boolean privacy(String appLock,boolean privatepassword){
		if(privatepassword == true){
		System.out.println("apps locked:"+privatepassword);
		}else{
		System.out.println("Forgotpassword");
		}return true;
	}
	
}
    
	

  
  
  