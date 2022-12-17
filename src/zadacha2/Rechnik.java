package zadacha2;

import java.util.*;

public class Rechnik {
	Map <String, String> rechnik = new HashMap<String, String>();
	public void vnesiMapa() {
		rechnik.put("I", "Jas");
		rechnik.put("You", "Ti");
		rechnik.put("He", "Toj");
		rechnik.put("She", "Taa");
		rechnik.put("It", "Toa");
	}
	public void translate(String a) {
		if(rechnik.containsKey(a)) {
			System.out.println(rechnik.get(a));
		}
		else {
			System.out.println("Ne postoj takov zbor vo rechnikot");
		}
	}
}
