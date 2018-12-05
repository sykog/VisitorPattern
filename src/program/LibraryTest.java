package program;

import items.Album;
import items.Movie;
import items.VideoGame;
import visitor.IVisitable;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    public static void main(String[] args) {
        List<IVisitable> items = new ArrayList<>();
        items.add(new Movie("The Shawshank Redemption", 2.37, 1994));
        items.add(new Album("Thriller", "Michael Jackson", 1982, .75));
        items.add(new VideoGame("Skyrim", "Bethesda", 32));

        Library library = new Library(items);

        System.out.println("Total media hours: " + library.calculateTotalHours());
    }
}
