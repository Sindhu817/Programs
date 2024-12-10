/*Create a class Library with a method displayLibraryInfo(). Derive two subclasses PublicLibrary and DigitalLibrary
that add their unique methods. Write a program to display information for both subclasses, showcasing the use of inheritance.*/

package Library;
// LibrarySystem interface
interface LibrarySystem {
    void displayLibraryInfo();
}

// PublicLibrary class implementing LibrarySystem
class PublicLibrary implements LibrarySystem {
    private String name;
    private String location;
    private int numberOfBooks;

    public PublicLibrary(String name, String location, int numberOfBooks) {
        this.name = name;
        this.location = location;
        this.numberOfBooks = numberOfBooks;
    }
    public void displayLibraryInfo() {
        System.out.println("Public Library Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Books: " + numberOfBooks);
    }

    public void conductEvents() {
        System.out.println(name + " organizes community events.");
    }
}

// DigitalLibrary class implementing LibrarySystem
class DigitalLibrary implements LibrarySystem {
    private String name;
    private String location;
    private int numberOfEBooks;
    public DigitalLibrary(String name, String location, int numberOfEBooks) {
        this.name = name;
        this.location = location;
        this.numberOfEBooks = numberOfEBooks;
    }
    public void displayLibraryInfo() {
        System.out.println("Digital Library Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of eBooks: " + numberOfEBooks);
    }

    public void OnlineAccess() {
        System.out.println(name + " offers 24/7 online access.");
    }
}
// Main class to demonstrate functionality
public class Library {
    public static void main(String[] args) {
        // Create PublicLibrary and DigitalLibrary objects
        PublicLibrary publicLibrary = new PublicLibrary("City Library", "Downtown", 50000);
        DigitalLibrary digitalLibrary = new DigitalLibrary("Online Library", "Cloud", 20000);
        // Display PublicLibrary information
        System.out.println("Public Library Info:");
        publicLibrary.displayLibraryInfo();
        publicLibrary.conductEvents();
        System.out.println();
        // Display DigitalLibrary information
        System.out.println("Digital Library Info:");
        digitalLibrary.displayLibraryInfo();
        digitalLibrary.OnlineAccess();
    }
}
