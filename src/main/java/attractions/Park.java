package attractions;

import behaviours.IReviewed;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }
    public String review() {
        return "Review:" + this.getName() + "Rating" + this.getRating();
    }

}
