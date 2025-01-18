import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(int x1, int y1, int r1, int x2, int y2, int r2) {
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		int dist = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		if(dist > Math.pow(r1 + r2, 2) || dist < Math.pow(r1 - r2, 2)) {
			return 0;
		}
		
		if(dist == Math.pow(r1 + r2, 2) || dist == Math.pow(r1 - r2, 2)) {
			return 1;
		}
		
		return 2;
	}
}
