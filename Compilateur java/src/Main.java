import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /**Compilator c = new Compilator();
        c.process("C:/Users/Proprietaire/Desktop/Compilateur java/src/test.txt");*/

        FileInputStream file = new FileInputStream("C:/Users/Proprietaire/Desktop/Projet_PARM_2022/Compilateur java/src/test.txt");
        HashMap<String,Integer> branchTable = new HashMap<String,Integer>();
        branchTable = Engine.scanBranch(file);
        System.out.println(branchTable);


    }
}