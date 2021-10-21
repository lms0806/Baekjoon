import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int u = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		ArrayList<Node> arr = new ArrayList<>();
		
		int[] price = new int[100001];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			arr.add(new Node(s, num));
			price[num]++;
		}
		
		int min = 100001;
		for(int p : price) {
			if(p > 0) {
				min = Math.min(p, min);
			}
		}
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		for(int i = 1; i < price.length; i++) {
			if(price[i] == min) {
				arr1.add(i);
			}
		}
		
		Collections.sort(arr1);
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i).price == arr1.get(0)) {
				System.out.print(arr.get(i).name + " " + arr.get(i).price);
				break;
			}
		}
	}
}

class Node{
	String name;
	int price;
	
	public Node(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
