import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ds = Integer.parseInt(st.nextToken()), ys = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dm = Integer.parseInt(st.nextToken()), ym = Integer.parseInt(st.nextToken());

        int sun = ys - ds, moon = ym - dm;
        while(sun != moon){
            if(sun < moon){
                sun += ys;
            }
            else{
                moon += ym;
            }
        }
        System.out.print(sun);
    }
}
