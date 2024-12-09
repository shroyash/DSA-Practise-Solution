class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> digit = new ArrayList<>();
        int carry = 0;
        
        // Process each digit in reverse order
        for (int i = num.length - 1; i >= 0; i--) {
            // Add the current digit of num and the last digit of k along with the carry
            num[i] = num[i] + (k % 10) + carry; 
            // Add the last digit of the result to the digit list
            digit.add(num[i] % 10); 
            // Update carry for the next iteration
            carry = num[i] / 10; 
            // Remove the last digit from k
            k = k / 10; 
        }

        // If there are any remaining digits in k or carry, process them
        k = k + carry;
        while (k != 0) {
            digit.add(k % 10); // Add last digit of k to digit
            k /= 10; // Remove last digit from k
        }

        // Since we've been adding digits in reverse order, we need to reverse the result
        Collections.reverse(digit); 

        return digit; // Return the final result
    }
}