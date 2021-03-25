
/**
 * This class contains a main( ) method only
 * and its purpose it to demonstrate the use
 * of several methods in the String class API
 * 
 * Each student must submit their completed code.
 * 
 * @author Isaac Altice-Goose Gang
 * @version todays's date
 */
public class StringMethods
{
    public static void main(String[ ] args)
    {
        String sentence;
        int count;
        
        sentence = new String("The Mississippi originates in Minnesota and flows to Louisiana.");
        System.out.println("The number of characters in the sentence:\n" + sentence + "\nis "+ sentence.length());
        count = 0;
        for(int k = 0; k < sentence.length( ); k++)
        {
            if(sentence.charAt(k) == 'i')
            {
                count++;
            }
        }

        System.out.println("The lowercase i appears " + count + " times.");

      //todo using the String class API methods
      /* 1) Does the sentence contain the string "nat" ?
       * 2) Does the sentence contain the string "beat" ?
       * 3) Does the sentence end with "ana"?
       * 4) Does the sentence end with "ana."?
       * 5) Where is the first occurance of 's' ?
       * 6) Where is the second occurance of 's'?
       * 7) Where is the third occurance of 's'?
       * 8) Where is the last occurace of 's'?
       * 9) Where does the  first occurance of "is" start?
       * 10)Where does the last occurance of "is" start"?
       * 11)Replace each occurance of 's' with 'z'.
       * 12) Does step 11 change the original sentence, prove it by printing.
       * 13) Print the substring of the sentence beginning at character 3 for 6 characters"
       * 14) Print the entire sentence in upper case.
       * 15) Does step 13 change the original string, prove it by printing
       */
      System.out.println("1.Does the sentence contain the string nat?");
      System.out.println(sentence.contains("nat"));
      System.out.println("2.Does the sentence contain the string beat?");
      System.out.println(sentence.contains("beat"));
      System.out.println("3.Does the sentence end with ana");
      System.out.println(sentence.endsWith("ana"));
      System.out.println("4.Does the sentence end with ana.?");
      System.out.println(sentence.endsWith("ana."));
      System.out.println("5.Where is the first occurance of s ?");
      System.out.println(sentence.indexOf("s"));
      System.out.println("6.Where is the second occurance of s?");
      System.out.println(sentence.indexOf('s', sentence.indexOf('s') +1));
      System.out.println("7.Where is the third occurance of s?");
      System.out.println(sentence.indexOf('s',(sentence.indexOf('s',sentence.indexOf('s',sentence.indexOf('s') + 1) + 1))));
      System.out.println("8.Where is the last occurance of s?");
      System.out.println(sentence.lastIndexOf('s'));
      System.out.println("9.Where does the first occurance of is start?");
      System.out.println(sentence.indexOf("is"));
      System.out.println("10.Where doest the last occurance of is start?");
      System.out.println(sentence.lastIndexOf("is"));
      System.out.println("11. Replace each occurance of s with z ");
      System.out.println(sentence.replace('s','z'));
      System.out.println("12.Does step 11 change the orginal sentence, prove it by printing.");
      System.out.println(sentence);
      System.out.println("13.Print the substring of the sentence beginning at character 3 for 6 characters");
      System.out.println(sentence.substring(2,9));
      System.out.println("14.Print the entire sentence in upper case");
      System.out.println(sentence.toUpperCase());
      System.out.println("15.Does step 13 change the original string, prove it by printing");
      System.out.println(sentence);
      
      
      
      
      
     }
}
