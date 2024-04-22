package CorrectionExam2;

public class Main {
    public static void main(String[] args) {
        Evaluation test1 = new Evaluation("Exam1");
        test1.setNote(90);

        Groupe tp1 = new Groupe("TP1");
        tp1.setNote(90);
        tp1.setNotePairs(2);

        Evaluation test2 = new Evaluation("Exam2");
        test2.setNote(70);

        Groupe tp2 = new Groupe("TP2");
        tp2.setNote(20);
        tp2.setNotePairs(30);

        Evaluation test3 = new Evaluation("Exam3");
        test3.setNote(30);

        Groupe tp3 = new Groupe("TP3");
        tp3.setNote(100);
        tp3.setNotePairs(100);

        System.out.println(test1.getNote());
        System.out.println(tp2.getNote());

        Cours math = new Cours(new Evaluation[]{tp2}, "Math");
        Cours philo = new Cours(new Evaluation[]{test1, test3, tp1, tp3}, "Philo");
        System.out.println(math.isInTrouble());
        System.out.println(philo.isInTrouble());
        System.out.println(math.getNote());
        System.out.println(philo.getNote());
        Etudiant johnny = new Etudiant(new Cours[]{math,philo}, "Dien", "Johnny");
        johnny.afficheCoursEnVoieEchec();

    }
}
