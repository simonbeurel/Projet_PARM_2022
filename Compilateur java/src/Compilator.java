import java.util.*;
import java.io.*;
public class Compilator {
    private HashMap<String,Integer> branchTable = new HashMap<String,Integer>();
    public void process(String path_to_file) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(path_to_file);
        branchTable = Engine.scanBranch(file);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tab = Engine.parseLine(line);
            switch (tab[0]){
                case "lsls":
                    if (tab.length==4){
                        System.out.println(Engine.generateHexa(Engine.LSLS(line)));
                    }else {
                        System.out.println(Engine.generateHexa(Engine.LSLS_data_processing(line)));
                    }
                    break;
                case "lsrs":
                    if (tab.length==4){
                        System.out.println(Engine.generateHexa(Engine.LSRS(line)));
                    }else {
                        System.out.println(Engine.generateHexa(Engine.LSRS_data_processing(line)));
                    }
                    break;
                case "asrs":
                    if (tab.length==4){
                        System.out.println(Engine.generateHexa(Engine.ASRS(line)));
                    }else {
                        System.out.println(Engine.generateHexa(Engine.ASRS_data_processing(line)));
                    }
                    break;
                case "adds":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.generateHexa(Engine.ADDS_3bits(line)));
                    }else {
                        System.out.println(Engine.generateHexa(Engine.ADDS_Register(line)));
                    }
                    break;
                case "subs":
                    if (tab[3].contains("#")){
                        System.out.println(Engine.generateHexa(Engine.SUBS_3bits(line)));
                    }else {
                        System.out.println(Engine.generateHexa(Engine.SUBS_Register(line)));
                    }
                    break;
                case "movs":
                    System.out.println(Engine.generateHexa(Engine.MOVS(line)));
                    break;
                case "ands":
                    System.out.println(Engine.generateHexa(Engine.ANDS(line)));
                    break;
                case "eors":
                    System.out.println(Engine.generateHexa(Engine.EORS(line)));
                    break;
                case "adcs":
                    System.out.println(Engine.generateHexa(Engine.ADCS(line)));
                    break;
                case "sbcs":
                    System.out.println(Engine.generateHexa(Engine.SBCS(line)));
                    break;
                case "rors":
                    System.out.println(Engine.generateHexa(Engine.RORS(line)));
                    break;
                case "tst":
                    System.out.println(Engine.generateHexa(Engine.TST(line)));
                    break;
                case "rsbs":
                    System.out.println(Engine.generateHexa(Engine.RSBS(line)));
                    break;
                case "cmp":
                    System.out.println(Engine.generateHexa(Engine.CMP(line)));
                    break;
                case "cmn":
                    System.out.println(Engine.generateHexa(Engine.CMN(line)));
                    break;
                case "orrs":
                    System.out.println(Engine.generateHexa(Engine.ORRS(line)));
                    break;
                case "muls":
                    System.out.println(Engine.generateHexa(Engine.MULS(line)));
                    break;
                case "bics":
                    System.out.println(Engine.generateHexa(Engine.BICS(line)));
                    break;
                case "mvns":
                    System.out.println(Engine.generateHexa(Engine.MVNS(line)));
                    break;
                case "str":
                    System.out.println(Engine.generateHexa(Engine.STR(line)));
                    break;
                case "ldr":
                    System.out.println(Engine.generateHexa(Engine.LDR(line)));
                    break;
                case "add":
                    System.out.println(Engine.generateHexa(Engine.ADD(line)));
                    break;
                case "sub":
                    System.out.println(Engine.generateHexa(Engine.SUB(line)));
                    break;
                case "eq":
                    System.out.println(Engine.generateHexa(Engine.EQ(line)));
                    break;
                case "ne":
                    System.out.println(Engine.generateHexa(Engine.NE(line)));
                    break;
                case "cs":
                    System.out.println(Engine.generateHexa(Engine.CS(line)));
                    break;
                case "cc":
                    System.out.println(Engine.generateHexa(Engine.CC(line)));
                    break;
                case "mi":
                    System.out.println(Engine.generateHexa(Engine.MI(line)));
                    break;
                case "pl":
                    System.out.println(Engine.generateHexa(Engine.PL(line)));
                    break;
                case "vs":
                    System.out.println(Engine.generateHexa(Engine.VS(line)));
                    break;
                case "vc":
                    System.out.println(Engine.generateHexa(Engine.VC(line)));
                    break;
                case "hi":
                    System.out.println(Engine.generateHexa(Engine.HI(line)));
                    break;
                case "ls":
                    System.out.println(Engine.generateHexa(Engine.LS(line)));
                    break;
                case "ge":
                    System.out.println(Engine.generateHexa(Engine.GE(line)));
                    break;
                case "lt":
                    System.out.println(Engine.generateHexa(Engine.LT(line)));
                    break;
                case "gt":
                    System.out.println(Engine.generateHexa(Engine.GT(line)));
                    break;
                case "le":
                    System.out.println(Engine.generateHexa(Engine.LE(line)));
                    break;
                case "al":
                    System.out.println(Engine.generateHexa(Engine.AL(line)));
                    break;
                case "ub":
                    System.out.println(Engine.generateHexa(Engine.UB(line)));
                    break;

                default:
                    break;
            }
        }
    }
}
