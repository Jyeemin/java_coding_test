package str;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;

class N1089{
    public String[] solution(String[] str){
        String[] nStr = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            String string = str[i];
            char[] charArray = string.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = charArray.length - 1; j >= 0; j--) {
                sb.append(charArray[j]);
            }
            nStr[i] = sb.toString();
        }
        return nStr;
    }

    public static void main(String[] args) {
        N1089 T = new N1089();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.nextLine();
        }
        String[] solution = T.solution(str);
        for (String string : solution) {
            System.out.println(string);
        }
        }
    }

