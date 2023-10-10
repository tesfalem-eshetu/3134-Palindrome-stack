import java.util.ArrayList;

public class Palindrome implements PalindromeInterface {
// the following method helps tell if a word is a 
//Palindrome or not.

    public boolean isPalindrome(String x){
//we created array of characters from the input String

        char[] charArray = x.toCharArray();
        ArrayList<Character> charList = new ArrayList<Character>();

//we used enhanced for loop to add every elemnt of the character array
//to our newly created arraylist. ignoring spaces and case sensetivity.
        for (char ch : charArray) {
            if (ch != ' ') {
                charList.add(Character.toLowerCase(ch));
            }
        }

// i created a stack by using the MyStack class. this will help us to 
// contain the inverse of the elements in our array list.

        MyStack<Character> a = new MyStack<>(charList.size());
    
// we use the push method combined with enhanced for loop to add elements
//our array list to out stack 
        for(Character i : charList){
            a.push(i);
        }

//the following code compares the the elements in our arraylist and 
//stack to determine if they are Palindrome or not.

        boolean similar = true;
        for (Character character : charList) {
            if (character != a.pop()) {
                similar = false;
            }
        }
        return similar;    
    }

    // public static void main(String[] args){
    //     Palindrome a = new Palindrome();
    //     System.out.println(a.isPalindrome("Dennis and Edna sinned"));
    // }
}
