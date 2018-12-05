package visitor;

import items.Album;
import items.Movie;
import items.VideoGame;

public class LibraryVisitor implements IVisitor {

    private double totalHoursOfMedia;

    @Override
    public void visit(Movie movie) {
        totalHoursOfMedia += movie.getLengthInHours();
        System.out.println(movie.getLengthInHours());
    }

    @Override
    public void visit(Album album) {
        totalHoursOfMedia += album.getRuntime();
        System.out.println(album.getRuntime());
    }

    @Override
    public void visit(VideoGame videoGame) {
        totalHoursOfMedia += videoGame.getPlayTimeInHours();
        System.out.println(videoGame.getPlayTimeInHours());
    }

    public double getTotalHoursOfMedia() {
        return totalHoursOfMedia;
    }
}
