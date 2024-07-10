
public class Statistics {

    private int count;
    private int sum;

    //constructor
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
    //method
    public void addNumber(int userNumb){
        this.sum += userNumb;
        this.count++;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return sum;
    }


    public double average(){
        double average;
        if (count == 0) {
            average = 0;
        }else{
        average = (this.sum*1.0/this.count*1.0)*1.0;
        }
        return average;
    }
}
