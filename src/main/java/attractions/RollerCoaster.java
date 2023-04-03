package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;
import stalls.Stall;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {


    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrize() {
        return 8.40;
    }


    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.0){
            return defaultPrize() * 2;
        } else {
            return defaultPrize();
        }
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge()>= 12 && visitor.getHeight()>= 1.45){
            return true;
        } return false;

    }


    public String review() {
        return "Review: " + this.getName() + " Rating: " + this.getRating();
    }

}
