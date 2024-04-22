package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        connexion();
    }

    public static void connexion(){
        String filePath = "src/files/user.txt";
        Scanner scan = new Scanner(System.in);
        String mdp = "";
        System.out.println("Entrez votre prenon et nom ");
        String [] nomComplet = scan.nextLine().split("\\s+");
        System.out.println("Entrez votre mdp ");
        mdp = scan.next();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            String[] info;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split("/");
                if (info[0].equals(nomComplet[0]) && info[1].equals(nomComplet[1]) && info[2].equals(mdp)) {
                    System.out.println("Connexion réussi");
                }
                else {
                    System.out.println("Information invalide");
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
