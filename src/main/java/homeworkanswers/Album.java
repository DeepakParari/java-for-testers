package homeworkanswers;

public class Album {

    private String title;
    private String artist;
    private boolean isDebutAlbum;

    public Album() {

        this.title = "default title";
        this.artist = "default artist";
        this.isDebutAlbum = false;
    }

    public Album(String title, String artist, boolean isDebutAlbum) {

        this.title = title;
        this.artist = artist;
        this.isDebutAlbum = isDebutAlbum;
    }

    public String toString() {

        String isDebutAlbumString = isDebutAlbum ? "" : "not ";
        return String.format("The %s album called '%s' is %stheir debut album", this.artist, this.title, isDebutAlbumString);
    }
}
