import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(br.readLine().getBytes());
		
		StringBuilder sb = new StringBuilder();
		for(byte b : md.digest()) {
			sb.append(String.format("%02x", b));
		}
		
		System.out.print(sb.toString());
	}
}
