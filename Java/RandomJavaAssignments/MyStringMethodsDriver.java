
/**
 * Driver program to test created methods.
 *
 * @author Isaac Altice
 * @version 3/10/2019
 */
public class MyStringMethodsDriver
{
    public static void main (String[] args)
    {
        String other = ("Some other words");
        MyStringMethods words = new MyStringMethods("starting string");
        System.out.println("Char at index 2 : " + words.charAt(words.getLetters(),2));
        System.out.println("Test charAt out of bounds index : " + words.charAt(words.getLetters(),100));
        System.out.println("First index of s found at : " + words.indexOf(words.getLetters(),'s'));
        System.out.println("Last index of s found at : " +  words.lastIndexOf(words.getLetters(),'s'));
        System.out.println("Original : " + words.getOriginal());
        System.out.println("Original with s replaced with a");
        words.replace(words.getLetters(),'s','a');
        System.out.println(words.getOriginal());
        System.out.println("compare two strings to see if they are equal");
        System.out.println("string one : " + words.getOriginal());
        System.out.println("string two : " + other);
        System.out.println("The two strings are equal: " + words.equals(words.getOriginal(), other));
    }
}
