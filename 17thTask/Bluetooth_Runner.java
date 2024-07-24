public class Bluetooth_Runner{
    	public static void main(String args[]){
	    Bluetooth bluetooth = new Bluetooth();
		String[] available_Devices ={"Smart TV","L21","poco pods","i12","c_NAME"};
			    Bluetooth bluetooth1 = new Bluetooth("Redmi Sonic Earphones",2000,true,available_Devices,(byte)20);
				
		System.out.println("--------------------------------------");		
		//instance1		
	    Bluetooth bluetooth2 = new Bluetooth(); 
		bluetooth2.name = "Airbuds mini";
		System.out.println("name is:"+bluetooth2.name);
		bluetooth2.priceis = 1000;
		System.out.println("price is:"+bluetooth2.priceis);
		bluetooth2.connected = true;
		System.out.println("connected:"+bluetooth2.connected);
		bluetooth2.usersare = (byte)12;
		System.out.println("users are:"+bluetooth2.usersare);
		
		System.out.println("--------------------------------------");		
		//instance2	
	    Bluetooth bluetooth3 = new Bluetooth(); 
		bluetooth3.name = "poco";
		System.out.println("name is:"+bluetooth3.name);
		bluetooth3.priceis = 4000;
		System.out.println("price is:"+bluetooth3.priceis);
		bluetooth3.connected = true;
		System.out.println("connected:"+bluetooth3.connected);
		bluetooth3.usersare = (byte)5;
		System.out.println("users are:"+bluetooth3.usersare);
		
		System.out.println("--------------------------------------");		
		//instance3	
	    Bluetooth bluetooth4 = new Bluetooth(); 
		bluetooth4.name = "CAR BT";
		System.out.println("name is:"+bluetooth4.name);
		bluetooth4.priceis = 2200;
		System.out.println("price is:"+bluetooth4.priceis);
		bluetooth4.connected = true;
		System.out.println("connected:"+bluetooth4.connected);
		bluetooth4.usersare = (byte)7;
		System.out.println("users are:"+bluetooth4.usersare);
		
		System.out.println("--------------------------------------");		
		//instance4	
	    Bluetooth bluetooth5 = new Bluetooth(); 
		bluetooth5.name = "Airpods 131";
		System.out.println("name is:"+bluetooth5.name);
		bluetooth5.priceis = 500;
		System.out.println("price is:"+bluetooth5.priceis);
		bluetooth5.connected = true;
		System.out.println("connected:"+bluetooth5.connected);
		bluetooth5.usersare = (byte)14;
		System.out.println("users are:"+bluetooth5.usersare);
		
		}
}		


  