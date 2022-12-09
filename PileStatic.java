import java.util.Arrays;

public class PileStatic {


    private int[] Pile = new int[3];
    private int index;

    public PileStatic() {
        for (int i=0;i<3;i++){
            Pile[i]=0;
        }
        this.index = -1;
    }

    private boolean stackFull(){
        return index==2;
    }

    private boolean stackEmpty(){
        return index==-1;
    }

    public void addVal(int val){
        if(stackFull()){
            System.out.println("le tableau est déja plein");
        }
        else{
            index++;
            Pile[index]=val;
        }
    }


    public int supVal(){
        if(stackEmpty()){
            System.out.println("le tableau est déja vide");
            return -1 ;
        }
        else {
            index--;
            return Pile[index++];
        }
    }

    @Override
    public String toString() {
        if(stackEmpty()) {
            return "PileStatic{" +
                    "Pile= [] , index=" + index +
                    '}';
        } else if (stackFull()) {
            return "PileStatic{" +
                    "Pile=" + Arrays.toString(Pile) +
                    ", index=" + index +
                    '}';
        } else if (index==0) {
            return "PileStatic{" +
                    "Pile= [" + Pile[index] +
                    "], index=" + index +
                    '}';
        }
        else {
            return "PileStatic{" +
                    "Pile= [" + Pile[0]+ Pile[index] +
                    "], index=" + index +
                    '}';
        }

    }
}
