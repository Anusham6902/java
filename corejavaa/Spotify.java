public class Spotify {
    public static void songDetails() {
        String songName = "Shape of You";
        String artist = "Ed Sheeran";
        boolean isPlaying = true;

        if (songName.equals("Shape of You")) {
            System.out.println("Song: " + songName);
        } else {
            System.out.println("Song not found");
        }

        if (isPlaying) {
            System.out.println("The song is currently playing.");
        } else {
            System.out.println("The song is not playing.");
        }

        if (artist.equals("Ed Sheeran")) {
            System.out.println("Artist: " + artist);
        } else {
            System.out.println("Unknown artist");
        }
    }

    public static void playlistDetails() {
        String playlistName = "Top Hits";
        int songCount = 50;
        boolean isPublic = true;

        if (playlistName.equals("Top Hits")) {
            System.out.println("Playlist: " + playlistName);
        } else {
            System.out.println("Playlist not found");
        }

        if (isPublic) {
            System.out.println("The playlist is public.");
        } else {
            System.out.println("The playlist is private.");
        }

        if (songCount > 40) {
            System.out.println("The playlist has many songs.");
        } else {
            System.out.println("The playlist has few songs.");
        }
    }

    public static void userAccountDetails() {
        String userName = "Alice";
        boolean isPremium = true;

        if (userName.equals("Alice")) {
            System.out.println("User: " + userName);
        } else {
            System.out.println("Invalid User");
        }

        if (isPremium) {
            System.out.println("The user has a premium account.");
        } else {
            System.out.println("The user has a free account.");
        }
    }

    public static void recentPlays(String[] songs) {
        for (String song : songs) {
            if (song.equals("Shape of You")) {
                System.out.println("Recently played: " + song);
            } else if (song.equals("Blinding Lights")) {
                System.out.println("Recently played: " + song);
            } else {
                System.out.println("Unknown song: " + song);
            }
        }
    }
}