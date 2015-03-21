/**
 * Created by charlynbuchanan on 3/19/15.
 * This program should take in a book title and character, and return it correctly capitalized.
 * and underlined.
 *
 * Something in my logic is flawed wherein the lower case letters each print twice, and
 * my underline is one char short. I can't figure out why this is happening.
 */
public class PrettyTitle {
    public static String printTitle(String title, char underlineChar){

        int length = title.length();
        String newTitle = "";
        String underline = "";

        newTitle += title.substring(0, 1).toUpperCase();
        //underline += underlineChar;
        for (int i = 1; i < length; ) {
            char c = title.charAt(i);
            newTitle += c;
            underline += underlineChar;
            if (c == ' ') {
                newTitle += title.substring(i + 1, i + 2).toUpperCase();
                ++i;
                underline += ' ';
            }
            if (c != ' ') {
                i++;
                newTitle += c;
                underline += underlineChar;
            }
        }
        System.out.print(newTitle);
        System.out.println();
        System.out.print(underline);


        return newTitle;

    }


    public static void main(String[] args) {

        printTitle("dick and jane", '*');
    }


}




