public class Song {
    
    public void printTitle(String title) {
        if (title != null && !title.isEmpty()) {
            System.out.println("Title: " + title);
        } else {
            System.out.println("Title is empty.");
        }
    }
    
    
    public void printArtist(String artist) {
        if (artist != null && !artist.isEmpty()) {
            System.out.println("Artist: " + artist);
        } else {
            System.out.println("Artist name is empty.");
        }
    }
    
 
    public void printDuration(int duration) {
        if (duration > 0) {
            System.out.println("Duration: " + duration + " seconds");
        } else {
            System.out.println("Invalid duration.");
        }
    }
    
    public void printGenres(String[] genres) {
        if (genres != null && genres.length > 0) {
            System.out.print("Genres: ");
            for (String genre : genres) {
                System.out.print(genre + " ");
            }
            System.out.println();
        } else {
            System.out.println("No genres provided.");
        }
    }

   }