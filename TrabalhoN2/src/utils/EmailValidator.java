package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class EmailValidator {
 
	private Pattern pattern;
	private Matcher matcher;
 
	public EmailValidator() {
		pattern = Pattern.compile(Global.REGEX_EMAIL_PATTERN);
	}
 
	/**
	 * Validate hex with regular expression
	 * 
	 * @param hex
	 *            hex for validation
	 * @return true valid hex, false invalid hex
	 */
	public boolean validate(final String hex) {
 
		matcher = pattern.matcher(hex);
		return matcher.matches();
 
	}
}