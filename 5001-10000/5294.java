import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<Node> arr = new ArrayList<>();
		
		String s;
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			arr.add(new Node(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size() - 1; i++) {
			if(Math.abs(arr.get(i).height - arr.get(i + 1).height) <= 2) {
				sb.append(arr.get(i).name).append(" ").append(arr.get(i + 1).name).append("\n");
				i++;
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	int height;
	
	public Node(String name, int height) {
		this.name = name;
		this.height = height;
	}

	@Override
	public int compareTo(Node o) {
		return this.height - o.height;
	}
}
