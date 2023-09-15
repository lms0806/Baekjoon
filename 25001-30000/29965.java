import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        long a = 0, b = 0;
        long acount = 0, bcount = 0;
        while(t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            char c = st.nextToken().charAt(0);

            if(c == 'M') {
            	a += Integer.parseInt(st.nextToken());
            	acount++;
            }
            else {
            	b += Integer.parseInt(st.nextToken());
            	bcount++;
            }
        }
        
        long avga = a * bcount, avgb = b * acount;
        
        System.out.print(a == 0 && b == 0 ? "V" : b == 0 || avga > avgb ? "M" : a == 0 || avga < avgb ? "J" : "V");
    }
}
