package items;

import visitor.IVisitable;
import visitor.IVisitor;

public class VideoGame implements IVisitable {

    private String name;
    private String developer;
    private double playTimeInHours;

    public VideoGame(String name, String developer, double playTimeInHours) {

        this.name = name;
        this.developer = developer;
        this.playTimeInHours = playTimeInHours;
    }

    public double getPlayTimeInHours() {

        return playTimeInHours;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }
}
