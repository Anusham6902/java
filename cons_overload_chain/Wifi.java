public class Wifi{
	
	public String name;
	public boolean available;
	public String[] avl_networks;
	public String saved_network;
	public int password;
	
	public Wifi(){
		System.out.println("contain zero argument");
		System.out.println("------------------------");
	}
	
	public Wifi(String name,boolean available,String[] avl_networks,String saved_network, int password){
				System.out.println("contain five argument");

		this.name=name;
		this.available=available;
		this.avl_networks=avl_networks;
		this.saved_network=saved_network;
		this.password=password;
		
		System.out.println("Name is:"+name);
		System.out.println("Availability:"+available);
		System.out.println("Available networks:"+avl_networks);
		System.out.println("Saved network:"+saved_network);
		System.out.println("Password :"+password);
	}
}
		
	
