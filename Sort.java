import java.util.*;
public class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        int t;
        System.out.print("\f");
        for (int i = 0; i < 10; i++)
        {
            System.out.print("\nEnter element #" + i + " : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10 - i; j++)
            {
                if (a[j] < a[j + 1])
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + "  ");
        }
    }
}
