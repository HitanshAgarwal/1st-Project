import java.util.*;
public class Piglatin
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String word, vowels, nword = "", fl = "";
        int indx = 0;
        char c;
        System.out.print("\fEnter a word: ");
        word = sc.next();
        word = word.toUpperCase();
        vowels = "AEIOU";
        for (int i = 0; i < word.length(); i++)
        {
            c = word.charAt(i);
            if (vowels.indexOf(c) > -1)
            {
                indx = i;
                break;
            }
            else
            {
                fl = fl + c;
            }
        }
        nword = word.substring(indx) + fl + "AY";
        System.out.print("\nNew Word: " + nword);
    }
}
