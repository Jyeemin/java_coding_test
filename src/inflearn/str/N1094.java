package inflearn.str;

import java.util.Scanner;

class N1094{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] nCh = new char[ch.length];
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                nCh[index++] = ch[i];
            }
        }

        String nStr = String.valueOf(nCh,0,index);
        System.out.println(Integer.parseInt(nStr));


        }

        }



