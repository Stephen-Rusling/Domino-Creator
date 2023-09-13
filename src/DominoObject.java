import java.util.Random;
public class DominoObject
{
    private int endValue1;
    private int endValue2;
    private String word1;
    private String word2;
    private String wordResult;


    // A constructor with no parameters that generates the two values randomly (check they conform to the value rules
    // from the set depicted).
    public DominoObject()
    {
        Random rand = new Random();
        this.endValue1 = rand.nextInt(7);
        this.endValue2 = rand.nextInt(7);
        word1 = getTextualNameSide1();
        word2 = getTextualNameSide2();
        wordResult = toString();
    }

    // A constructor with two parameters representing the two end values (check they conform to the value rules
    // from the set depicted).
    public DominoObject(int endValue1, int endValue2)
    {
        this.endValue1 = endValue1;
        this.endValue2 = endValue2;
        word1 = getTextualNameSide1();
        word2 = getTextualNameSide2();
        wordResult = toString();
    }

    // Two get_ and set_ methods that operate on the two numeric end values (check again that the set_ methods
    // conform to the value rules).
    public int getEndValue1()
    {
        return endValue1;
    }
    public int getEndValue2()
    {
        return endValue2;
    }
    public String setEndValue1(int newValue1)
    {
        endValue1 = newValue1;
        return getTextualNameSide1();
    }
    public String setEndValue2(int newValue2)
    {
        endValue2 = newValue2;
        return getTextualNameSide2();
    }

    // Two get_ methods that provide the textual names for the two end values (private for encapsulation).
    // Domino Side 1
    private String getTextualNameSide1()
    {
        if (endValue1 == 0) {
            word1 = "Blank";
        }
        if (endValue1 == 1) {
            word1 = "One";
        }
        if (endValue1 == 2) {
            word1 = "Two";
        }
        if (endValue1 == 3) {
            word1 = "Three";
        }
        if (endValue1 == 4) {
            word1 = "Four";
        }
        if (endValue1 == 5) {
            word1 = "Five";
        }
        if (endValue1 == 6) {
            word1 = "Six";
        }
        if (endValue1 < 0 || endValue1 > 6) {
            word1 = "Incorrect first figure, select between 0-6";
        }
        return word1;
    }

    // Domino Side 2
    private String getTextualNameSide2()
    {
        if (endValue2 == 0) {
            word2 = "Blank";
        }
        if (endValue2 == 1) {
            word2 = "One";
        }
        if (endValue2 == 2) {
            word2 = "Two";
        }
        if (endValue2 == 3) {
            word2 = "Three";
        }
        if (endValue2 == 4) {
            word2 = "Four";
        }
        if (endValue2 == 5) {
            word2 = "Five";
        }
        if (endValue2 == 6) {
            word2 = "Six";
        }
        if (endValue2 < 0 || endValue2 > 6) {
            word2 = "Incorrect second figure, select between 0-6";
        }
        return word2;
    }

    // A toString() method that returns the name for the tile in a form such as “Two – Five” or “Blank – Four” or
    // “Double Three” that uses the two get_ methods for the textual names.
    public String toString()
    {
        String result = "";
        if (endValue1 > endValue2) {
            result = "---------\n" + "| " + endValue2 + " / " + endValue1 + " |" + "\n---------";
            wordResult = getTextualNameSide2() + " - " + getTextualNameSide1() + "\n";
        }
        if (endValue1 < endValue2) {
            result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
            wordResult = getTextualNameSide1() + " - " + getTextualNameSide2() + "\n";
        }
        if (endValue1 == endValue2) {
            if (endValue1 == 0) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Blank \n";
            }
            if (endValue1 == 1) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double One \n";
            }
            if (endValue1 == 2) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Two \n";
            }
            if (endValue1 == 3) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Three \n";
            }
            if (endValue1 == 4) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Four \n";
            }
            if (endValue1 == 5) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Five \n";
            }
            if (endValue1 == 6) {
                result = "---------\n" + "| " + endValue1 + " / " + endValue2 + " |" + "\n---------";
                wordResult = "Double Six \n";
            }
        }
        return (result + "\n" + wordResult);
    }
}

