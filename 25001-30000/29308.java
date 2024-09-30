import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String answer = null;
		int max = Integer.MIN_VALUE;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String name = st.nextToken(), nation = st.nextToken();
			
			if(nation.equals("Russia") && max < num) {
				max = num;
				answer = name;
			}
		}
		System.out.print(answer);
	}
}
