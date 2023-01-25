import java.util.*;
import java.io.*;
public class Compilator {
    private HashMap<String,Integer> branchTable = new HashMap<String,Integer>();
    public void process(String path_to_file) throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream file = new FileInputStream(path_to_file);
        branchTable = Engine.scanBranch(file);
        FileInputStream file2 = new FileInputStream(path_to_file);
        Scanner sc = new Scanner(file2);
        int indexLigne = 1;
        PrintWriter writer = new PrintWriter("./output.bin", "UTF-8");
        writer.println("v2.0 raw");
        String ret = "";
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tab = Engine.parseLine(line);
            switch (tab[0]){
                case "lsls":
                    if (tab.length==4){
                        ret+=Engine.generateHexa(Engine.LSLS(line))+" ";
                    }else {
                        ret+=Engine.generateHexa(Engine.LSLS_data_processing(line))+" ";
                    }
                    break;
                case "lsrs":
                    if (tab.length==4){
                        ret+=Engine.generateHexa(Engine.LSRS(line))+" ";
                    }else {
                        ret+=Engine.generateHexa(Engine.LSRS_data_processing(line))+" ";
                    }
                    break;
                case "asrs":
                    if (tab.length==4){
                        ret+=Engine.generateHexa(Engine.ASRS(line))+" ";
                    }else {
                        ret+=Engine.generateHexa(Engine.ASRS_data_processing(line))+" ";
                    }
                    break;
                case "adds":
                    if (tab[3].contains("#")){
                        ret+=Engine.generateHexa(Engine.ADDS_3bits(line))+" ";
                    }else {
                        ret+=Engine.generateHexa(Engine.ADDS_Register(line))+"";
                    }
                    break;
                case "subs":
                    if (tab[3].contains("#")){
                        ret+=Engine.generateHexa(Engine.SUBS_3bits(line))+" ";
                    }else {
                        ret+=Engine.generateHexa(Engine.SUBS_Register(line))+" ";
                    }
                    break;
                case "movs":
                    ret+=Engine.generateHexa(Engine.MOVS(line))+" ";
                    break;
                case "ands":
                    ret+=Engine.generateHexa(Engine.ANDS(line))+" ";
                    break;
                case "eors":
                    ret+=Engine.generateHexa(Engine.EORS(line))+" ";
                    break;
                case "adcs":
                    ret+=Engine.generateHexa(Engine.ADCS(line))+" ";
                    break;
                case "sbcs":
                    ret+=Engine.generateHexa(Engine.SBCS(line))+" ";
                    break;
                case "rors":
                    ret+=Engine.generateHexa(Engine.RORS(line))+" ";
                    break;
                case "tst":
                    ret+=Engine.generateHexa(Engine.TST(line))+" ";
                    break;
                case "rsbs":
                    ret+=Engine.generateHexa(Engine.RSBS(line))+" ";
                    break;
                case "cmp":
                    ret+=Engine.generateHexa(Engine.CMP(line))+" ";
                    break;
                case "cmn":
                    ret+=Engine.generateHexa(Engine.CMN(line))+" ";
                    break;
                case "orrs":
                    ret+=Engine.generateHexa(Engine.ORRS(line))+" ";
                    break;
                case "muls":
                    ret+=Engine.generateHexa(Engine.MULS(line))+" ";
                    break;
                case "bics":
                    ret+=Engine.generateHexa(Engine.BICS(line))+" ";
                    break;
                case "mvns":
                    ret+=Engine.generateHexa(Engine.MVNS(line))+" ";
                    break;
                case "str":
                    ret+=Engine.generateHexa(Engine.STR(line))+" ";
                    break;
                case "ldr":
                    ret+=Engine.generateHexa(Engine.LDR(line))+" ";
                    break;
                case "add":
                    ret+=Engine.generateHexa(Engine.ADD(line))+" ";
                    break;
                case "sub":
                    ret+=Engine.generateHexa(Engine.SUB(line))+" ";
                    break;
                case "bEQ":
                    ret+=Engine.generateHexa(Engine.EQ(line,branchTable))+" ";
                    break;
                case "bNE":
                    ret+=Engine.generateHexa(Engine.NE(line,branchTable))+" ";
                    break;
                case "bCS":
                    ret+=Engine.generateHexa(Engine.CS(line,branchTable))+" ";
                    break;
                case "bCC":
                    ret+=Engine.generateHexa(Engine.CC(line,branchTable))+" ";
                    break;
                case "bMI":
                    ret+=Engine.generateHexa(Engine.MI(line,branchTable))+" ";
                    break;
                case "bPL":
                    ret+=Engine.generateHexa(Engine.PL(line,branchTable))+" ";
                    break;
                case "bVS":
                    ret+=Engine.generateHexa(Engine.VS(line,branchTable))+" ";
                    break;
                case "bVC":
                    ret+=Engine.generateHexa(Engine.VC(line,branchTable))+" ";
                    break;
                case "bHI":
                    ret+=Engine.generateHexa(Engine.HI(line,branchTable))+" ";
                    break;
                case "bLS":
                    ret+=Engine.generateHexa(Engine.LS(line,branchTable))+" ";
                    break;
                case "bGE":
                    ret+=Engine.generateHexa(Engine.GE(line,branchTable))+" ";
                    break;
                case "bLT":
                    ret+=Engine.generateHexa(Engine.LT(line,branchTable))+" ";
                    break;
                case "bGT":
                    ret+=Engine.generateHexa(Engine.GT(line,branchTable))+" ";
                    break;
                case "bLE":
                    ret+=Engine.generateHexa(Engine.LE(line,branchTable))+" ";
                    break;
                case "bAL":
                    ret+=Engine.generateHexa(Engine.AL(line,branchTable))+" ";
                    break;
                case "ub":
                    ret+=Engine.generateHexa(Engine.UB(line))+" ";
                    break;
                case "b":
                    ret+=Engine.generateHexa(Engine.B(line,branchTable))+" ";
                    break;
                default:
                    break;
            }
            indexLigne++;
        }
        writer.println(ret);
        writer.close();
    }
}
