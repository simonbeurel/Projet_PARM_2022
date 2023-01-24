import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Compilator c = new Compilator();
        c.process("C:\\Users\\Proprietaire\\Desktop\\Projet_PARM_2022\\Compilateur java\\src\\test.txt");

        /**HashMap<String,Integer> branchTable = new HashMap<String,Integer>();
        branchTable = Engine.scanBranch(new FileInputStream("C:\\Users\\Proprietaire\\Desktop\\Projet_PARM_2022\\Compilateur java\\src\\test.txt"));
        System.out.println(branchTable);*/



    }
}