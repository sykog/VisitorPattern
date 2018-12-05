package items;

import visitor.IVisitable;
import visitor.IVisitor;

public class Album implements IVisitable {

    private String albumName;
    private String artist;
    private int releaseYear;
    private double runtime;

    public Album(String albumName, String artist, int releaseYear, double runtime) {

        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.runtime = runtime;
    }

    public double getRuntime() {

        return runtime;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}
