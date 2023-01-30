
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word, phrase or a sequence. I will check if it is a palindrome: ");
        System.out.println(CheckifPalindrome(scanner.next()));
    }

    public static boolean CheckifPalindrome(String input) {
        String response = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = response.length() - 1;
        while (left<right) {
            if (response.charAt(left) != response.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        }
    }



















