import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.print(s.equals("fdsajkl;") || s.equals("jkl;fdsa") ? "in-out" : s.equals("asdf;lkj") || s.equals(";lkjasdf") ? "out-in" : s.equals("asdfjkl;") ? "stairs" : s.equals(";lkjfdsa") ? "reverse" : "molu");
	}
}
