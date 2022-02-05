import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.print(a == 1996 || a == 1997 || a == 2000 || a == 2007 || a == 2008 || a == 2013 || a == 2018 ? "SPbSU" : a == 2006 ? "PetrSU, ITMO" : "ITMO");
	}
}
