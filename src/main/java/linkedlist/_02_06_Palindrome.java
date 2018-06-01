package linkedlist;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 */
class _02_06_Palindrome {

    boolean isPalindrome(LinkedListNode head) {
        if(head == null) return true;
        LinkedListNode turtle = head;
        LinkedListNode runner = head;
        while(runner!= null && runner.next != null) {
            runner = runner.next.next;
            turtle = turtle.next;
        }
        if(runner == turtle) return true;
        if(runner == null){
            runner = head;
            turtle = turtle.next;
        } else {
            turtle = turtle.next.next;
            runner = head;
        }
        while(turtle != null){
            if(runner.val != turtle.val) return false;
            turtle = turtle.next;
            runner = runner.next;
        }
        return true;
    }


}
