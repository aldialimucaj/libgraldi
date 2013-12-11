package al.aldi.groovy.utils

import java.util.LinkedHashMap;

class StrUtils {
	/**
	 * Puts the text in round brackets "()" and returns it.
	 * <pre>
	 * {@code 
	 * withRoundBrackets("i hate concatenating strings") 
	 * // returns -> (i hate concatenating strings)
	 * }
	 * </pre>
	 * @param str text you want to put in brackets. If null it will 
	 * return the text "null"
	 * @return text in round brackets like test -> (test)
	 */
	def static String withRoundBrackets(str) {
		"($str)"
	}

	/**
	 * Puts the text in square brackets "[]" and returns it.
	 * <pre>
	 * {@code
	 * withSquareBrackets("i hate concatenating strings")
	 * // returns -> [i hate concatenating strings]
	 * }
	 * </pre>
	 * @param str text you want to put in brackets. If null it will 
	 * return the text "null"
	 * @return text in brackets
	 */
	def static String withSquareBrackets(str) {
		"[$str]"
	}

	/**
	 * Puts the text in square brackets "{}" and returns it.
	 * <pre>
	 * {@code
	 * withCurlyBrackets("i hate concatenating strings")
	 * // returns -> {i hate concatenating strings}
	 * }
	 * </pre>
	 * @param str text you want to put in brackets. If null it will 
	 * return the text "null"
	 * @return text in brackets
	 */
	def static String withCurlyBrackets(str) {
		"{$str}"
	}


	/* ************************* URL Utils ********************************* */

	/**
	 * Takes a HashMap of key value parameters and returns an URL ready
	 * parameter string. Null will return an empty string.
	 * <pre>
	 * {@code
	 * LinkedHashMap<String, String> params = new LinkedHashMap<>();
	 * params.put("user", "aldi");
	 * params.put("rights", "admin");
	 * expandParamters(params);
	 * //returns -> user=aldi&rights=admin
	 * }
	 * </pre>
	 * 
	 * @param params dictionary of parameter values
	 * @return string of key value pairs.
	 */
	def static String expandParamters(HashMap params) {
		params.collect { k,v -> "$k=$v" }.join('&')
	}
}
