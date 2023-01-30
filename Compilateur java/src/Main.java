import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Compilator c = new Compilator();
        c.process("./tests/tests_assembleur/test_conditionnal.txt");

        //test_conditionnal.txt
        //test_data_processing.txt
        //test_load_store.txt
        //test_miscellaneous.txt
        //test_shift_add_sub_move.txt
    }
}