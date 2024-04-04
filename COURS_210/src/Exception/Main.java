package Exception;

public class Main {
    public static void main(String[] args) {
        int nombre = 9;
        try {
            double chiffre = 5 / 0;
        }
        catch (Exception e){
            // Ce que je fais en cas d'erreur
            System.out.println("Tu essaye de diviser par 0");
        }
        finally{
            System.out.println("Finally");
        }
        nombre = 12;
        System.out.println(nombre);
    }
}
