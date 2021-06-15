package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserFactory {

	private static final String names = "Alexis Broadway Emmy Points Kristi Witek Ronald Lamers Hien Agbayani Andra Avants Corrine Leedy Robby Mcclenton Alycia Rick Christoper Saini Rosario Costanza Melony Raffa Jerica Decaro Wilfred Galasso Virgil Jude Ureno Omar Wight Apolonia Faivre Stacia Merwin Antonette Voliva Cindi";
	
	private static final List<String> userNames = new ArrayList<String>(Arrays.asList(names.split(" ")));

	private static final String[] ext = { "ab", "cd", "ef", "gh", "ij", "kl", "mn", "op", "qr", "st", "uv", "wx",
			"yz" };
	
	private static final int[] about = {1,2,3,4};

	private static final Random rand = new Random();
	private static final StringBuilder sb = new StringBuilder();
	private static String userName = "";

	public static int nameSize() {
		return userNames.size();
	}

	public static String getUserName(int i) {
		userName = userNames.get(i)+rand.nextInt(99);
		return userName;
	}

	public static String passwordGenerator(int i) {
		sb.delete(0, sb.length());
		int num = rand.nextInt(1000000);
		String numFormat = String.format("%05d", num);
		sb.append(getUserName(i).charAt(0)).append(getUserName(i).charAt(1)).append(numFormat);
		return sb.toString();
	}

	public static String emailGenerator(int i) {

		sb.delete(0, sb.length());
		sb.append(getUserName(i).toLowerCase()).append(".test@test.")
				.append(ext[rand.nextInt(ext.length)]);
		return sb.toString();
	}
	
	public static int about () {
		return about[rand.nextInt(about.length)];
	}
	

}
