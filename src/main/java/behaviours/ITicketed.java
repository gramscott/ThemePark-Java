package behaviours;

import people.Visitor;

public interface ITicketed {

    public double defaultPrize();

    public double priceFor(Visitor visitor);



}
