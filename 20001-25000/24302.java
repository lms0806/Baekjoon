import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()) / 1000, m = Integer.parseInt(st.nextToken()) / 1000;
        
        int answer = Math.min(solve1(n), solve2(n)) + Math.min(solve1(m), solve2(m));
        
        System.out.print(String.format("%.2f", answer / 100.0));
    }
    
    public static int solve1(int x) {
    	return x <= 5 ? 400 : x <= 10 ? 700 : x <= 20 ? 1200 : x <= 30 ? 1700 : x * 57; 
    }
    
    public static int solve2(int x) {
    	return x <= 2 ? 90 + x * 90 : x <= 5 ? 100 + x * 85 : x <= 20 ? 125 + x * 80 : x <= 40 ? 325 + x * 70 : 925 + x * 55;
    }
}
