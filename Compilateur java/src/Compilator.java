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
                case "lsls":
                    if (tab.length==4){
                        System.out.println(Engine.LSLS(line));
                    }else {
                        System.out.println(Engine.LSLS_data_processing(line));
                    }
                    break;
                case "lsrs":
                    if (tab.length==4){
                        System.out.println(Engine.LSRS(line));
                    }else {
                        System.out.println(Engine.LSRS_data_processing(line));
                    }
                    break;
                case "asrs":
                    if (tab.length==4){
                        System.out.println(Engine.ASRS(line));
                    }else {
                        System.out.println(Engine.ASRS_data_processing(line));
                    }
                    break;
                case "adds":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.ADDS_3bits(line));
                    }else {
                        System.out.println(Engine.ADDS_Register(line));
                    }
                    break;
                case "subs":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.SUBS_3bits(line));
                    }else {
                        System.out.println(Engine.SUBS_Register(line));
                    }
                    break;
                case "movs":
                    System.out.println(Engine.MOVS(line));
                    break;
                case "ands":
                    System.out.println(Engine.ANDS(line));
                    break;
                case "eors":
                    System.out.println(Engine.EORS(line));
                    break;
                case "adcs":
                    System.out.println(Engine.ADCS(line));
                    break;
                case "sbcs":
                    System.out.println(Engine.SBCS(line));
                    break;
                case "rors":
                    System.out.println(Engine.RORS(line));
                    break;
                case "tst":
                    System.out.println(Engine.TST(line));
                    break;
                case "rsbs":
                    System.out.println(Engine.RSBS(line));
                    break;
                case "cmp":
                    System.out.println(Engine.CMP(line));
                    break;
                case "cmn":
                    System.out.println(Engine.CMN(line));
                    break;
                case "orrs":
                    System.out.println(Engine.ORRS(line));
                    break;
                case "muls":
                    System.out.println(Engine.MULS(line));
                    break;
                case "bics":
                    System.out.println(Engine.BICS(line));
                    break;
                case "mvns":
                    System.out.println(Engine.MVNS(line));
                    break;
                case "str":
                    System.out.println(Engine.STR(line));
                    break;
                case "ldr":
                    System.out.println(Engine.LDR(line));
                    break;
                case "add":
                    System.out.println(Engine.ADD(line));
                    break;
                case "sub":
                    System.out.println(Engine.SUB(line));
                    break;
                case "eq":
                    System.out.println(Engine.EQ(line));
                    break;
                case "ne":
                    System.out.println(Engine.NE(line));
                    break;
                case "cs":
                    System.out.println(Engine.CS(line));
                    break;
                case "cc":
                    System.out.println(Engine.CC(line));
                    break;
                case "mi":
                    System.out.println(Engine.MI(line));
                    break;
                case "pl":
                    System.out.println(Engine.PL(line));
                    break;
                case "vs":
                    System.out.println(Engine.VS(line));
                    break;
                case "vc":
                    System.out.println(Engine.VC(line));
                    break;
                case "hi":
                    System.out.println(Engine.HI(line));
                    break;
                case "ls":
                    System.out.println(Engine.LS(line));
                    break;
                case "ge":
                    System.out.println(Engine.GE(line));
                    break;
                case "lt":
                    System.out.println(Engine.LT(line));
                    break;
                case "gt":
                    System.out.println(Engine.GT(line));
                    break;
                case "le":
                    System.out.println(Engine.LE(line));
                    break;
                case "al":
                    System.out.println(Engine.AL(line));
                    break;
                case "ub":
                    System.out.println(Engine.UB(line));
                    break;

                default:
                    break;
            }
        }
    }
}
