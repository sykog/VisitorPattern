package visitor;

import items.Album;
import items.Movie;
import items.VideoGame;

public interface IVisitor {

    void visit (Movie movie);
    void visit (Album album);
    void visit (VideoGame videoGame);
}
