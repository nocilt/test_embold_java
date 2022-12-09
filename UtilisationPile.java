package Pile;

public class UtilisationPile {


    public static void main(String[] args) {
        /*
        PileStatic pile= new PileStatic();

        pile.addVal(34);
        System.out.println(pile);
        pile.addVal(34);
        pile.addVal(34);
        System.out.println(pile);
        pile.addVal(34);
        System.out.println(pile.supVal());
        System.out.println(pile.supVal());
        System.out.println(pile);
*/
        PileDinamique pile = new PileDinamique();

        pile.addVal(34);
        pile.addVal(34);
        pile.addVal(34);
        pile.addVal(34);
        pile.supVal();
        pile.supVal();
        pile.supVal();
        pile.supVal();
        pile.affiche();

    }
}
