
/**
 * extra credit program to create my own version of serveral string methods
 *
 * @author Isaac Altice
 * @version 3/10/19
 */
public class MyStringMethods
{
    private String original;
    private char[] letters;
    
    /**
     * Constructor for objects of class MyStringMethods
     */
    public MyStringMethods(String start)
    {
        original = start;
        letters = original.toCharArray();
    }
    public void setLetters(char[] inLetters)
    {
        letters = inLetters;
    }
    public void setOriginal(char[] inLetters)
    {
        String newSentence  = "";
        for(int i = 0; i < inLetters.length;i++)
        {
            newSentence += inLetters[i];
        }
        original = newSentence;
    }
    public String getOriginal()
    {
        return original;
    }
    public char[] getLetters()
    {
        return letters;
    }
    /**
     * charAt method 
     *
     * @param  inLetters takes in character array, index location of char element to return
     * @return  character in array at specific index.
     */
    public char charAt(char[] inLetters,int index)
    {
      if (inLetters.length > index && index >= 0)
      {
          return inLetters[index];   
      }
      else
      {
          System.out.println("Index out of bounds");
          return '?';
      }
    }
    /**
     * indexOf method 
     *
     * @param  inLetters takes in character array, inLetter takes in element to search for
     * @return  character index if found or -1 if not found.
     */
    public int indexOf(char[] inLetters,char inLetter)
    {
        for(int i = 0; i < inLetters.length;i++)
        {
            if (inLetters[i] == inLetter)
                return i;
        }
        return -1;
    }
    /**
     * lastIndexOf method 
     *
     * @param  inLetters takes in character array, inLetter takes in element to search for
     * @return  character index if found or -1 if not found.
     */
    public int lastIndexOf(char[] inLetters,char inLetter)
    {
        for(int i = inLetters.length -1; i >= 0; i--)
        {
            if (inLetters[i] == inLetter)
                return i;
        }
        return -1;
    }
    /**
     * replace method 
     *
     * @param  inLetters takes in character array, newLetter takes in element to replace the old, searchLetter takes in an element to search the array for
     * @return  void
     */
    public void replace(char[] inLetters,char searchLetter,char newLetter)
    {
        for(int i = 0; i < inLetters.length;i++)
        {
            if(inLetters[i] == searchLetter)
                inLetters[i] = newLetter;
        }
        setOriginal(inLetters);
    }
    /**
     * equals method 
     *
     * @param  inLetters takes in character array, inOtherLetter takes in array to compare characters to
     * @return  true if arrays contains same elements or false if they dont
     */
    public boolean equals(String inOriginal, String inOtherLetters)
    {
        char[] inLetters1 = inOriginal.toCharArray();
        char[] inOtherLetters1 = inOtherLetters.toCharArray();
        boolean isTrue = true;
        for(int i = 0; i < inLetters1.length;i++)
        {
            if(inLetters1[i] != inOtherLetters1[i])
                isTrue = false;
        }
        return isTrue;
    }
}
