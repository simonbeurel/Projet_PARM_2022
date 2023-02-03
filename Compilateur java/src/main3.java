import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        System.out.println(Integer.toBinaryString(n1+n2));
    }
}
