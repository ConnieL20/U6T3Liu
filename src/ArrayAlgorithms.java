public class ArrayAlgorithms {
    /** Returns the longest String(s) in an array of Strings.
     *  If multiple strings are tied for longest length, return the last
     *  element in the list with that length.
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: stringList.length > 0
     */
    public static String longestString(String[] stringList) {
        // IMPLEMENT ME using an enhanced for loop!
        String longest = stringList[0];
        String last = stringList[0];
        for (String string : stringList){
            if (string.length() > longest.length()){
                longest = string;
            } else if (string.length() == longest.length()){
                last = string;
                longest = last;
            }
        }
        return longest;
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise,
     *  returns false; use an early return to improve efficiency!
     *  note: 0 is not considered positive
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static boolean containsPositive(int[] numList)
    {
        // IMPLEMENT ME using an enhanced for loop and early return!
        for(int num : numList){
            if (num > 0){
                return true;
            }
        }
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase (use the toLowerCase() string method)
     *
     *  This method does NOT modify the original array
     *  PRECONDITION: wordList.length > 0
     */
    public static String[] makeLowercase(String[] wordList) {
        // IMPLEMENT ME using the most appropriate for loop!
        String[] lowerCase = new String[wordList.length];

        for (int i = 0; i < wordList.length; i++) {
            lowerCase[i] = wordList[i].toLowerCase();
        }

        return lowerCase;
    }


    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: stringList.length > 0
     */
    public static int endsInExclamations(String[] stringList) {
        // IMPLEMENT ME using the most appropriate for loop!
        int counter = 0;
        for (String string : stringList){
            String lastChar = string.substring(string.length() - 1);
            if (lastChar.equals("!")) {
                counter++;
            }
        }
        return counter;
    }

    /** Updates each String in the array to be all uppercase; this method does
     *  not return a value
     *
     *  This method MODIFIED the original array
     *  PRECONDITION: wordList.length > 0
     */
//    public static void makeUppercase(String[] wordList) {
//    // IMPLEMENT ME using the most appropriate for loop!
//        for (int i = 0; i < wordList.length; i++){
//            wordList[i] = wordList[i].toUpperCase();
//        }
//    }

    public static void makeUppercase(String[] wordList) {
        String[] upperStrs = new String[wordList.length];

        for (int i = 0; i < wordList.length; i++) {
            upperStrs[i] = wordList[i].toUpperCase();
        }

        // set wordList to the newList
        wordList = upperStrs;
    }


    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the
     *  higher of the two at that respective index in the two original arrays
     *
     *  This method does NOT modify either of the original arrays
     *  PRECONDITION: intArr1.length == intArr2.length
     */
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        // IMPLEMENT ME using the most appropriate for loop!
        int[] maxArray = new int[intArr1.length];

        for (int i = 0; i < intArr1.length; i++){
            if (intArr1[i] >= intArr2[i]){
                maxArray[i] = intArr1[i];
            } else {
                maxArray[i] = intArr2[i];
            }
        }
        return maxArray;
    }

    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static int countConsecutiveDoubles(int[] numList) {
        // IMPLEMENT ME using the most appropriate for loop!
        int counter = 0;
        for (int i = 0; i < numList.length - 1; i++){
            if (numList[i] == numList[i+1]){
                counter++;
            }
        }
        return counter;
    }

    /** Returns the "longest streak" of the array; a streak is the number of times
     *  a particular number is repeated consecutively, one after the other
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static int longestStreak(int[] nums) {
        // IMPLEMENT ME using the most appropriate for loop!
        int longest = 1;
        int streak = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                longest++;
                if (longest > streak){
                    streak = longest;
                }
            } else {
                longest = 1;
            }
        }
        return streak;
    }









}
