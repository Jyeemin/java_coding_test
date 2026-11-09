package inflearn.str;

import java.util.Scanner;

class N1092{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        N1092 T = new N1092();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while(lt < rt) {
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;
            lt++;
            rt--;
        }
        if (String.valueOf(charArray).equals(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
