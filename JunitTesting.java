package testing;

class MyCustomString implements MyCustomStringInterface{
	String s;
	public String getString(){
		return s;
	}
	 /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    public void setString(String string){
    		s = string;
    }

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
     *
     * If the current string is empty, the method should return 0.
     *
     * Examples:
     * - countNumbers would return 2 for string "My numbers are 11 and 96".
     *
     * @return Number of numbers in the current string
     * @throws NullPointerException If the current string is null
     */
    //I'd b3tt3r put s0me d161ts in this 5tr1n6, right?
    public int countNumbers() {
    		if(s==null) throw new NullPointerException();
    		boolean seenDigit = false;
    		int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    if(!seenDigit){
                        count++;
                        seenDigit = true;
                    }
                }else{
                    seenDigit = false;
                }
            }
            return count;
    }

    /**
     * Returns a string that consists of all and only the characters in positions n, 2n, 3n, and
     * so on in the current string, starting either from the beginning or from the end of the
     * string. The characters in the resulting string should be in the same order and with the
     * same case as in the current string.
     *
     * If the current string is empty or has less than n characters, the method should return an
     * empty string.
     *
     * Examples:
     * - For n=2 and a string of one character, the method would return an empty string.
     * - For n=2 and startFromEnd=false, the method would return the 2nd, 4th, 6th, and so on
     *   characters in the string.
     * - For n=3 and startFromEnd=true, the method would return the 3rd from the last character
     *   in the string, 6th from the last character in the string, and so on (in the order in
     *   which they appear in the string).
     *
     * Values n and startFromEnd are passed as parameters. The starting character, whether it is
     * the first one or the last one in the string, is considered to be in Position 1.
     *
     * @param n Determines the positions of the characters to be returned
     * @param startFromEnd Determines whether to start counting from the end or from the
     *                     beginning when identifying the characters in position n, 2n, 3n, and so
     *                     on. Please note that the characters are always returned in the order in
     *                     which they appear in the string.
     * @return String made of characters at positions n, 2n, and so on in the current string
     * @throws IllegalArgumentException If "n" less than or equal to zero
     * @throws NullPointerException If the current string is null and "n" is greater than zero
     *
     *///"I'd b3tt3r put s0me d161ts in this 5tr1n6, right?"
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
	    	if(n<=0) throw new IllegalArgumentException();
	    	if(s == null && n>=0) throw new NullPointerException();
	    	String answer = "";
	    	if(!startFromEnd){
	    		for(int i = 1; n*i < s.length(); i++) answer += s.charAt(n*i - 1);
	    	}else{
	    		int count = 1;
			    while(s.length() - n*count >= 0){
			      answer += s.charAt(s.length()-n*count++);
			    }
	    	}
	    	return answer;
    }

    /**
     * Replace the individual digits in the current string, between startPosition and endPosition
     * (included), with the corresponding English names of those digits, with the first letter
     * capitalized. The first character in the string is considered to be in Position 1.
     * Unlike for the previous method, digits are converted individually, even if contiguous.
     *
     * Examples:
     * - String 460 would be converted to FourSixZero
     * - String 416 would be converted to FourOneSix
     *
     * @param startPosition Position of the first character to consider
     * @param endPosition   Position of the last character to consider
     * @throws IllegalArgumentException    If "startPosition" > "endPosition"
     * @throws MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either
     *                                     "startPosition" or "endPosition" are out of
     *                                     bounds (i.e., either less than 1 or greater than the
     *                                     length of the string)
     * @throws NullPointerException        If "startPosition" <= "endPosition", "startPosition" and
     *                                     "endPosition" are greater than 0, and the current
     *                                     string is null
     */
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition){
    		if(startPosition > endPosition) throw new IllegalArgumentException();
    		if(startPosition < 0 || endPosition > s.length()) throw new MyIndexOutOfBoundsException();
    		if(s == null || s == "") throw new NullPointerException();
		    String[] numNames = {
			    "Zero",
			    "One",
			    "Two",
			    "Three",
			    "Four",
			    "Five",
			    "Six",
			    "Seven",
			    "Eight",
			    "Nine"
		    };
		    String number = s.substring(startPosition,endPosition);
		    String replacingPart = "";
		    for(int i = 0; i < number.length(); i++){
		    		if(Character.isDigit(number.charAt(i))) {
		    			replacingPart += numNames[Character.getNumericValue(number.charAt(i))];
		    		}else {
		    			replacingPart += number.charAt(i);
		    		}
		    }
		    s = s.substring(0,startPosition) + replacingPart + s.substring(endPosition);
    }
}