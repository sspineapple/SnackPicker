package foood;
import java.util.Scanner;
public class Foood
{
    public static void main(String[] args)
    {
        System.out.println("The closest food(s) that matches your wants is:\n" + getFood(getCode()));
    }
    public static String getCode()
    {
        //get the input crap stuff working
        Scanner in = new Scanner (System.in);
        
        //sweet or salty input
        System.out.println("Do you want sweet / salty food?");
        String q1 = in.nextLine();
        while (!(checkInput(q1, "sweet", "salty")))
        {
            System.out.println("Not a valid response, type sweet or salty");
            q1 = in.nextLine();
        }
        String c1;
        if (q1.equals("sweet"))
        {
            c1 = "a";
        }
        else
        {
            c1 = "b";
        }
        
        //spicy or sour or neither input
        System.out.println("Do you want spicy / sour / neither food?");
        String q2 = in.nextLine();
        while (!(checkInput(q2, "spicy", "neither") || checkInput(q2, "sour", "neither")))
        {
            System.out.println("Not a valid response, type spicy or sour or neither");
            q2 = in.nextLine();
        }
        String c2;
        if (q2.equals("spicy"))
        {
            c2 = "a";
        }
        else if (q2.equals("sour"))
        {
            c2 = "b";
        }
        else
        {
            c2 = "c";
        }

        //cunchy or soft input
        System.out.println("Do you want crunchy / soft food?");
        String q3 = in.nextLine();
        while (!(checkInput(q3, "crunchy", "soft")))
        {
            System.out.println("Not a valid response, type crunchy or soft");
            q3 = in.nextLine();
        }
        String c3;
        if (q3.equals("crunchy"))
        {
            c3 = "a";
        }
        else
        {
            c3 = "b";
        }
        
        //healthy / nonhealthy input
        System.out.println("Do you want healthy / unhealthy food?");
        String q4 = in.nextLine();
        while (!(checkInput(q4, "healthy", "unhealthy")))
        {
            System.out.println("Not a valid response, type healthy or unhealthy");
            q4 = in.nextLine();
        }
        String c4;
        String c5;
        if (q4.equals("healthy"))
        {
            c4 = "a";
            c5 = "a";
        }
        else
        {
            c4 = "b";
            c5 = "b";
        }
        
        
        
        String code = c1 + c2 + c3 + c4 +c5;
        return code;
    }
    public static boolean checkInput(String input, String option1, String option2)
    {
        return (input.equals(option1) || input.equals(option2));
    }
    public static String getFood(String code)
    {
        // sweet = a     salty = b
        // spicy = a     sour  = b     neither = c
        // crunchy = a   soft  = b
        // healthy = a  unhealthy = b
        String miniBellPeppers       = "aaaaa";
        int miniBellPeppersNum = comparer(code, miniBellPeppers);
        String apple                 = "acaaa";
        int appleNum = comparer(code, apple);
        String strawberries          = "abbaa";
        int strawberriesNum = comparer(code, strawberries);
        String cucumbers             = "acaaa";
        int cucumbersNum = comparer(code, cucumbers);
        String granolaBarWithBerries = "abaaa";
        int granolaBarWithBerriesNum = comparer(code, granolaBarWithBerries);
        String gushers               = "acbbb";
        int gushersNum = comparer(code, gushers);
        String oreos                 = "acabb";
        int oreosNum = comparer(code, oreos);
        String warheads              = "abbbb";
        int warheadsNum = comparer(code, warheads);
        String spicyDoritos          = "aaabb";
        int spicyDoritosNum = comparer(code, spicyDoritos);
        String goldfish              = "bcaaa";
        int goldfishNum = comparer(code, goldfish);
        String cheesyPoofs           = "bcabb";
        int cheesyPoofsNum = comparer(code, cheesyPoofs);
        String nuts                  = "bcaaa";
        int nutsNum = comparer(code, nuts);
        String ritzCrackers          = "bcabb";
        int ritzCrackersNum = comparer(code, ritzCrackers);
        String spicyCheetos          = "baabb";
        int spicyCheetosNum = comparer(code, spicyCheetos);
        String b[] ={"Mini Bell Peppers ", "Apples ", "Strawberries ", "Cucumbers ", "Granola bars with berries ", "Gushers ", "Oreos ", "Warheads ", "Spicy Doritos ", "Goldfish ", "Cheesy Poofs ", "Nuts ", "Ritz Crackers ", "Spicy Cheetos "};
        int a[] = {miniBellPeppersNum, appleNum, strawberriesNum, cucumbersNum, granolaBarWithBerriesNum, gushersNum, oreosNum, warheadsNum, spicyDoritosNum, goldfishNum, cheesyPoofsNum, nutsNum, ritzCrackersNum, spicyCheetosNum};
        int largest = shootmern(a, 14);
        String idk = "";
        int idontwannasleep = 0;
        if (largest == 5)
        {
            for (int i = 0; i < 14; i++)
            {
                    if (idontwannasleep == 0 && a[i] == 5)
                    {
                        System.out.println("Perfect match!");
                        idk = idk + b[i];
                        idontwannasleep++;
                    }
                    else if (idontwannasleep != 0 && a[i] == 5)
                    {
                        idk = idk + "and " + b[i];
                        idontwannasleep++;
                    }
            }
            return idk;
        }
        else if (largest != 5)
        {
                for (int i = 0; i < 14; i++)
                {
                    if (a[i] == largest)
                    {
                        if (idontwannasleep == 0)
                        {
                            System.out.println("There was no perfect match, but");
                            idk = idk + b[i];
                            idontwannasleep++;
                        }
                        else
                        {
                            idk = idk + "and " + b[i];
                            idontwannasleep++;
                        }
                    }
                }
        }
        return idk;
        }
    public static int comparer(String code, String foods)
    {
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            if (code.substring(i, i+1).equals(foods.substring(i, i+1)))
            {
                count++;
            }
        }
        return count;
    }
    public static int shootmern(int[] a, int total)
    {
        int ok = a[0];
        for (int i = 0; i < total; i++)
        {
            if (a[i] > ok)
            {
                ok = a[i];
            }
        }
        return ok;
    }
}