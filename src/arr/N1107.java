package arr;

import java.util.Scanner;

class N1107{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int count = 1; int max = Integer.parseInt(str[0]);
        for (int i = 0; i < str.length; i++) {
            if (max < Integer.parseInt(str[i])) {
                max = Integer.parseInt(str[i]);
                count++;
            }

        }
        System.out.println(count);

    }
}
