package wordcount;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import exceptions.NotImplementedException;

public class WordCount {
	
	public List<String> parse(String input) {
		throw new NotImplementedException();
	}
	
	public Map<String, Integer> phrase(String input) {
		throw new NotImplementedException();
	}
	
	private String sanitize(String input) {
		StringBuilder sb = new StringBuilder();
		for ( int i = 0 ; i < input.length( ) ; i++ ) {
			if (Character.isLetterOrDigit( input.charAt( i ) ) ) {
				sb.append( input.charAt( i ) );
			}
		}
		return sb.toString( );
	}
}
