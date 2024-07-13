public class SongRunner{
 public static void main(String[] args) {
        Song song = new Song();
        
        song.printTitle("Jote Joteyali");
        song.printArtist("Punneth Rajkumar");
        song.printDuration(183);
        song.printGenres(new String[] {"Rock", "Melody"});
    }
}