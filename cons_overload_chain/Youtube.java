public class Youtube{
	public String user_Name;
	public byte followers;
	public long views;
	public String url;
	public String joined_Date;
	public short liked_Videos;
	public Youtube(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
	

	 public Youtube(String user_Name){
		System.out.println("contain one argument");
		this.user_Name=user_Name;
		System.out.println("User name:"+user_Name);
		System.out.println("------------------------");
	}
		public Youtube(String user_Name,byte followers){
		System.out.println("contain two argument");
		this.user_Name=user_Name;
		this.followers=followers;
		System.out.println("Name is:"+user_Name);
		System.out.println("followers is:"+followers);
        System.out.println("------------------------");
	}
	public Youtube(String user_Name,byte followers,long views){
		System.out.println("contain three argument");
		this.user_Name=user_Name;
		this.followers=followers;
		this.views=views;
		System.out.println("Name is:"+user_Name);
		System.out.println("followers is:"+followers);
	    System.out.println("views:"+views);
         System.out.println("------------------------");
	}
	public Youtube(String user_Name,byte followers,long views,String url){
		System.out.println("contain four argument");
		this.user_Name=user_Name;
		this.followers=followers;
		this.views=views;
		this.url=url;
		System.out.println("Name is:"+user_Name);
		System.out.println("followers is:"+followers);
	    System.out.println("views:"+views);
	    System.out.println("URL:"+url);
		System.out.println("------------------------");
	}
	public Youtube(String user_Name,byte followers,long views,String url,String joined_Date){
		System.out.println("contain five argument");
		this.user_Name=user_Name;
		this.followers=followers;
		this.views=views;
		this.url=url;
		this.joined_Date=joined_Date;
		System.out.println("Name is:"+user_Name);
		System.out.println("followers is:"+followers);
	    System.out.println("views:"+views);
	    System.out.println("URL:"+url);
	    System.out.println("Joined Date:"+joined_Date);
         System.out.println("------------------------");
	}
	public Youtube(String user_Name,byte followers,long views,String url,String joined_Date,short liked_Videos){
		System.out.println("contain six argument");
		this.user_Name=user_Name;
		this.followers=followers;
		this.views=views;
		this.url=url;
		this.joined_Date=joined_Date;
		this.liked_Videos=liked_Videos;
		System.out.println("Name is:"+user_Name);
		System.out.println("followers is:"+followers);
	    System.out.println("views:"+views);
	    System.out.println("URL:"+url);
	    System.out.println("Joined Date:"+joined_Date);
		System.out.println("Liked Videos:"+liked_Videos);

        System.out.println("------------------------");
	}
}