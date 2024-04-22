package CorrectionExam2;

public class Groupe extends Evaluation{
    protected float notePairs;

    public Groupe(String nom){
        super(nom);
        this.type = "Groupe";
    }
    @Override
    public float getNote() {
        return (float)(this.note*0.9 + notePairs * 0.1);
    }

    public void setNotePairs(float notePairs) {
        this.notePairs = notePairs;
    }
}
