package inflearn.str;

import java.util.Scanner;

class N1088{
    public String solution(String str){
        String[] arr = str.split(" ");
        int max = 0;
        String answer = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max) {
                continue;
            }
            if (arr[i].length() > max) {
                max = arr[i].length();
                answer = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N1088 T = new N1088();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
