package File;

public class FileDinamique {

    private int[] File;
    private int nbElement;


    public FileDinamique() {
        nbElement=0;
        File=new int[nbElement];
    }

    public boolean StackEmpty(){
        return nbElement==0;
    }

    public boolean StackFull(){
        return nbElement==4;
    }

    public void FifoIn(int val){
        if(StackFull()){
            System.out.println("la file est pleine");
        }else {
            nbElement++;
            if (nbElement==1){
                File=new int[nbElement];
                File[0]=val;
            }
            else {
                int[]copie= new int[nbElement-1];
                for (int i = 0; i < nbElement-1; i++) {
                    copie[i]=File[i];
                }
                File=new int[nbElement];
                for (int i = 0; i < nbElement-1; i++) {
                    File[i]=copie[i];
                }
                File[nbElement-1]=val;
            }
        }

    }

    public int FifOut(){
        if(StackEmpty()){
            System.out.println("la file est vide");
            return 0;
        }else {
            nbElement--;
            int val=File[0];
            if(nbElement==0){
                File=new int[0];
                return val;
            }else{
                int[] copie= new int[nbElement];
                for (int i = 1; i < nbElement+1; i++) {
                    copie[i-1]=File[i];
                }

                File=copie;
                return val;
            }
        }

    }
    public void affiche(){
        System.out.print("valeur de la file [");
        for (int i = 0; i < nbElement; i++) {
            System.out.print(File[i]+" ");
        }
        System.out.println("]");
    }
}
