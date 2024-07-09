public class Chrome{
     public static void search(){
		 String search="anything";
		 System.out.println("searching anything:"+search);
	 }
	 public static void chromehistory(String data){
		 System.out.println("Delete:"+data);
		 
	 }
	 
	 public static String settings(boolean Sync){
		 String help = "manage passkeys";
		 System.out.println("popular help resources");
		 System.out.println("Sync is:"+Sync);
	 return "help";
	 }	 
	 public static String login(){
		 String gmail="mm889303@gmail.com";
		 System.out.println("gmail is:"+gmail);
	 return "end";
	 }
}