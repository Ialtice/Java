

public class RandomCharacter {
	//generate random character between ch1 and ch2
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	
}
//generate random lowercase character
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a' , 'z');
}

//generate random uppercase letter
	public static char  getRandomUpperCaseLetter() {
		return getRandomCharacter('A','Z');
}

//generate random digit character
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0','9');
}
//generate random character
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
}

}
