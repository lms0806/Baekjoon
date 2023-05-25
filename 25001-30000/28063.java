import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    System.out.print(solve(n, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}

	public static int solve(int n, int x, int y){
		if(n == 1){
			return 0;
		}

		int answer = 4;
		if(x == 1 || x == n){
		    answer--;
	    }
	    if(y == 1 || y == n){
		    answer--;
	    }
		return answer;
	}	
}
