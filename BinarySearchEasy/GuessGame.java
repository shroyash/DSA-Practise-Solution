/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid); // Call guess once and store the result

            if (result == 0) {
                return mid; // Return mid immediately if it's the correct guess
            } else if (result == -1) {
                end = mid - 1; // The guess is too high
            } else {
                start = mid + 1; // The guess is too low
            }
        }
        
        return -1; // This line should not be reached if input constraints are met
    }
}
