
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        int ownArea = this.squares * this.squares * this.rooms;
        int compareArea = compared.squares * compared.squares * compared.rooms;
        if (ownArea > compareArea) {
            return true;
        }
        return false;
    }

    public int price(Apartment compared){
        int ownPrice = this.pricePerSquare * this.squares;
        int comparePrice = compared.pricePerSquare * compared.squares;
        int priceDifference = ownPrice - comparePrice;
        return priceDifference;
    }

    public int priceDifference(Apartment compared){
        if (price(compared) < 0) {
            return price(compared) * -1; 
        }
        return price(compared);
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (price(compared) > 0) {
            return true;
        }
        return false;
    }
}
