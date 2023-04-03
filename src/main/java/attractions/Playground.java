package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 15){
            return true;
        } return false;
    }
    public String review() {
        return "Review:" + this.getName() + "Rating" + this.getRating();
    }

}
