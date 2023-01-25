import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Compilator c = new Compilator();
        c.process("./test.txt");
    }
}