import java.util.Scanner;
public class VowelNumber {
    public static void main (String[] args){
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = word.nextLine();
        int count = 0;
        int length = str.length();
        for (int i = 0; i<length;i++){
            char c = str.charAt(i);
            if (c=='a' || c=='e' || c=='i'|| c== 'o' || c== 'u'||c== 'A'||c== 'E'|| c== 'I'|| c== 'O'|| c=='U'){
               count++; 
            }        
            System.out.println(c);
        }
        System.out.println("The number of vowels in your word are: "+count);
    }
}