/* 
Given two strings, write a method to decide if one is a permutation of the other.
Assume ASCII string.
*/ 

boolean checkPermutation (String a, String b) {
	// Cannot be permutations if different lengths, return false
	if (a.length() != b.length()) {
		return false;
	}
	return sort(a).equals(sort(b));
}

// Helper method to sort strings
String sort (String s) {
	// Convert string to character array
	char[] content = s.toCharArray();
	// Sort the character array
	java.util.Arrays.sort(content);
	// Return string using character array
	return new String(content);
}