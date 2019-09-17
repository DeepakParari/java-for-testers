package homework;

public class Album {

    /* 1 */

    // Add three properties to this Book class:
    // - A title
    // - An artist
    // - An indication whether or not this album is the debut album for the artist
    // What data types do these properties have?
    private String title;
    private String artist;
    private boolean debutAlbum;

    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    public Album(String title, String artist, boolean debutAlbum) {
        this.title = title;
        this.artist = artist;
        this.debutAlbum = debutAlbum;
    }

    // Add a no-argument constructor
    // Specify a default value for each property

    public Album() {
        this.title = "Default Title";
        this.artist = "Default Artist";
        this.debutAlbum = true;
    }


    /* 3 */

    // Write a method toString that returns the following sentence:
    //
    // The <artist> album called '<title>' is (not) their debut album
    //
    // whether 'not' appears in the returned string depends on the value of the respective property
    public String toString(){

        if(this.debutAlbum){
            return String.format("The %s album called %s is their debut album",this.artist,this.title);
        }
        return String.format("The %s album called %s is not their debut album",this.artist, this.title);
    }
}
