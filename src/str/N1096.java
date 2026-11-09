package str;

import java.util.Scanner;

class N1096{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();


        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i < str.length() - 1 &&
                    str.charAt(i) == str.charAt(i + 1)) {
                count++;
                continue;
            }

            if (i == str.length() - 1 ||
                    str.charAt(i) != str.charAt(i + 1)) {
                sb.append(c);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }

        }
        System.out.println(sb);

    }
}
