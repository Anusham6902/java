public class MusicRunner{

public static void main(String args[]){

Music music = new Music();

music.song();

Music music1 = new Music("geetanjali");
String name = "jeeva hovagide";
music1.playlist(name);


Music music2 = new Music(1990,8f);
float rate= 7.9f;
int year = 1983;
music2.retro(rate,year);


Music music3 = new Music(1978,7f,10000);
int no = 8;
float rating = 7.6f;
int budget = 30000;
music3.like(no,rating,budget);
}

}