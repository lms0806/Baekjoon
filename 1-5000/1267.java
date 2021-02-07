package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = 0, n1 = 0;
		for(int i = 0; i < size; i++) {
			int a = Integer.parseInt(st.nextToken());
			n += a/30+1;
			n1 += a/60+1;
		}
		
		n*=10;
		n1*=15;
		
		StringBuilder sb = new StringBuilder();
		if(n > n1) {
			sb.append("M ").append(n1);
		}
		else if(n == n1) {
			sb.append("Y M ").append(n);
		}
		else {
			sb.append("Y ").append(n);
		}
		System.out.print(sb);
	}
}
// throws NumberFormatException,IOException
//StringTokenizer st = new StringTokenizer(br.readLine());
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
