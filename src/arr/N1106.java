package arr;

import java.util.Scanner;

class N1106{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.print(str[0] + " ");
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > Integer.parseInt(str[i - 1])) {
                System.out.print(str[i]);
                System.out.print(" ");
            }
        }

    }
}
