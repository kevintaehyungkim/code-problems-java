/* 
Implement an algorithm to determine if a string has all unique characters. 
What if you cannot add additional data structures? 

Assume ASCII string.
*/


boolean isUnique (String a) {
	// ASCII has 128 characters; any string over 128 characters can't be unique
	if (a.length() > 128) {
		return false;
	}
	// Initialize boolean array of size 128 to track characters
	boolean[] char_set = new boolean [128]; 
	// Iterate over every character 
	for (int i = 0; i < a.length(); i++){
		// Returns value of each character as an int value
		int val = a.charAt(i);
		// If character has been seen before in the string, return false
		if (char_set[val]) {
			return false;
		} 
		// Set that character has been seen
		char_set[val] = true;
	}
	// Every character of string evaluated in for-loop unique, return true
	return true;
}

/* 
Time: O(n), length of string
Space: O(n), or O(1) since string length cannot exceed 128, a constant
*/