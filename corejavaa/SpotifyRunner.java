public class SpotifyRunner {
    public static void main(String[] args) {
      
        System.out.println("Song Details:");
        Spotify.songDetails();
        
        System.out.println("\nPlaylist Details:");
        Spotify.playlistDetails();
        
        System.out.println("\nUser Account Details:");
        Spotify.userAccountDetails();
        
        String[] songs = {"Shape of You", "Blinding Lights", "Dance Monkey"};
        System.out.println("\nRecent Plays:");
        Spotify.recentPlays(songs);
    }
}