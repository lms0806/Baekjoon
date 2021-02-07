import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<int[]> sta = new Stack<>();
		
		int size = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
        	StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int num = Integer.parseInt(str[i-1]);
			while(!sta.isEmpty()) {
				if(sta.peek()[1] >= num) {
					sb.append(sta.peek()[0]).append(" ");
					break;
				}
				sta.pop();
			}
			if(sta.isEmpty()) {
				sb.append("0 ");
			}
			sta.push(new int[] {i, num});
		}
        	System.out.print(sb);
	}
}
