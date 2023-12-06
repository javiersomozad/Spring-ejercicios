package es.jsomoza.configsimple;

import java.util.Random;

public class RandomLetter {
	public String random () {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int index = new Random().nextInt(letters.length()-2);
		return letters.substring(index, index + 1);
	}
}
