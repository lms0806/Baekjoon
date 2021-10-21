import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Node>[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[st.nextToken().charAt(0) - 'A' + 1].add(new Node(st.nextToken().charAt(0) - 'A' + 1, st.nextToken().charAt(0) - 'A' + 1));
		}
		
		preorder(1);
		sb.append("\n");
		inorder(1);
		sb.append("\n");
		postorder(1);
		
		System.out.print(sb);
	}
	
	public static void preorder(int start) {
		for(Node node : arr[start]) {
			int l = node.left, r = node.right;
			
			sb.append((char)(start + 'A' - 1));
			
			if(l != -18) {
				preorder(l);
			}
			if(r != -18) {
				preorder(r);
			}
		}
	}
	
	public static void inorder(int start) {
		for(Node node : arr[start]) {
			int l = node.left, r = node.right;
			
			if(l != -18) {
				inorder(l);
			}
			sb.append((char)(start + 'A' - 1));
			if(r != -18) {
				inorder(r);
			}
		}
	}
	
	public static void postorder(int start) {
		for(Node node : arr[start]) {
			int l = node.left, r = node.right;
			
			if(l != -18) {
				postorder(l);
			}
			if(r != -18) {
				postorder(r);
			}
			sb.append((char)(start + 'A' - 1));
		}
	}
}

class Node{
	int left, right;
	
	public Node(int left, int right) {
		this.left = left;
		this.right = right;
	}
}
