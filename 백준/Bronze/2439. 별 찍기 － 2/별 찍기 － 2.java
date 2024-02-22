import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

    }

    public static void process() {
        for(int i = 1 ; i <= N; i++){
            int space = N-i;

            for(int j = 0 ; j < space; j++){
                sb.append(" ");
            }
           
            for(int j = 0 ; j < i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
