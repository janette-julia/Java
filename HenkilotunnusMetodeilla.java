import java.io.CharArrayWriter;
import java.util.Scanner;

public class HenkilotunnusMetodeilla {
    public static void main (String [] args) {


        System.out.print("Kirjoita henkilotunnuksesi:");

        Scanner sc = new Scanner(System.in);
        String tunnus = sc.nextLine();

        tulostaSyntymapaiva(tunnus);

    }
       
    private static void tulostaSyntymapaiva(final String hetu){

        if (hetu.length() != 11 ||
        hetu.charAt(6) != 'A' &&
        hetu.charAt(6) != '+' &&
        hetu.charAt(6) != '-') {
            System.out.println("Tunnus on virheellinen.");
        }

    else {

        for (int i = 0 ; i < 6 ; i++) {
            System.out.print(hetu.charAt(i));

            if (i == 1 || i == 3) {
                System.out.print(".");
            }
            if (i == 3) {
                if (hetu.charAt(6) == 'A') {
                    System.out.print("20");
                }
                if (hetu.charAt(6) == '-') {
                    System.out.print("19");
                }
                if (hetu.charAt(6) == '+') {
                    System.out.print("18");
                }
            }

        } 
    }

    }


    }
