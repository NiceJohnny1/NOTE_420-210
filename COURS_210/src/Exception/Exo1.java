package Exception;
import java.util.Scanner;
public class Exo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte age;
        float taille;
        boolean estEtudiantMV;
        boolean formulairecomplet = false;
        while (!formulairecomplet) {
            try {
                System.out.println("Entrez votre age: ");
                age = scan.nextByte();
                if (age < 0 || age > 65) {
                    throw new Exception();
                }

                System.out.println("Entrez votre taille en centimètre: ");
                taille = scan.nextFloat();
                if (taille < 60 || taille > 300) {
                    throw new Exception();
                }

                System.out.println("Êtes-vous un étudiant?: (true / false) ");
                estEtudiantMV = scan.nextBoolean();
            }
            catch (Exception e) {
                System.out.println("Valeur invalide");
                scan.nextLine();
                continue;
            }
            System.out.println("Les valeurs saisies sont: ");
            System.out.println("Age: " + age);
            System.out.println("Taille: " + taille);
            System.out.println("Étudiant: " + estEtudiantMV);

            System.out.println("Les valeurs sont-elles correctes?: (o/n) ");
            String choix = scan.next();
            if (choix.compareTo("o") == 0 || choix.compareTo("n") == 0){
                continue;
            }

            formulairecomplet = true;
            System.out.println("Fin");
        }





        // System.out.println("Quel est votre age: ");
        // byte age;
        // try{
        //     age = scan.nextByte();
        //     if (age < 0 || age > 55){
        //         throw new Exception("Age Invalide");
        //     }
        // }
        // catch (Exception e){
        //     System.out.println("Test");
        // }
        // System.out.println("Quel est votre taille en centimètre?: ");
        // short taille = scan.nextShort();
        // System.out.println("Êtes-vous un étudiant/e?: (true / false)");
        // boolean etudiant = scan.nextBoolean();
        // System.out.println("Êtes-vous sûre de votre information?: (true / false)");
        // boolean confirmation = scan.nextBoolean();
        // if (confirmation){
        //     try{
        //         if (age < 0 || age > 55){
        //             throw new Exception("Age Invalide");
        //         }
        //         if (taille < 60 || taille > 250){
        //             throw new Exception("Taille Invalide");
        //         }
        //         if (!etudiant){
        //             throw new Exception("N'est pas un étudiant");
        //         }
        //     }
        //     catch (Exception e){
        //         System.out.println("Age Invalide");
        //     }
        // }
    }
}
