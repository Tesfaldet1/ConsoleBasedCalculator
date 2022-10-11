package ConsoleBasedCalculater;
//to import the Scanner alt + enter
import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        boolean _calculate = true; //sets up loop
        while (_calculate) //creates lop to top
        {
            System.out.println("Hello this is my calculator! ");
            System.out.println("For addition, type add,, for subtraction, type sub");
            System.out.println("For multiplication, type mul, for division, type div");

            //set up scanner
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            //set the cod to read the inputs of the user from the console
            String ranInput = scan.nextLine();
            if ("add".equals(ranInput)) {
                System.out.println("Type the number you would like to add ");
                int _addNumber1 = scan.nextInt();
                System.out.println("type the second number");
                int _addNumber2 = scan.nextInt();
                int _sumOfTheNumber = _addNumber1 + _addNumber2;
                System.out.println(_addNumber1 + "  added to " + _addNumber2 + " = " + _sumOfTheNumber);
            }
            if ("sub".equals(ranInput)) {
                System.out.println("Type the number you would like to subtract ");
                int _subNumber1 = scan.nextInt();
                System.out.println("type the second number");
                int _subNumber2 = scan.nextInt();
                int _subOfTheNumber = _subNumber1 - _subNumber2;
                System.out.println(_subNumber1 + "  subtracted by " + _subNumber2 + " = " + _subOfTheNumber);

            }
            if ("mul".equals(ranInput)) {
                System.out.println("Type the number you would like to multiply ");
                int _mulNumber1 = scan.nextInt();
                System.out.println("type the second number");
                int _mulNumber2 = scan.nextInt();
                int _mulOfTheNumber = _mulNumber1 * _mulNumber2;
                System.out.println(_mulNumber1 + "  multiplied by " + _mulNumber2 + " = " + _mulOfTheNumber);

            }
            if ("div".equals(ranInput)) {
                System.out.println("Type the number you would like to divide ");
                int _divNumber1 = scan.nextInt();
                System.out.println("type the second number");
                int _divNumber2 = scan.nextInt();
                int _divOfTheNumber = _divNumber1 / _divNumber2;
                System.out.println(_divNumber1 + "  divided by " + _divNumber2 + " = " + _divOfTheNumber);

            }
            System.out.println("Do you want to start again? (yes,no)");
            String _startAgain = scan1.nextLine();
            if ("no".equals(_startAgain)){
                _calculate = false;
                System.out.println("Goodbye");
            }
        }
    }
}
