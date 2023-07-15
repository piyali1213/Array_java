package assignment;
import java.util.Scanner;
public class AlphabetVC {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
            System.out.println("Enter the letter :");
            char letter = input.next().charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("the alphabet is vowel ");
            } else {
                System.out.println("the alphabet is consonant ");
            }

            }
        }

