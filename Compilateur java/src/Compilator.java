import java.util.*;
import java.io.*;
public class Compilator {

    public void process(String path_to_file) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(path_to_file);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tab = Engine.parseLine(line);
            switch (tab[0]){
                case "MOVS":
                    System.out.println(Engine.MOVS(line));
                    break;

                default:
                    break;
            }
        }
    }
}
