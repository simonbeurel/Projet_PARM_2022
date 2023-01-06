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
                case "LSLS":
                    if (tab.length==4){
                        System.out.println(Engine.LSLS(line));
                    }else {
                        System.out.println(Engine.LSLS_data_processing(line));
                    }
                    break;
                case "LSRS":
                    if (tab.length==4){
                        System.out.println(Engine.LSRS(line));
                    }else {
                        System.out.println(Engine.LSRS_data_processing(line));
                    }
                    break;
                case "ASRS":
                    if (tab.length==4){
                        System.out.println(Engine.ASRS(line));
                    }else {
                        System.out.println(Engine.ASRS_data_processing(line));
                    }
                    break;
                case "ADDS":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.ADDS_3bits(line));
                    }else {
                        System.out.println(Engine.ADDS_Register(line));
                    }
                    break;
                case "SUBS":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.SUBS_3bits(line));
                    }else {
                        System.out.println(Engine.SUBS_Register(line));
                    }
                    break;
                case "MOVS":
                    System.out.println(Engine.MOVS(line));
                    break;
                case "ANDS":
                    System.out.println(Engine.ANDS(line));
                    break;
                case "EORS":
                    System.out.println(Engine.EORS(line));
                    break;
                case "ADCS":
                    System.out.println(Engine.ADCS(line));
                    break;
                case "SBCS":
                    System.out.println(Engine.SBCS(line));
                    break;
                case "RORS":
                    System.out.println(Engine.RORS(line));
                    break;
                case "TST":
                    System.out.println(Engine.TST(line));
                    break;
                case "RSBS":
                    System.out.println(Engine.RSBS(line));
                    break;
                case "CMP":
                    System.out.println(Engine.CMP(line));
                    break;
                case "CMN":
                    System.out.println(Engine.CMN(line));
                    break;
                case "ORRS":
                    System.out.println(Engine.ORRS(line));
                    break;
                case "MULS":
                    System.out.println(Engine.MULS(line));
                    break;
                case "BICS":
                    System.out.println(Engine.BICS(line));
                    break;
                case "MVNS":
                    System.out.println(Engine.MVNS(line));
                    break;
                case "STR":
                    System.out.println(Engine.STR(line));
                    break;
                case "LDR":
                    System.out.println(Engine.LDR(line));
                    break;
                case "ADD":
                    System.out.println(Engine.ADD(line));
                    break;
                case "SUB":
                    System.out.println(Engine.SUB(line));
                    break;
                case "EQ":
                    System.out.println(Engine.EQ(line));
                    break;
                case "NE":
                    System.out.println(Engine.NE(line));
                    break;
                case "CS":
                    System.out.println(Engine.CS(line));
                    break;
                case "CC":
                    System.out.println(Engine.CC(line));
                    break;
                case "MI":
                    System.out.println(Engine.MI(line));
                    break;
                case "PL":
                    System.out.println(Engine.PL(line));
                    break;
                case "VS":
                    System.out.println(Engine.VS(line));
                    break;
                case "VC":
                    System.out.println(Engine.VC(line));
                    break;
                case "HI":
                    System.out.println(Engine.HI(line));
                    break;
                case "LS":
                    System.out.println(Engine.LS(line));
                    break;
                case "GE":
                    System.out.println(Engine.GE(line));
                    break;
                case "LT":
                    System.out.println(Engine.LT(line));
                    break;
                case "GT":
                    System.out.println(Engine.GT(line));
                    break;
                case "LE":
                    System.out.println(Engine.LE(line));
                    break;
                case "AL":
                    System.out.println(Engine.AL(line));
                    break;
                case "UB":
                    System.out.println(Engine.UB(line));
                    break;

                default:
                    break;
            }
        }
    }
}
