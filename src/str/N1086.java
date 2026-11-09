package str;

import java.util.Scanner;


//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class N1086{
    public int solution(String str, char t){
        int answer = 0;
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        N1086 T = new N1086();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));
    }
}
