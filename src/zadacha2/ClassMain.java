package zadacha2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ClassMain {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String a = bf.readLine();
			Rechnik r = new Rechnik();
			r.vnesiMapa();
			r.translate(a);
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
