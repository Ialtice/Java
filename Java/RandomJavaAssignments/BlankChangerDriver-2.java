import java.util.Scanner;
/**
 * a program to replace spaces in a sentence with the word blank
 *
 * @author isaac altice
 * @version 2/6/2019
 */
public class BlankChangerDriver
{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        Replacer Sentence;
        Sentence = new Replacer();
        String replacement = "blank";
        char removed = ' ';
        int loop = 1;
 
        while (loop == 1){
            System.out.println("Enter a sentence");
            in.next();
            Sentence = new Replacer(in.nextLine());
            //System.out.println("Enter what character you would like to replace: ");
            //removed = in.next().charAt(0);
            //System.out.println("Enter what you would like to replace it with");
            //replacement = in.nextLine();
            Sentence.replace(replacement,removed);
            System.out.println("Original Sentence: " + Sentence.getOriginal());
            System.out.println("Converted Sentence: " + Sentence.getConverted());
            System.out.println("Enter 1 to enter another sentence or 0 to quit: ");
            loop = in.nextInt();

        }
    }
}
