/**
 * @author Lorenzo, Zazheska D. & Panggoy, Julia Coleene B.
 * @param CCIS - CS 2nd Year
 * @param A221 - Object Oriented Programming (Paired)
 */

public class PickTwoCards {
    public static void main(String[] args) {
        System.out.println("\nLorenzo, Zazheska D. & Panggoy, Julia Coleene B.");
        System.out.println("CCIS - CS 2nd Year");
        System.out.println("A221 - Object Oriented Programming (Paired)\n");

        Cards myCard = new Cards();
        Cards yourCard = new Cards();

        String yourNumber = yourCard.numberName();
        String myNumber = myCard.numberName();
        String yourSuit = yourCard.generateSuit();
        String mySuit = myCard.generateSuit();

        System.out.println("Your card was the " + yourNumber + " of " + yourSuit + ".");
        System.out.println("My card was the " + myNumber + " of " + mySuit + ".");
        System.out.println();
    }
}
