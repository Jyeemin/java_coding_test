package inflearn.str;

import java.util.Scanner;

class N1097{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] answer = new String[N];

        String replace = str.replace("#", "1").replace("*", "0");

        for (int i = 0; i < N; i++) {
           answer[i] = replace.substring(i*7,(i+1)*7);
        }

        StringBuilder sb = new StringBuilder();
        int x = 0; int a = 1;
        //1) 1011001 을 10진수로 변경하기
        for (int i = 0; i < N ; i++) {
            for (int j = 6; j >= 0 ; j--) {
                if(answer[i].charAt(j) == '1'){
                    x = x + a;
                }
                a = a * 2;
            }
            sb.append((char) x);
            a = 1;
            x = 0;
        }
        System.out.println(sb);

        

        }



    }

