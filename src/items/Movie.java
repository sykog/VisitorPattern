package items;

import visitor.IVisitable;
import visitor.IVisitor;

public class Movie implements IVisitable {

    private String title;
    private double lengthInHours;
    private int releaseYear;

    public Movie(String title, double lengthInHours, int releaseYear) {

        this.title = title;
        this.lengthInHours = lengthInHours;
        this.releaseYear = releaseYear;
    }

    public double getLengthInHours() {

        return lengthInHours;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}
