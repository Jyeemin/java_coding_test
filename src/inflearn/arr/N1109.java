package inflearn.arr;

import java.util.Scanner;

class N1109{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        //피보나치 수열 = 앞의 두 수를 합해서 다음 숫자가 되는 수열
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1; int b = 1; int c;
        System.out.print(a + " " + b + " ");
        int[] arr = new int[N];
        for (int i = 0; i < N - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
