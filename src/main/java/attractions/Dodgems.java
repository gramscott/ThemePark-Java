package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }
    public String review() {
        return "Review:" + this.getName() + "Rating" + this.getRating();
    }

    @Override
    public double defaultPrize() {
        return 4.50;
    }
    @Override
    public double priceFor(Visitor visitor) {
        double defaultPrize = 4.50;
        if (visitor.getAge() < 12) {
            return defaultPrize / 2;
        }
        return defaultPrize();
    }

}
