package Pile;

public class PileDinamique {

    private int[] Pile;
    private int taille;


    public void PileDinamique(){
        taille=0;
        Pile = new int[taille];
    }

    private boolean stackFull(){

        return taille==3;
    }

    private boolean stackEmpty(){
        return taille==0;
    }

    public void addVal(int val) {
        if (stackFull()) {
            System.out.println("tableau plein");
        } else {
            if(stackEmpty()){
                taille++;
                Pile = new int[taille];
                Pile[0]=val;
            }
            else {
                int[] copie = new int[taille];
                for (int i = 0; i < taille; i++) {
                    copie[i]=Pile[i];
                }
                taille++;
                Pile = new int[taille];
                for (int i = 0; i < taille-1; i++) {
                    Pile[i]=copie[i];
                }
                Pile[taille-1]=val;

            }
        }
    }

    public void affiche(){
        System.out.print("valeur du tableau[");
        for (int i = 0; i < Pile.length; i++) {
            System.out.print(Pile[i]+" ");
        }
        System.out.println("]");

    }

    public int supVal(){
        if(stackEmpty()){
            System.out.println("pile vide ");
            return -1;
        }else {

            int res= Pile[taille-1];
            taille--;
            int[] copie=new int[taille];
            for (int i = 0; i < taille; i++) {
                copie[i]=Pile[i];
            }

            Pile=new int[taille];
            for (int i=0; i<taille;i++)
            {
                Pile[i]=copie[i];
            }
            return res;
        }

    }
}
