import java.util.ArrayList;
import java.util.Scanner;

public class PointAverage {
    private ArrayList<Integer> numberList;

    public PointAverage(){
        this.numberList = new ArrayList<>();
    }

    public ArrayList<Integer> getArrayList(){
        return this.numberList;
    }

    public int totalParticipants(){
        int totalIndex = 0;
        for (Integer integer : numberList) {
            totalIndex += 1;
        }
        return totalIndex;
    }

    public int totalPoints(){
        int totalPoints = 0;
        for (Integer integer : numberList) {
            totalPoints += integer;
        }
        return totalPoints;
    }

    public double getAverage(){
        double getAverage =  1.0 * this.totalPoints() / this.totalParticipants();
        return getAverage;
    }

    public void takingInput(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }else if(input >= 0 && input <= 100) {
                numberList.add(input);
            }
        }
    }

    //Part 2
    public int passingParticipant(){
        int passedParticipants = 0;
        for (Integer integer : numberList) {
            if (integer >= 50) {
                passedParticipants += 1;
            }
        }
        
        return passedParticipants;
    }

    

    public double pointsAveragePassing(){
        int totalPassingPoints = 0;
        double averagePassing;

        //for total points
        for (Integer integer : numberList) {
            if (integer >= 50) {
                totalPassingPoints += integer;
            }
        }

        return averagePassing = totalPassingPoints * 1.0 / this.passingParticipant();

    }

    //Part 3
    public double passPercentage(){
        double passRate =  100.0 * this.passingParticipant() / this.totalParticipants();
        return passRate;
    }
}