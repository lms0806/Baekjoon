import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        boolean[][] check = new boolean[1002][1002];
        while(n --> 0) {
        	st = new StringTokenizer(br.readLine());
        	check[Integer.parseInt(st.nextToken()) + 500][Integer.parseInt(st.nextToken()) + 500] = true;
        }
        
        int x = 500, y = 500;
        for(char c : br.readLine().toCharArray()) {
        	int nx = x, ny = y;
        	if(c == 'L') {
        		nx--;
        	}
        	else if(c == 'R') {
        		nx++;
        	}
        	else if(c == 'D') {
        		ny--;
        	}
        	else {
        		ny++;
        	}
        	
        	if(!check[nx][ny]) {
        		x = nx;
        		y = ny;
        	}
        }
        System.out.print((x - 500) + " " + (y - 500));
    }
}
