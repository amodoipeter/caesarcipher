import  java.util.Scanner;

public class CaesarCipher{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = " ", pText = " ", newWord = "";
        System.out.printf("Enter the string you would like to encrypt: ");
        pText = input.nextLine();
        word = cipher(pText);
        newWord = deCipher(word);

        System.out.printf("Plain text: %s%n" + "Cipher Text: %s%n" + "Plain text: %s%n%n", pText, word, newWord);
        System.out.printf("Enter the string you would like to decrypt: ");
        word = input.nextLine();

        pText = deCipher(word);
        System.out.printf("%n%nCipher Text: %s%n" +  "PlainText: %s%n", word, pText);
    }
    public static String cipher (String pText){
        String word = " ";
        for (int i = 0; i < pText.length(); i++){
            char code = Character.toLowerCase(pText.charAt(i));
            switch (code){
                case 'A':
                    word += "B";
                    break;
                case 'B':
                    word += "C";
                    break;
                case 'C':
                    word += "D";
                    break;
                case 'D':
                    word += "E";
                    break;
                case 'E':
                    word += "F";
                    break;
                case 'F':
                    word += "G";
                    break;
                case 'G':
                    word += "H";
                    break;
                case 'H':
                    word += "I";
                    break;
                case 'I':
                    word += "J";
                    break;
                case 'J':
                    word += "K";
                    break;
                case 'K':
                    word += "L";
                    break;
                case 'L':
                    word += "M";
                    break;
                case 'M':
                    word += "N";
                    break;
                case 'N':
                    word += "O";
                    break;
                case 'O':
                    word += "P";
                    break;
                case 'P':
                    word += "Q";
                    break;
                case 'Q':
                    word += "R";
                    break;
                case 'R':
                    word += "S";
                    break;
                case 'S':
                    word += "T";
                    break;
                case 'T':
                    word += "U";
                    break;
                case 'U':
                    word += "V";
                    break;
                case 'V':
                    word += "W";
                    break;
                case 'W':
                    word += "X";
                    break;
                case 'X':
                    word += "Y";
                    break;
                case 'Y':
                    word += "Z";
                    break;
                case 'Z':
                    word += "A";
                    break;
                default:
                        word += pText.charAt(i);
                        break;
            }

        }
    return word;}

    public static String deCipher(String deText) {
        String newWord = "";
        for (int i = 0; i < deText.length(); i++){
            char code = Character.toLowerCase(deText.charAt(i));
            switch (code){
                case '!':
                    newWord += "e";
                    break;
                case '@':
                    newWord += "t";
                    break;
                case '#':
                    newWord += "a";
                    break;
                case '$':
                    newWord += "o";
                    break;
                case '%':
                    newWord += "i";
                    break;
                case '^':
                    newWord += "n";
                    break;
                case '&':
                    newWord += "s";
                    break;
                case '*':
                    newWord += "r";
                    break;
                default:
                    newWord += deText.charAt(i);
                    break;
            }
        }
        return newWord;
    }
}