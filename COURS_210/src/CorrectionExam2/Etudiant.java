package CorrectionExam2;

public class Etudiant {
    protected String nomComplet;
    protected Cours[] cours;

    public Etudiant(Cours[] cours, String nom, String prenom) {
        this.nomComplet = prenom + " " + nom;
        this.cours = cours;
    }

    public void afficheCoursEnVoieEchec(){
        for(Cours cour : cours){
            if(cour.isInTrouble()) {
                System.out.println(cour.titreCours);
            }
        }
    }
}
