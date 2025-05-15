class Main {
    public static void main(String[] args) {
        /*for(int x = 0;x<63;x++){
            System.out.print("*");
        }*/
        BigPrint("my name is mAx herrERa.Or is it?");
        BigPrint("     ");
        BigPrint("Sphinx of black quartz, judge my vow");
    }
    //Prints the input in big letters
    public static void BigPrint(String input){
        //Create String array to store output
        String line[] = {"","","","",""};
        //Allow for easy for loop
        char arInput[] = input.toCharArray();
        //int printlength = 63;//
        int newliner = 0;
        //Loop over each letter in input
        for (char let : arInput){
            //State the length of the current loaded string
            newliner++;
            //If the string length is more than can be 
            //printed, print it and empty string
            if(newliner>9){
                //Print and empty each line
                for(int c=0;c<5;c++){
                    System.out.println(line[c]);
                    line[c] = "";
                }
                //Space out lines
                System.out.println("");
                //Reset big string length
                newliner = 1;
            }
            //Take in biggified letter data
            String temp[] = MakeBig(let);
            //Add data to output
            for(int c=0;c<5;c++){
                line[c] = line[c].concat(temp[c]);
                //Space out letters
                line[c] = line[c].concat("  ");
            }
        }
        //Print output
        for(int c = 0; c < 5; c++){
            System.out.println(line[c]);
        }
        //Space out for more words
        System.out.println("");
    }
    //Takes a valid char and returns the list of strings
    //that correspond to it
    public static String[] MakeBig(char letter){
        //This will return the data
        String Big[] = new String[5];
        switch(letter){
            //Lowercase and uppercase feed into uppercase
            case 'a':
            case 'A':
            //Set Big to A
            Big[0] = "  *  ";
            Big[1] = " * * ";
            Big[2] = "*****";
            Big[3] = "*   *";
            Big[4] = "*   *";
            //Exit switch statement
            break;
            //Do the same for each letter
            case 'b':
            case 'B':
            Big[0] = "**** ";
            Big[1] = "*   *";
            Big[2] = "**** ";
            Big[3] = "*   *";
            Big[4] = "**** ";
            break;
            case 'c':
            case 'C':
            Big[0] = " ****";
            Big[1] = "*    ";
            Big[2] = "*    ";
            Big[3] = "*    ";
            Big[4] = " ****";
            break;
            case 'd':
            case 'D':
            Big[0] = "**** ";
            Big[1] = "*   *";
            Big[2] = "*   *";
            Big[3] = "*   *";
            Big[4] = "**** ";
            break;
            case 'e':
            case 'E':
            Big[0] = "*****";
            Big[1] = "*    ";
            Big[2] = "**** ";
            Big[3] = "*    ";
            Big[4] = "*****";
            break;
            case 'f':
            case 'F':
            Big[0] = "*****";
            Big[1] = "*    ";
            Big[2] = "**** ";
            Big[3] = "*    ";
            Big[4] = "*    ";
            break;
            case 'g':
            case 'G':
            Big[0] = " ****";
            Big[1] = "*    ";
            Big[2] = "*  **";
            Big[3] = "*   *";
            Big[4] = " *** ";
            break;
            case 'h':
            case 'H':
            Big[0] = "*   *";
            Big[1] = "*   *";
            Big[2] = "*****";
            Big[3] = "*   *";
            Big[4] = "*   *";
            break;
            case 'i':
            case 'I':
            Big[0] = "*****";
            Big[1] = "  *  ";
            Big[2] = "  *  ";
            Big[3] = "  *  ";
            Big[4] = "*****";
            break;
            case 'j':
            case 'J':
            Big[0] = "*****";
            Big[1] = "  *  ";
            Big[2] = "  *  ";
            Big[3] = "  *  ";
            Big[4] = "**   ";
            break;
            case 'k':
            case 'K':
            Big[0] = "*   *";
            Big[1] = "*  * ";
            Big[2] = "***  ";
            Big[3] = "*  * ";
            Big[4] = "*   *";
            break;
            case 'l':
            case 'L':
            Big[0] = "*    ";
            Big[1] = "*    ";
            Big[2] = "*    ";
            Big[3] = "*    ";
            Big[4] = "*****";
            break;
            case 'm':
            case 'M':
            Big[0] = "*   *";
            Big[1] = "** **";
            Big[2] = "* * *";
            Big[3] = "*   *";
            Big[4] = "*   *";
            break;
            case 'n':
            case 'N':
            Big[0] = "*   *";
            Big[1] = "**  *";
            Big[2] = "* * *";
            Big[3] = "*  **";
            Big[4] = "*   *";
            break;
            case 'o':
            case 'O':
            Big[0] = " *** ";
            Big[1] = "*   *";
            Big[2] = "*   *";
            Big[3] = "*   *";
            Big[4] = " *** ";
            break;
            case 'p':
            case 'P':
            Big[0] = "**** ";
            Big[1] = "*   *";
            Big[2] = "**** ";
            Big[3] = "*    ";
            Big[4] = "*    ";
            break;
            case 'q':
            case 'Q':
            Big[0] = " *** ";
            Big[1] = "*   *";
            Big[2] = "* * *";
            Big[3] = "*  **";
            Big[4] = " ****";
            break;
            case 'r':
            case 'R':
            Big[0] = "**** ";
            Big[1] = "*   *";
            Big[2] = "**** ";
            Big[3] = "*   *";
            Big[4] = "*   *";
            break;
            case 's':
            case 'S':
            Big[0] = " ****";
            Big[1] = "*    ";
            Big[2] = " *** ";
            Big[3] = "    *";
            Big[4] = "**** ";
            break;
            case 't':
            case 'T':
            Big[0] = "*****";
            Big[1] = "  *  ";
            Big[2] = "  *  ";
            Big[3] = "  *  ";
            Big[4] = "  *  ";
            break;
            case 'u':
            case 'U':
            Big[0] = "*   *";
            Big[1] = "*   *";
            Big[2] = "*   *";
            Big[3] = "*   *";
            Big[4] = " *** ";
            break;
            case 'v':
            case 'V':
            Big[0] = "*   *";
            Big[1] = "*   *";
            Big[2] = "*   *";
            Big[3] = " * * ";
            Big[4] = "  *  ";
            break;
            case 'w':
            case 'W':
            Big[0] = "*   *";
            Big[1] = "*   *";
            Big[2] = "* * *";
            Big[3] = "** **";
            Big[4] = "*   *";
            break;
            case 'x':
            case 'X':
            Big[0] = "*   *";
            Big[1] = " * * ";
            Big[2] = "  *  ";
            Big[3] = " * * ";
            Big[4] = "*   *";
            break;
            case 'y':
            case 'Y':
            Big[0] = "*   *";
            Big[1] = "*   *";
            Big[2] = " * * ";
            Big[3] = "  *  ";
            Big[4] = "  *  ";
            break;
            case 'z':
            case 'Z':
            Big[0] = "*****";
            Big[1] = "   * ";
            Big[2] = "  *  ";
            Big[3] = " *   ";
            Big[4] = "*****";
            break;
            case ' ':
            Big[0] = "     ";
            Big[1] = "     ";
            Big[2] = "     ";
            Big[3] = "     ";
            Big[4] = "     ";
            break;
            case ',':
            Big[0] = "     ";
            Big[1] = "     ";
            Big[2] = "     ";
            Big[3] = " *   ";
            Big[4] = "*    ";
            break;
            case '.':
            Big[0] = "     ";
            Big[1] = "     ";
            Big[2] = "     ";
            Big[3] = "     ";
            Big[4] = "*    ";
            break;
            case '?':
            Big[0] = " *** ";
            Big[1] = "*   *";
            Big[2] = "    *";
            Big[3] = "  *  ";
            Big[4] = "  *  ";
            break;

            //If letter is unknown, put question marks
            default:
            Big[0] = "?????";
            Big[1] = "?????";
            Big[2] = "?????";
            Big[3] = "?????";
            Big[4] = "?????";
            break;
        }
        //Return the big letter
        return Big;
    }
}