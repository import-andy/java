// Ceaesar encription algorithm

public class Caesar2 {

	// abcdefghijklkmnopqrstuvwxyz
	// ABCDEFGHIJKLKMNOPQRSTUVWXYZ

	public String encrypt(String plainText, int offset){  // declaring a method
		String cipher = "";
		char[] arr = plainText.toCharArray();
		for(int i = 0; i < arr.length; i++){
			int numericVal = (int) arr[i];
			if (numericVal == 32) {  // for space characteras
				cipher += arr[i];
			} else if (Character.isUpperCase(arr[i])){  // for uppercase characters
				cipher += (char) (((numericVal + offset-65) % 26) + 65);
			} else {  // for lowercase characters
				cipher += (char) (((numericVal + offset-97) % 26) + 97);
			}
		}
		return cipher;
	}

	public static void main(String[] args){
		Caesar2 t = new Caesar2();
		System.out.println(t.encrypt("Isnt Java Great?", 4));
		System.out.println(t.encrypt("ABCZ", 4));
		System.out.println(t.encrypt("Hello", 4));
	}

}