package program;

import visitor.IVisitable;
import visitor.LibraryVisitor;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<IVisitable> items;

    public Library(List<IVisitable> items) {

        this.items = items;
    }

    public double calculateTotalHours() {
        //create a visitor
        LibraryVisitor visitor = new LibraryVisitor();
        //iterate through items
        for(IVisitable item : items) {
            item.acceptVisitor(visitor);

        }

        double totalHours= visitor.getTotalHoursOfMedia();
        return  totalHours;
    }

}
