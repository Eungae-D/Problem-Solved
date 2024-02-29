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

        N = Integer.parseInt(br.readLine());
    }

    public static void process() {
        sb.append(N).append("\n");
        sb.append(1);
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
