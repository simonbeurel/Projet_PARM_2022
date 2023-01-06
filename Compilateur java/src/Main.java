import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Compilator c = new Compilator();
        //c.process("C:/Users/Proprietaire/Desktop/Compilateur java/src/test.txt");

        String s = "0001100001110111";
        int val = Integer.parseInt(s,2);
        System.out.println(Integer.toHexString(val));
    }
}