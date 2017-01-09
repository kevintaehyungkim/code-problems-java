/* 
There are 3 types of edits that can be performed on strings: insert a character, remove a character,
or replace a character. Given 2 strings, write a function to check if they're one edit, or zero
edits away.
*/ 

boolean oneEditAway (String first, String second){
	if (first.length() == second.length()){
		return isReplace(first, second);
	} else if (first.length()+1 == second.length()){
		return isInsert(first, second);
	} else if (first.length() == second.length()+1){
		return isInsert(second, first);
	}
	return false;
}

boolean isReplace(String first, String second){
	boolean differenceFound = false;
	for (int i = 0; i < first.length(); i++){
		if (first.charAt(i) != second.charAt(i)){
			if (differenceFound){
				return false;
			}
			differenceFound = true;
		}
	}
}

boolean isInsert (String first, String second){
	for (int i = 0; i < second.length(); i++){
		StringBuilder a = new StringBuilder(second);
		a.deleteCharAt(i);
		if ((a.toString()).equals(first)){
			return true;
		}
	}
	return false;
}