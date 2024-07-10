
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(int howManyDays){
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public void advance(){
        if (this.day == 30) {
            if (this.month == 12) {
                this.day = 1;
                this.year += 1;
                this.month = 1;
            }else{
                this.month += 1;
                this.day  = 1;
            }
        }else{
            this.day++;
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newObject = new SimpleDate(this.day, this.month, this.year);
        newObject.advance(days);
        return newObject;
    }
}