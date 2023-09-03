import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		Point[] arr = new Point[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int a = 0, b = 0;
		int min = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int mx = Math.abs(arr[i].x - arr[j].x);
				int my = Math.abs(arr[i].y - arr[j].y);
				
				if(min < mx + my) {
					min = mx + my;
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.print(a + " " + b);
	}
}
