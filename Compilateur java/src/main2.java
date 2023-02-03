import java.util.Scanner;
//ADDITIONS EN HEXA
public class main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.parseInt(scan.nextLine(), 16);
        System.out.print("Enter the number: ");
        int num2 = Integer.parseInt(scan.nextLine(),16);
        System.out.println(Integer.toBinaryString(num+num2));
    }
}
