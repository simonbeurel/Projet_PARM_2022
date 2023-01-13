import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Engine {

    /** METHODES PERMETTANT DE TRAITER TOUTES LES INSTRUCTIONS*/
    public static String LSLS(String asm){
        String[] tab = parseLine(asm);
        return "00000"+generateIMMM(tab[3],5)+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String LSRS(String asm){
        String[] tab = parseLine(asm);
        return "00001"+generateIMMM(tab[3],5)+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ASRS(String asm){
        String[] tab = parseLine(asm);
        return "00010"+generateIMMM(tab[3],5)+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ADDS_Register(String asm){
        String[] tab = parseLine(asm);
        return "0001100"+generateRegistre(tab[3])+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String SUBS_Register(String asm){
        String[] tab = parseLine(asm);
        return "0001101"+generateRegistre(tab[3])+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ADDS_3bits(String asm){
        String[] tab = parseLine(asm);
        return "0001110"+generateIMMM(tab[3],3)+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String SUBS_3bits(String asm){
        String[] tab = parseLine(asm);
        return "0001111"+generateIMMM(tab[3],3)+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String MOVS(String asm){
        String[] tab = parseLine(asm);
        return "00100"+generateRegistre(tab[1])+generateIMMM(tab[2],8);
    }

    public static String ANDS(String asm){
        String[] tab = parseLine(asm);
        return "0100000000"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String EORS(String asm){
        String[] tab = parseLine(asm);
        return "0100000001"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String LSLS_data_processing(String asm){
        String[] tab = parseLine(asm);
        return "0100000010"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String LSRS_data_processing(String asm){
        String[] tab = parseLine(asm);
        return "0100000011"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ASRS_data_processing(String asm){
        String[] tab = parseLine(asm);
        return "0100000100"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ADCS(String asm){
        String[] tab = parseLine(asm);
        return "0100000101"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String SBCS(String asm){
        String[] tab = parseLine(asm);
        return "0100000110"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String RORS(String asm){
        String[] tab = parseLine(asm);
        return "0100000111"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String TST(String asm){
        String[] tab = parseLine(asm);
        return "0100001000"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String RSBS(String asm){
        String[] tab = parseLine(asm);
        return "0100001001"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String CMP(String asm){
        String[] tab = parseLine(asm);
        return "0100001010"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String CMN(String asm){
        String[] tab = parseLine(asm);
        return "0100001011"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String ORRS(String asm){
        String[] tab = parseLine(asm);
        return "0100001100"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String MULS(String asm){
        String[] tab = parseLine(asm);
        return "0100001101"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String BICS(String asm){
        String[] tab = parseLine(asm);
        return "0100001110"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String MVNS(String asm){
        String[] tab = parseLine(asm);
        return "0100001111"+generateRegistre(tab[2])+generateRegistre(tab[1]);
    }

    public static String STR(String asm){

        asm = asm.replaceAll(" ","");
        asm = asm.replaceAll("]","");
        asm = asm.replaceAll(","," ");
        String[] tab = asm.split(" ");
        String s = tab[0];
        String registre = "";
        registre = registre + s.charAt(3);
        registre = registre + s.charAt(4);
        return "10010"+generateRegistre(registre)+generateIMMMx4(tab[2],8);
    }

    public static String LDR(String asm){
        asm = asm.replaceAll(" ","");
        asm = asm.replaceAll("]","");
        asm = asm.replaceAll(","," ");
        String[] tab = asm.split(" ");
        String s = tab[0];
        String registre = "";
        registre = registre + s.charAt(3);
        registre = registre + s.charAt(4);
        return "10011"+generateRegistre(registre)+generateIMMMx4(tab[2],8);
    }

    public static String ADD(String asm){
        String tab[] = parseLine(asm);
        return "101100000"+generateIMMMx4(tab[2],7);
    }

    public static String SUB(String asm){
        String tab[] = parseLine(asm);
        return "101100001"+generateIMMMx4(tab[2],7);
    }


    public static String EQ(String asm){
        String[] tab = parseLine(asm);
        return "110100000"+generateIMMM(tab[1], 8);
    }
    public static String NE(String asm){
        String[] tab = parseLine(asm);
        return "110100001"+generateIMMM(tab[1], 8);
    }
    public static String CS(String asm){
        String[] tab = parseLine(asm);
        return "110100010"+generateIMMM(tab[1], 8);
    }
    public static String CC(String asm){
        String[] tab = parseLine(asm);
        return "110100011"+generateIMMM(tab[1], 8);
    }
    public static String MI(String asm){
        String[] tab = parseLine(asm);
        return "110100100"+generateIMMM(tab[1], 8);
    }
    public static String PL(String asm){
        String[] tab = parseLine(asm);
        return "110100101"+generateIMMM(tab[1], 8);
    }
    public static String VS(String asm){
        String[] tab = parseLine(asm);
        return "110100110"+generateIMMM(tab[1], 8);
    }
    public static String VC(String asm){
        String[] tab = parseLine(asm);
        return "110100111"+generateIMMM(tab[1], 8);
    }
    public static String HI(String asm){
        String[] tab = parseLine(asm);
        return "110101000"+generateIMMM(tab[1], 8);
    }
    public static String LS(String asm){
        String[] tab = parseLine(asm);
        return "110101001"+generateIMMM(tab[1], 8);
    }
    public static String GE(String asm){
        String[] tab = parseLine(asm);
        return "110101010"+generateIMMM(tab[1], 8);
    }
    public static String LT(String asm){
        String[] tab = parseLine(asm);
        return "110101011"+generateIMMM(tab[1], 8);
    }
    public static String GT(String asm){
        String[] tab = parseLine(asm);
        return "110101100"+generateIMMM(tab[1], 8);
    }
    public static String LE(String asm){
        String[] tab = parseLine(asm);
        return "110101101"+generateIMMM(tab[1], 8);
    }
    public static String AL(String asm){
        String[] tab = parseLine(asm);
        return "110101110"+generateIMMM(tab[1], 8);
    }
    public static String UB(String asm){
        String[] tab = parseLine(asm);
        return "1110"+generateIMMM(tab[1], 11);
    }







    /** OUTILS UTILISES PARTOUT DANS LES METHODES*/
    public static String generateRegistre(String registre){
        String s="";
        int numero = Character.getNumericValue(registre.charAt(1));
        //System.out.println(registre);
        s = Integer.toBinaryString(numero);
        while(s.length()<3) s = "0"+s;
        return s;
    }

    public static String generateIMMM(String immm, int nbBits){
        immm = immm.replace("#","");
        String binaire = Integer.toBinaryString(Integer.valueOf(immm));
        while(binaire.length()<nbBits) binaire = "0"+binaire;
        return binaire;
    }

    public static String generateIMMMx4(String immm, int nbBits){
        immm = immm.replace("#","");
        //System.out.println(immm);
        String binaire = Integer.toBinaryString(Integer.valueOf(immm)/4);
        while(binaire.length()<nbBits) binaire = "0"+binaire;
        return binaire;
    }

    public static String[] parseLine(String s){
        s = s.replaceAll(","," ");
        s = s.replaceAll("  "," ");
        String[] tab = s.split(" ");
        return tab;
    }

    public static String generateHexa(String binaire){
        String hexa = "";
        for(int i=0; i<binaire.length(); i+=4){
            String s = binaire.substring(i,i+4);
            int decimal = Integer.parseInt(s,2);
            hexa = hexa + Integer.toHexString(decimal);
        }
        return hexa;
    }

    public static HashMap<String,Integer> scanBranch(FileInputStream fi){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        Scanner sc = new Scanner(fi);
        int i=0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.contains(":")){
                map.put(s, i-map.size()+1);
            }
            i++;
        }
        return map;
    }
}
