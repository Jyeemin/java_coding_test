package inflearn.Tree_Graph;

import org.w3c.dom.ls.LSOutput;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class section8_1 {

    static ArrayList<Integer> arr;

    public static void main(String[] args) {
        //자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램 작성
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new ArrayList<>();
        recursive(N);
        Collections.sort(arr);
        System.out.println(arr);
    }

    public static String recursive(int x) {
        if (x > 0) {
            arr.add(x);
            return recursive(x-1);
        }
        return null;
    }
}
