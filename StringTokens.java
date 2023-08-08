package HackerRank;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] tokens = S.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i=0; i<tokens.length; ++i)
            if (tokens[i].length() > 0)
                numTokens++;

        System.out.println(numTokens);

        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);


        sc.close();
    }
}


//30
//        Its
//        always
//        better
//        if
//        you
//        find
//        edge
//        cases
//        by
//        yourself
//        rather
//        than
//        buying
//        test
//        cases
//        with
//        valuable
//        hackos
//        May
//        {-truncated-}