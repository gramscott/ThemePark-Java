package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall{

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public int getRating() {
        return 0;
    }
}
