public class Jiosavan{
	public static String music(String recentlyPlayed){
		if (recentlyPlayed.equals ("kanasalu neene")){
			System.out.println("The song is:"+recentlyPlayed);
		}return "kanasalu neene";
	}
		
	public static String podcasts(String trending,int totalsongs){
		if(totalsongs>10){
				System.out.println("The songs are:"+totalsongs);
			}return "end";
		}
		
	public static void info(){
		String singer = "sonunigam";
		double noofsongs = 560;
		if (singer.equals("sonunigam")){
			System.out.println("The singer is:"+singer);
			System.out.println("noofsongs  are:"+noofsongs);
		}
	}
	
	public static void jiotunes(String myjiotune,int noofjiotunes,String songname,float ratings,String songtype){
		if(songtype.equals("jaishreeram")){
				System.out.println("The song Name is:"+songname);
		}else{
				System.out.println("The song name is not equal");
		}
	}
	
}