public class Instagram{
     
	 static int followers;
	 static String  userName; 
	 static int following;
	 static long viwers; 
	 static String loginId;
	 static String passWord;
	 static long phonenumber; 
	 static boolean userActive; 
	 static float appRatings; 
	 static int posts; 
	 static char grade; 
	 static double likes;
	 
	 public static void aboutInsta(){
	 followers = 1000;
	 userName = "Anusha";
	  following = 700;
	 viwers = 1234526775L;
	 loginId = "anusha_valmiki";
	 passWord = "anu@123";
	 phonenumber = 9876567845L;
	 userActive = true;
	 appRatings = 4.8f;
	  posts = 5;
	 grade = 'A';
	 likes= 2.5;
	 }
	 
	 public static void main (String args[]){
	System.out.println("total followers:"+followers);
	System.out.println("user:"+userName);
	System.out.println("total following:"+following);
	System.out.println("total viwers:"+viwers);
	System.out.println("loginId is:"+loginId);
	System.out.println("passWord is:"+passWord);
	System.out.println("phonenumber is:"+phonenumber);
	System.out.println("if user is Active :"+userActive);
	System.out.println("appRatings is:"+appRatings);
	System.out.println("total posts:"+posts);
	System.out.println("grade is:"+grade);
    System.out.println("total likes:"+likes);
	Instagram.aboutInsta();
}
}
								