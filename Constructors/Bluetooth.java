public class Bluetooth{
	
	public String deviceName;
	public int price;
	public boolean bluetooth_Connected;
	public String[] available_Devices;
	public byte users;
	
	//instance variable
    
	public String name;
	public int priceis;
	public boolean connected;
	public byte usersare;
	
	public Bluetooth(){
		System.out.println("no arguments present");
	}
	
	public Bluetooth(String deviceName,int price,boolean bluetooth_Connected,String[] available_Devices,byte users){
		
	this.deviceName = deviceName;
	this.price=price;
	this.bluetooth_Connected=bluetooth_Connected;
	this.available_Devices=available_Devices;
	this.users=users;
	
	System.out.println("Device Name is:"+deviceName);
    System.out.println("Price is:"+price);
	System.out.println("Bluetooth is connected:"+bluetooth_Connected);
	System.out.println("Available devices is:"+available_Devices);
	for(int i=0;i<available_Devices.length;i++){
	System.out.println("topChannelsName:"+available_Devices[i]);
		}
	
	System.out.println("Total users:"+users);
	
	}
	
	

}