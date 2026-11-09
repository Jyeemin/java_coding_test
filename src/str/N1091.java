package str;

import java.util.HashSet;
import java.util.Scanner;

class N1091{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        N1091 T = new N1091();
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        char[] nCh = new char[ch.length];
        HashSet<Character> set = new HashSet<>();

        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (!set.contains(ch[i])) {
                set.add(ch[i]);
                nCh[index++] = ch[i];
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(nCh[i]);
        }

        }
    }

