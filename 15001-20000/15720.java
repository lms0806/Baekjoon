import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		ArrayList<Integer> a = input(br.readLine()), b = input(br.readLine()), c = input(br.readLine());
		
		Collections.sort(a);
		Collections.sort(b);
		Collections.sort(c);
		
		StringBuilder sb = new StringBuilder();
		sb.append(sum(a) + sum(b) + sum(c)).append("\n");
		
		int answer = 0;
		while(a.size() != 0 && b.size() != 0 && c.size() != 0) {
			int an = a.size() - 1, bn = b.size() - 1, cn = c.size() - 1;
			
			answer += (a.get(an) + b.get(bn) + c.get(cn)) * 0.9;
			a.remove(an);
			b.remove(bn);
			c.remove(cn);
		}
		sb.append(answer + sum(a) + sum(b) + sum(c));
		System.out.print(sb);
	}
	
	public static ArrayList<Integer> input(String str){
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		return arr;
	}
	
	public static int sum(ArrayList<Integer> arr) {
		int num = 0;
		
		for(int n : arr) {
			num += n;
		}
		
		return num;
	}
}
