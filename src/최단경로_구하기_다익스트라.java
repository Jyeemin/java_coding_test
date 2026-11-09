import java.util.*;

public class 최단경로_구하기_다익스트라 {
    static void main() {

    }
    class Solution {
        public String solution(int N, int[] arr) {
            String answer ="";
            int c=0; int d=0;
            int[] sorted = arr.clone();
            Arrays.sort(sorted);
            for(int i=0; i<arr.length;i++){
                if (sorted[i] != arr[i]) {
                    if(c == 0) c = i+1;
                    else d= i+1;
                }
                }

            answer += c+" "+d;
            return answer;
        }
    }




    }

