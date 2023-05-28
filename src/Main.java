
import java.util.Scanner;

interface  MyClassInterface {
    public void myFirstNumber (int number);
    public void displayData();
}

class Myclass implements  MyClassInterface {
    boolean isValidUser = false;

    Myclass(boolean initial){
        this.isValidUser = initial;
    }

    public void myFirstNumber(int number){
        System.out.println("My first number is " + number);
    }

    public  void displayData(){
        System.out.println("Hello, my value is " + this.isValidUser);
    }
}

class ScannerClass {
    public void runScanner() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = myScanner.nextLine();

        System.out.println("Result: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        int first_number = 100;
        boolean validUser = false;

        Myclass myClass = new Myclass(validUser);
        ScannerClass scanner = new ScannerClass();

        // from other file
        Profile profile = new Profile();

        profile.setMyName("Muhaimin");
        profile.setMyAge(27);

        System.out.println("My name is: "+ profile.getMyName());
        System.out.println("Age: " + profile.getMyAge());

        myClass.displayData();
        myClass.myFirstNumber(first_number);
        scanner.runScanner();
    }
}
