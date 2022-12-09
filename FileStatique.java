package File;

public class FileStatique {

    /* dans une fille statique le précédent du  premier c'est le dernier  et le suivant du dernier c'est le premier
    donc on transformer en chaine circulaire
     */


    private int[] File = new int[4];
    private int indexOut;
    private int indexIn;

    private int nbElement;
    public FileStatique() {
        indexIn=3;
        indexOut=3;
        nbElement=0;
    }

    private boolean StackEmpty(){

        return nbElement==0;
    }

    private boolean StackFull(){
        return nbElement==4;
    }

    private int gestionIndex(int index){
        if((index-1 != -1)){
            return index-1;
        }else{
            return 3;
        }
    }
    public void FifoIn(int val){
        if(StackFull()){
            System.out.println("la file est pleine");

        }
        else{
            File[indexIn]=val;
            nbElement++;
            indexIn=gestionIndex(indexIn);
        }
    }



    public int FifOut(){
        if(StackEmpty()){
            System.out.println("la file est vide");
            return 0;
        }else {
            int val=File[indexOut];
            indexOut=gestionIndex(indexOut);
            nbElement--;
            return val;
        }
    }

    public int getIndexOut() {
        return indexOut;
    }

    public int getIndexIn() {
        return indexIn;
    }

    public void affiche(){
        if (StackEmpty()){
            System.out.println("la file est vide rien a afficher");
        }else {
            int compt=indexOut;
            System.out.print("valeur de la file [");
            do{

                System.out.print(File[compt]+",");
                compt=gestionIndex(compt);
            }while (indexIn!=compt);
            System.out.print("]");
            System.out.println("");
        }


    }
}
