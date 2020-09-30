import java.util.*;
public class Series
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        Series s = new Series();
        System.out.print("\fEnter a number: ");
        double n = sc.nextDouble();
        double sum = s.series(n);
        System.out.print("\nAnswer: " + sum);
        System.out.print("\nEnter two numbers: ");
        double a = sc.nextDouble();
        n = sc.nextDouble();
        sum = s.series(a, n);
        System.out.print("\nAnswer: " + sum);
    }
    
    double series(double n)
    {
        double sum = 0;
        for (double i = 1; i <= n; i++)
        {
            sum += (1.0/i);
        }
        return sum;
    }
    
    double series(double a, double n)
    {
        double sum = 0;
        double p;
        for (double i = 0; i < n; i++)
        {
            p = Math.pow(a, (i * 3 + 2));
            sum += ((i * 3 + 1)/p);
        }
        return sum;
    }
}
