public class Youtube_Runner{
	public static void main(String[] args){
		Youtube youtube=new Youtube();
		Youtube youtube1=new Youtube("Sagar");
		Youtube youtube2=new Youtube("Sagar",(byte)99);
		Youtube youtube3=new Youtube("Sagar",(byte)99,100000000L);
		Youtube youtube4=new Youtube("Sagar",(byte)99,100000000L,"youtube.com");
		Youtube youtube5=new Youtube("Sagar",(byte)99,100000000L,"youtube.com","20-2-11");
		Youtube youtube6=new Youtube("Sagar",(byte)99,100000000L,"youtube.com","20-2-11",(short)50);
	}
}

