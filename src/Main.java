
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

public class Main {
    public static void main(String[] args) {
        int first_number = 100;
        boolean validUser = false;

        Myclass myClass = new Myclass(validUser);

        myClass.displayData();
        myClass.myFirstNumber(first_number);
    }
}
