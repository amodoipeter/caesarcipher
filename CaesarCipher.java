import  java.util.scanner;

public class CaesarCipher{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = " ", pText = " ", newWord = "";
        System.out.println("Enter the string you would like to encrypt: ");
        pText = input.nextLine();
        word = cipher(pText);
        newWord = deCipher(word);

        System.out.println("Plain text: %s%n" + "Cipher Text: %s%n" + "Plain text: %s%n%n", pText, word, newWord);
        System.out.println("Enter the string you would like to decrypt");
        word = input.nextLine();
        pText = deCipher(word);
        System.out.println("%n%nCipher Text: %s%n", word, pText);
    }
    public static String cipher (String pText){
        String word = " ";
        for (int i = 0; i < pText.length; i++){
            char code = Character.toLowerCase(pText.charAt(i));
            switch (code){
                case 'e':
                    word += "!";
                    break;
                    case 't';
                    word += "@";
                    break;
                    case 'a';
                    word += "#";
                    break;
                    case 'o';
                    word += "$";
                    break;
                    case 'i';
                    word += "%";
                    break;
                    case 'n';
                    word += "^";
                    break;
                    case 's';
                    word += "&";
                    break;
                    case 'r';
                    word += "*";
                    break;
                    default:



            }

        }
    }

}