public class Counter {
    private int number;

    public Counter(int startValue){
        this.number = startValue;
    }

    public Counter(){
        this(0);
    }

    public void increase(int increaseBy){
        if (increaseBy > 0) {
            this.number += increaseBy;
        }
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        increase(1);
    }

    public void decrease(){
        decrease(1);
    }

    public void decrease(int decreaseBy){
        if (decreaseBy > 0) {
            this.number -= decreaseBy;
        }
    }

    

}