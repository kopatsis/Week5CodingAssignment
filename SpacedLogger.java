
public class SpacedLogger implements Logger {
	
	private String wordUsed;
	
	public SpacedLogger(String wordUsed) {
		this.setWordUsed(wordUsed);
	}

	public void Log() {
		for(int i = 0; i < wordUsed.length() - 1; i++) {
			System.out.print(wordUsed.charAt(i) + " ");
			
		}
		System.out.println(wordUsed.charAt(wordUsed.length() - 1));
	}

	public void Error() {
		System.out.print("ERROR: ");
		for(int i = 0; i < wordUsed.length() - 1; i++) {
			System.out.print(wordUsed.charAt(i) + " ");
			
		}
		System.out.println(wordUsed.charAt(wordUsed.length() - 1));
		
	}

	public String getWordUsed() {
		return wordUsed;
	}

	public void setWordUsed(String wordUsed) {
		this.wordUsed = wordUsed;
	}

}
