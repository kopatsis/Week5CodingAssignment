
public class AsteriskLogger implements Logger  {
	
	private String wordUsed;
	
	public AsteriskLogger(String wordUsed) {
		this.setWordUsed(wordUsed);
	}

	public void Log() {
		System.out.println("***" + wordUsed + "***");
		
	}

	public void Error() {
		for(int i = 0; i < (wordUsed.length() + 12); i++){
			System.out.print("*");
		}
		System.out.println("*");
		System.out.println("***ERROR: " + wordUsed + "***");
		for(int i = 0; i < (wordUsed.length() + 12); i++){
			System.out.print("*");
		}
		System.out.println("*");
	}

	public String getWordUsed() {
		return wordUsed;
	}

	public void setWordUsed(String wordUsed) {
		this.wordUsed = wordUsed;
	}

}
