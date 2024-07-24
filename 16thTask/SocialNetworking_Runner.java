public class SocialNetworking_Runner{
  public static void main(String args[]){
   

   //static
   		 System.out.println("name is:"+SocialNetworking.name);
		 System.out.println("startedyear is:"+SocialNetworking.startedyear);
   		 System.out.println("rate is:"+SocialNetworking.rate);
   		 System.out.println("number of users:"+SocialNetworking.no_of_users);
   		 System.out.println("number of followers:"+SocialNetworking.no_of_followers);
   		 System.out.println("total applications:"+SocialNetworking.total_applications);
   		 System.out.println("level is:"+SocialNetworking.level);
   		 System.out.println("value is:"+SocialNetworking.value);
   		 System.out.println("Wikipedia initial is:"+SocialNetworking.Wikipedia_initial);
   		 System.out.println("average salary:"+SocialNetworking.avg_sal);
   		 System.out.println("founder name is:"+SocialNetworking.founder);
		 System.out.println("experience salary:"+SocialNetworking.exp_sal);
         System.out.println("Is available:"+SocialNetworking.iswikipedia_avail);
         System.out.println("Range is:"+SocialNetworking.range);

		 //instance1
		 
        SocialNetworking socialNetworking1 = new SocialNetworking(); 
        socialNetworking1.nameis = "Snapchat";
		 System.out.println("name is:"+socialNetworking1.nameis);
		 socialNetworking1.start_year = 2015;
		 System.out.println("started year:"+socialNetworking1.start_year);
         socialNetworking1.Soft_rate = 4.7f;
		 System.out.println("rate is:"+socialNetworking1.Soft_rate);
		 socialNetworking1.no_users = 180;
		 System.out.println("number of users:"+socialNetworking1.no_users);
		 socialNetworking1.no_followers = 200;
		 System.out.println("number of followers :"+socialNetworking1.no_followers);
		 socialNetworking1.total_applc = 1000000000000L;
		 System.out.println("total applications are:"+socialNetworking1.total_applc);
		 socialNetworking1.soft_level = 234.56;
		 System.out.println("level is:"+socialNetworking1.soft_level);
		 socialNetworking1.softisvalue = true;
		 System.out.println("value is:"+socialNetworking1.softisvalue);
		 socialNetworking1.soft_initial = 'S';
		 System.out.println("initial  is:"+socialNetworking1.soft_initial);
		  socialNetworking1.avg_sl = 45000;
		 System.out.println("avg salary is:"+socialNetworking1.avg_sl);
		  socialNetworking1.found = "Priscill";
		 System.out.println("found in :"+socialNetworking1.found);
		  socialNetworking1.exp_sl = 50000;
		 System.out.println("exp salary is:"+socialNetworking1.exp_sl);
		  socialNetworking1.issoft_avail = true;
		 System.out.println("this software is available:"+socialNetworking1.issoft_avail);
		 
					 

   
  
  }


}