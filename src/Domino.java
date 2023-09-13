// *******************************************************************************************************************
// Dominoes.java
// Design a class called Domino that simulates a single tile. Each end can be represented by an integer ranging from
// 0 to 6. A tile is named by the words for the two values, e.g. a tile with 2 pips and 5 pips is called a “Two –
// Five”; a tile with no pips and 4 pips is called a “Blank – Four”; and a tile with 3 pips on both ends is called
// a “Double Three”. By convention, a tile is always named with the larger end value last.
//
// For your design, create a UML Class diagram similar to Figure 5.5 on page 180 of the textbook. Note that you need
// to include the constructors in the methods section.
//
// Write a test driver that creates ten random tiles (i.e., uses the default constructor) and outputs them (do not worry
// about duplicates). Then creates six more tiles of specific values (i.e., uses the second constructor) and outputs
// them. The specific tiles should include those with ‘boundary’ values such as 0 and 0, 0 and 6, 6 and 6; plus two
// more of your choice; plus a final tile with invalid values like 7 and 8 to demo how the app handles this. You should
// not need to prompt the user for anything, just hard-code the calls
// *******************************************************************************************************************
public class Domino
{
    public static void main(String[] args)
    {
        System.out.println("\nHard-coded testing calls\n");
        System.out.println("--------------------------------------------------------------\n");
        // For loop to test 10 random domino creations using .randomDomino
        System.out.println("10 Random Domino Tests");
        int i;
        for (i = 1; i < 11; i++)
        {
            System.out.println("Random Domino Test " + i + ":");
            DominoObject testRandomDomino = new DominoObject();
            System.out.println(testRandomDomino);
        }

        System.out.println("--------------------------------------------------------------\n");
        // Six tile tests of specific values (i.e., uses the second constructor) and output them. The specific tiles
        // should include those with ‘boundary’ values such as 0 and 0, 0 and 6, 6 and 6l plus two more of your choice
        System.out.println("User created Domino tests");
        System.out.println("User Input Domino Test " + 1 + ":");
        DominoObject userDomino1 = new DominoObject(6,6);
        System.out.println(userDomino1);

        System.out.println("User Input Domino Test " + 2 + ":");
        DominoObject userDomino2 = new DominoObject(0,0);
        System.out.println(userDomino2);

        System.out.println("User Input Domino Test " + 3 + ":");
        DominoObject userDomino3 = new DominoObject(0,6);
        System.out.println(userDomino3);

        System.out.println("User Input Domino Test " + 4 + ":");
        DominoObject userDomino4 = new DominoObject(6,0);
        System.out.println(userDomino4);

        System.out.println("User Input Domino Test " + 5 + ":");
        DominoObject userDomino5 = new DominoObject(5,3);
        System.out.println(userDomino5);

        System.out.println("User Input Domino Test " + 6 + ":");
        DominoObject userDomino6 = new DominoObject(1,2);
        System.out.println(userDomino6);

        System.out.println("--------------------------------------------------------------\n");
        // Invalid Domino input (Expected result is visual display of domino, with error below to prompt correction)
        System.out.println("User Invalid Input Domino Test 1:");
        DominoObject userDomino7 = new DominoObject(-5,8);
        System.out.println(userDomino7);

        System.out.println("User Invalid Input Domino Test 2:");
        DominoObject userDomino8 = new DominoObject(6,55);
        System.out.println(userDomino8);
    }

}

