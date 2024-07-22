public class Hospital_Runner{
	public static void main(String[] args){
		Hospital hospital=new Hospital();
		Hospital hospital1=new Hospital("Davanagere");
		Hospital hospital2=new Hospital("Davanagere","SS");
		Hospital hospital3=new Hospital("Davanagere","SS",2009);
		Hospital hospital4=new Hospital("Davanagere","SS",2009,true);
		Hospital hospital5=new Hospital("Davanagere","SS",2009,true,9776785690L);
		Hospital hospital6=new Hospital("Davanagere","SS",2009,true,9776785690L,4.9f);
	}
}