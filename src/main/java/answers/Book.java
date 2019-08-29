package answers;

import java.util.Calendar;

public class Book {

    /* 1 */

    // Add three properties to this Book class:
    // - A title
    // - An author
    // - A year of publishing
    // What data types do these properties have?

    private String title;
    private String author;
    private int yearOfPublishing;

    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    // Add a no-argument constructor
    // Specify a default value for each property

    public Book(String title, String author, int yearOfPublishing) {

        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    /* 3 */

    // Write a method that sets the year of publishing to the current year
    // You can easily get this using
    //     Calendar.getInstance().get(Calendar.YEAR);
    // Do you need parameters?
    // What is the return type of the method?

    // Write a method that allows you to overwrite the author with a specified author name
    // Do you need parameters?
    // What is the return type of the method?

    public void setYearOfPublishingToCurrentYear() {

        this.yearOfPublishing = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void setAuthor(String author) {

        this.author = author;
    }
}
