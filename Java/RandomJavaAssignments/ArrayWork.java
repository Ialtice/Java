import java.util.*;
/**
 * A program to show how we can manipulate arrays
 *
 * @author Isaac Altice
 * @version 03/27/2019
 */
public class ArrayWork
{
    public static void main (String[] args)
    {
        int[] myNums = new int[10];
        for(int i = 0;i<myNums.length;i++)
        {
            myNums[i] = (int)(Math.random() * 15) +1;
        }
        System.out.print("\nArray contents: ");
        for(int i = 0;i<myNums.length;i++)
        {
            System.out.print(myNums[i] + " ");
        }
        System.out.print("\nArray contents in reverse order : ");
        for(int i = myNums.length-1;i>=0;i--)
        {
            System.out.print(myNums[i] + " ");
        }
        
        System.out.print("\nArray contents skipping every other element: ");
        for(int i = 0;i<myNums.length;i+=2)
        {
            System.out.print(myNums[i] + " ");
        }
        System.out.print("\nArray contents after removing 5th element: ");
        for(int i = 0;i<4;i++)
        {
            System.out.print(myNums[i] + " ");
            if(i == 3)
            {
                for(int j =4;j<myNums.length-1;j++)
                {
                    int temp = myNums[j+1];
                    myNums[j] = temp;
                    System.out.print(myNums[j] + " ");
                    if(j == myNums.length-2 )
                    {
                        myNums[myNums.length-1] = 0;
                        System.out.print(myNums[myNums.length-1] + " ");
                    }
                }
            }
        }
        System.out.print("\nArray sorted in decending order: ");
        for(int i = 0;i<myNums.length;i++)
        {
            int maxIndex = i;
            for(int j = i+1; j < myNums.length;j++)
            {
                if(myNums[j] > myNums[maxIndex])
                    maxIndex = j;
             int temp = myNums[maxIndex];
             myNums[maxIndex] = myNums[i];
             myNums[i] = temp;
                    
            }
        }
        for(int i = 0;i<myNums.length;i++)
        {
            System.out.print(myNums[i] + " ");
        }
        System.out.print("\nArray in reverse order: ");
        for(int i =0; i < myNums.length /2;i++)
        {
            int temp = myNums[i];
            myNums[i] = myNums[myNums.length - (i+1)];
            myNums[myNums.length- (i+1)] = temp;
        }
        for(int i = 0;i<myNums.length;i++)
        {
            System.out.print(myNums[i] + " ");
        }
        System.out.print("\nArray with 3rd element removed and elements shifted: ");
        for(int i = 0;i<2;i++)
        {
            System.out.print(myNums[i] + " ");
            if(i == 1)
            {
                for(int j =2;j<myNums.length-1;j++)
                {
                    int temp = myNums[j+1];
                    myNums[j] = temp;
                    System.out.print(myNums[j] + " ");
                    if(j == myNums.length-2 )
                    {
                        myNums[myNums.length-1] = 0;
                        System.out.print(myNums[myNums.length-1] + " ");
                    }
                }
            }
        }
        System.out.print("\nBigger array: ");
        int[] bigMyNums = new int[myNums.length *2];
        for(int i=0; i <myNums.length;i++)
        {
            bigMyNums[i] = myNums[i];
        }
        myNums = bigMyNums;
        for(int i = 0;i<myNums.length;i++)
        {
            System.out.print(myNums[i] + " ");
        }
    }
}
