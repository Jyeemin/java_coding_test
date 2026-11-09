package inflearn.str;

import java.util.Scanner;

class N1095{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        char[] charArray = s.toCharArray();
        int [] lt = new int[charArray.length];
        int[] rt = new int[charArray.length];

        int d = 1000;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == t.charAt(0)) {
                d = 0;
                lt[i] = d;
            } else {
                d++;
                lt[i] = d;
            }
        }

        d = 1000;
        for (int i = charArray.length - 1; i >= 0 ; i--) {
            if (charArray[i] == t.charAt(0)) {
                d = 0;
                rt[i] = d;
            } else {
                d++;
                rt[i] = d;
            }

        }

        int[] nCharArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            nCharArray[i] = Math.min(lt[i], rt[i]);

            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(nCharArray[i]);
        }


    }
}
