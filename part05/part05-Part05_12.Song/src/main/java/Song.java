
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(Object compared) {
        // If same location then true
        if (this == compared) {
            return true;
        }
        
        // If not data type Song then false
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // Convert object to type Song
        Song comparedSong = (Song) compared;
        
        // Compared fields
        if (this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        
        // The not equals
        return false;
    }


}
