package File;

public class UtilisationFile {


    public static void main(String[] args) {
        FileDinamique file= new FileDinamique();

        file.affiche();
        file.FifoIn(4);
        file.FifoIn(5);
        file.FifoIn(6);

        file.FifoIn(7);
        file.FifoIn(7);
        file.affiche();
        file.FifOut();
        file.FifOut();
        file.FifOut();
        file.affiche();
        file.FifOut();
        file.FifOut();

        file.FifoIn(1);
        file.FifoIn(1);
        file.FifoIn(1);
        file.FifoIn(1);
        file.FifoIn(1);
        file.FifoIn(1);
        file.affiche();


    }

}
