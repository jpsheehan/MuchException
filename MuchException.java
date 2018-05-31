import java.util.Collections;
import java.util.Random;

/*
 * Written by JP Sheehan <jesse@sheehan.nz> on 21/02/18.
 * Licensed under the MIT license.
 */

/**
 * The MuchException class provides a heckin' good debugging experience.
 */
public class MuchException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private static final String NL = System.getProperty("line.separator");
	
	/**
	 * Picture of a good boi.
	 */
	private static final String doge = NL +
			"                   ▄              ▄" + NL + 
			"                  ▌▒█           ▄▀▒▌" + NL +
			"                  ▌▒▒█        ▄▀▒▒▒▐" + NL +
			"                 ▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐" + NL +
			"               ▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐" + NL +
			"             ▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌" + NL +
			"            ▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌" + NL +
			"            ▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐" + NL +
			"           ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌" + NL +
			"           ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌" + NL +
			"          ▌▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐" + NL +
			"          ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌" + NL +
			"          ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐" + NL +
			"           ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌" + NL +
			"           ▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐" + NL +
			"            ▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌" + NL +
			"              ▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀" + NL +
			"                ▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀" + NL +
			"                   ▒▒▒▒▒▒▒▒▒▒▀▀" + NL;

	/**
	 * The exclamation portion of the string returned by generateSentence.
	 */
	private static final String[] exclamations = {
		"Wow",
		"Gosh",
	};
	
	/**
	 * The first part of the sentence returned by generateSentence.
	 */
	private static final String[] determiners = {
		"So",
		"Much",
		"Many",
		"Such",
		"Very",
		"Heckin'",
	};
	
	/**
	 * The second part of the sentence returned by generateSentence.
	 */
	private static final String[] nouns = {
		"Error",
		"Fail",
		"Problem",
		"Issue",
		"Exception",
		"Confuse",
		"Bad",
		"Danger",
		"Bamboozle",
	};
	
	/**
	 * Generates a heckin' good randomised sentence.
	 * @return The generated sentence.
	 */
 	private static final String generateSentence() {
		return generateSentence("");
	}
	
 	/**
 	 * Generates a heckin' good randomised sentence with a message after it.
 	 * @param message The error message.
 	 * @return The generated sentence.
 	 */
	private static final String generateSentence(String message) {
		
		StringBuilder builder = new StringBuilder(doge);
		
		builder.append(NL);
		
		StringBuilder sentence = new StringBuilder();
		
		Random rand = new Random();
		
		// Only prepend the sentence with a short exclamation 50% of the time.
		if (rand.nextBoolean()) {
			
			sentence.append(exclamations[rand.nextInt(exclamations.length)]);
			sentence.append("! ");
			
		}
		
		// Append the determiner part.
		sentence.append(determiners[rand.nextInt(determiners.length)]);
		sentence.append(" ");
		
		// Append the noun part.
		sentence.append(nouns[rand.nextInt(nouns.length)]);
		sentence.append("!");
		
		// Only append the message if it exists.
		if (!message.isEmpty()) {
			
			sentence.append(" ");
			sentence.append(message);
			
		}
		
		// center the sentence
		builder.append(String.join("", Collections.nCopies(((49 - sentence.length())/ 2), " ")));
		builder.append(sentence);
		
		return builder.toString();
	}

	/**
	 * Creates a new MuchException object.
	 */
	public MuchException() {
		
		super(generateSentence());
		
	}
	
	/**
	 * Creates a new MuchException object with a message.
	 * @param message The message to append to the generated sentence.
	 */
	public MuchException(String message) {
		
		super(generateSentence(message));
		
	}
	
	/**
	 * Creates a new MuchException object with a message and a parent exception.
	 * @param message The message to append to the generated sentence.
	 * @param cause The parent exception.
	 */
	public MuchException(String message, Throwable cause) {
		
		super(generateSentence(message), cause);
		
	}
	
	/**
	 * Creates a new MuchException object with a parent exception.
	 * @param cause The parent exception.
	 */
	public MuchException(Throwable cause) {
		
		super(generateSentence(), cause);
		
	}
	
	/**
	 * Creates a new MuchException object with all the initialisation options for exceptions.
	 * @param message The message to append to the generated sentence.
	 * @param cause The parent exception.
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	protected MuchException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		
		super(generateSentence(message), cause, enableSuppression, writableStackTrace);
		
	}
	
}
