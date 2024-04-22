package CorrectionExam2;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez vos mots (F10 pour terminer)");
        String mots = "";
        String choix = "";
        while(true){
            choix = scan.next();
            if(choix.equals("F10")){
                break;
            }
            mots += choix;
        }
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        mots = mots.toLowerCase();
        System.out.println("Les lettres de l'alphabet qui ne sont pas présente sont: ");
        for (String letter : alphabet) {
            if (!mots.contains(letter)) {
                System.out.print(letter + ", ");
            }
        }
    }
}
