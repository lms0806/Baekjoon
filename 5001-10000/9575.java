import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int[] a = input(Integer.parseInt(br.readLine()), br.readLine());
			
			int[] b = input(Integer.parseInt(br.readLine()), br.readLine());
			
			int[] c = input(Integer.parseInt(br.readLine()), br.readLine());
			
			HashSet<Integer> set = new HashSet<>();
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < b.length; j++) {
					for(int k = 0; k < c.length; k++) {
						if(check(a[i] + b[j] + c[k])) {
							set.add(a[i] + b[j] + c[k]);
						}
					}
				}
			}
			
			sb.append(set.size()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int num) {
		while(num != 0) {
			if(num % 10 != 5 && num % 10 != 8) {
				return false;
			}
			num /= 10;
		}
		
		return true;
	}
	
	public static int[] input(int size, String str) {
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		return num;
	}
}
