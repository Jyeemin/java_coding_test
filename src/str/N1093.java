package str;

import java.util.Scanner;

class N1093{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //str.N1093 T = new str.N1093();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char[] ch = str.toCharArray();
        char[] Nch = new char[ch.length];
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isAlphabetic(ch[i])) {
                Nch[index++] = ch[i];
            }
        }
        String nStr = String.valueOf(Nch);

        int lt = 0;
        int rt = index -1;
        while (lt < rt) {
            char tmp = Nch[lt];
            Nch[lt] = Nch[rt];
            Nch[rt] = tmp;

            lt++;
            rt--;
        }
        if (nStr.equals(String.valueOf(Nch))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
