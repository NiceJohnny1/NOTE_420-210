package CorrectionExam2;

public class Cours {
    protected Evaluation[] evaluations;
    protected String titreCours;

    public Cours(Evaluation[] evaluations, String titreCours) {
        this.evaluations = evaluations;
        this.titreCours = titreCours;
    }

    public float getNote(){
        float somme = 0;
        int count = 0;
        for (Evaluation eval : evaluations) {
            somme += eval.getNote();
            count++;
        }
        if(count == 0) {
            return 0;
        }
        if (isInTrouble()){
            return Math.min(59F, (float)(somme/count));
        }
        return somme/count;
    }
    public boolean isInTrouble(){
        float sommeIndividuelle = 0;
        int countIndividuelle = 0;
        float sommeGroupe = 0;
        int countGroupe = 0;

        for(Evaluation eval : evaluations){
            if (eval.type.equals("Individuelle")){
                sommeIndividuelle += eval.getNote();
                countIndividuelle++;
            }
            else {
                sommeGroupe += eval.getNote();
                countGroupe++;
            }
        }
        if (countIndividuelle != 0 && sommeIndividuelle/countIndividuelle < 60){
            return true;
        }
        if (countGroupe != 0 && sommeGroupe/countGroupe < 60){
            return true;
        }
        return false;
    }
}
