import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MessageDigest md = MessageDigest.getInstance("SHA-224");
		md.update(br.readLine().getBytes());

		byte byteData[] = md.digest();
		
		StringBuffer sb = new StringBuffer(); 
        for(byte b : byteData) {
            sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }

        System.out.print(sb.toString());
	}
}
