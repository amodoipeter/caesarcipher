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
                case 'a':
                    word += "b";
                    break;
                case 'b':
                    word += "c";
                    break;
                case 'c':
                    word += "d";
                    break;
                case 'd':
                    word += "e";
                    break;
                case 'e':
                    word += "f";
                    break;
                case 'f':
                    word += "g";
                    break;
                case 'g':
                    word += "h";
                    break;
                case 'h':
                    word += "i";
                    break;
                case 'i':
                    word += "j";
                    break;
                case 'j':
                    word += "k";
                    break;
                case 'k':
                    word += "l";
                    break;
                case 'l':
                    word += "m";
                    break;
                case 'm':
                    word += "n";
                    break;
                case 'n':
                    word += "o";
                    break;
                case 'o':
                    word += "p";
                    break;
                case 'p':
                    word += "q";
                    break;
                case 'q':
                    word += "r";
                    break;
                case 'r':
                    word += "s";
                    break;
                case 's':
                    word += "t";
                    break;
                case 't':
                    word += "u";
                    break;
                case 'u':
                    word += "v";
                    break;
                case 'v':
                    word += "w";
                    break;
                case 'w':
                    word += "x";
                    break;
                case 'x':
                    word += "y";
                    break;
                case 'y':
                    word += "z";
                    break;
                case 'z':
                    word += "a";
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
                case 'b':
                    newWord += "a";
                    break;
                case 'c':
                    newWord += "b";
                    break;
                case 'd':
                    newWord += "c";
                    break;
                case 'e':
                    newWord += "d";
                    break;
                case 'f':
                    newWord += "e";
                    break;
                case 'g':
                    newWord += "f";
                    break;
                case 'h':
                    newWord += "g";
                    break;
                case 'i':
                    newWord += "h";
                    break;
                case 'j':
                    newWord += "i";
                    break;
                case 'k':
                    newWord += "j";
                    break;
                case 'l':
                    newWord += "k";
                    break;
                case 'm':
                    newWord += "l";
                    break;
                case 'n':
                    newWord += "m";
                    break;
                case 'o':
                    newWord += "n";
                    break;
                case 'p':
                    newWord += "o";
                    break;
                case 'q':
                    newWord += "p";
                    break;
                case 'r':
                    newWord += "q";
                    break;
                case 's':
                    newWord += "r";
                    break;
                case 't':
                    newWord += "s";
                    break;
                case 'u':
                    newWord += "t";
                    break;
                case 'v':
                    newWord += "u";
                    break;
                case 'w':
                    newWord += "v";
                    break;
                case 'x':
                    newWord += "w";
                    break;
                case 'y':
                    newWord += "x";
                    break;
                case 'z':
                    newWord += "y";
                    break;
                case 'a':
                    newWord += "z";
                    break;
                default:
                    newWord += deText.charAt(i);
                    break;
            }
        }
        return newWord;
    }
}