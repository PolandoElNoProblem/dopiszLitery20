import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj tekst");
        Scanner scn = new Scanner(System.in);
        String txt = scn.nextLine().toUpperCase();
        System.out.println(txt);
        for(int i =20;txt.length()<i;){
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            txt+=c;
        }
        System.out.println(txt.toUpperCase());
    }

}