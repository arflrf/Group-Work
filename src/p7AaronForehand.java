import java.util.Scanner;
import java.util.Arrays;

public class p7AaronForehand {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter? ");
        int n = input.nextInt();
        
        double [] numbers = new double[n];
        fillArray(numbers);
        double average = averageArray(numbers);
        
        System.out.printf("The average is %4.2f",average);
        System.out.println("");
        printArray(numbers);
        
        
    }
    
    public static void fillArray(double [] array)
    {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < array.length;i++)
        {
            System.out.println("Enter a number to fill array: ");
            array[i] = input.nextDouble();
        }
    }
    
    public static double averageArray(double [] array)
    {
        int sum = 0;
        for(int y=0;y < array.length;y++)
        {
            sum += array[y];
        }
        double average = sum / array.length;
        return average;
    }
    
    public static void printArray(double [] array)
    {
        System.out.print("[");
        for(int u = 0; u< array.length;u++)
        System.out.print(array[u] + ", ");
        System.out.print("]");
    }
}