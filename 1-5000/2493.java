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
		for(int i = 1; i <= size; i++) {
			int num = Integer.parseInt(str[i-1]);
			while(!sta.isEmpty()) {
				if(sta.peek()[1] >= num) {
					System.out.print(sta.peek()[0] + " ");
					break;
				}
				sta.pop();
			}
			if(sta.isEmpty()) {
				System.out.print("0 ");
			}
			sta.push(new int[] {i, num});
		}
	}
}
