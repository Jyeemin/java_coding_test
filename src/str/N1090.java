package str;

import java.util.Scanner;

class N1090{
    public String solution(String str){
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = charArray.length - 1 ;
            while (lt < rt) {
                if(!Character.isAlphabetic(charArray[lt])) {
                    lt++;
                    continue;
                }
                if(!Character.isAlphabetic(charArray[rt])) {
                    rt--;
                    continue;
                }
                if (Character.isAlphabetic(charArray[lt]) &&
                        (Character.isAlphabetic(charArray[rt]))) {
                    char tmp = charArray[lt];
                    charArray[lt] = charArray[rt];
                    charArray[rt] = tmp;
                    lt++;
                    rt--;
                }
                }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        N1090 T = new N1090();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}
