import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int numSec = scanner.nextInt();

        int min = numSec /60;
        int hours = numSec/3600;
        System.out.print(hours + " " + min);


        // closing the scanner object
        scanner.close();
    }
}