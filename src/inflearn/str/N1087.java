package inflearn.str;

import java.util.Scanner;

public class N1087 {
    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                sb.append(Character.toLowerCase(charArray[i]));
            }
            else{
                sb.append(Character.toUpperCase(charArray[i]));
            }


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        N1087 T = new N1087();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
