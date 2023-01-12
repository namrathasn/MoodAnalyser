public class MoodAnalyser {

	/**
	 * If message contains "Sad" it returns sad else it returns Happy If message is
	 * Null it returns Happy
	 * 
	 * @param message sent from test method
	 * @return mood
	 */
	public String analyseMood(String message) {
		try {
			if (message.contains("Sad") || message.contains("sad"))
				return "Sad";
			else
				return "Happy";
		} 
		catch (NullPointerException e) {
			return "Happy";
		}

	}

}
