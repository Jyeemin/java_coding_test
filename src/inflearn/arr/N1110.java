package inflearn.arr;

import java.util.Scanner;

class N1110{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        //소수 = 자신과 1로만 나누어떨어지는 수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] isPrime = new boolean[N+1];
        int count = 0;

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= N; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
