import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String[][] score = {{"A+","4.3"},{"A0","4"},{"A-","3.7"},{"B+","3.3"},{"B0","3"},{"B-","2.7"},{"C+","2.3"},{"C0","2"},{"C-","1.7"},{"D+","1.3"},{"D0","1.0"},{"D-","0.7"}};
		
		int grade = 0;
		double total = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			grade += num;
			
			for(int i = 0; i < score.length; i++) {
				if(str.equals(score[i][0])) {
					total += num * Double.parseDouble(score[i][1]);
					break;
				}
			}
		}
		System.out.print(String.format("%.2f", Math.round(total / grade * 100) / 100.0));
	}
}
