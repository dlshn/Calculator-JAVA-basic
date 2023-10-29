import java.util.Scanner;
public class Main {
    public float out;
    public void opr(){

        Scanner Obj = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        float first=Obj.nextFloat();

        System.out.println("Enter Operator : ");
        char operator=Obj.next().charAt(0);

        System.out.println("Enter second Number : ");
        float second=Obj.nextFloat();

        switch (operator) {
            case '+' -> out = first + second;
            case '-' -> out = first - second;
            case '*' -> out = first * second;
            case '/' -> out = first / second;
            case '%' -> out = first % second;
            default -> System.out.println("Operator is not valid!");
        }
        System.out.println("Output is : "+out);
    }

    public static void main(String[] args) {
        Main outObject = new Main();
        outObject.opr();
    }

}