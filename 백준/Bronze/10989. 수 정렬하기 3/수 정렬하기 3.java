import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        private static StringBuilder sb;
        private static BufferedReader br;
        private static StringTokenizer st;
        private static int N;
        private static int[] arr;

        //입력
        public static void input() throws Exception {
            br = new BufferedReader(new InputStreamReader(System.in));
            sb = new StringBuilder();

            N = Integer.parseInt(br.readLine());

            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        }

        //실행
        public static void process() {
            Arrays.sort(arr);

            for(int i : arr){
                sb.append(i).append("\n");
            }

            System.out.println(sb);
        }


        public static void main(String[] args) throws Exception {
            input();
            process();
        }
}