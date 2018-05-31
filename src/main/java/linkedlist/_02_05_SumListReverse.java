package linkedlist;

/**
 * Sum Lists: You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * <p>
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output:2 -> 1 -> 9.That is,912.
 */
class _02_05_SumListReverse {
    LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        if(l1 == null && l2 == null) return null;
        int carry = 0;
        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode tail = dummy;
        while (l1 != null || l2 != null || carry > 0){
            int sum = carry;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null ) {
                sum += l2.val;
                l2 = l2.next;
            }
            tail.next = new LinkedListNode(sum%10);
            tail = tail.next;
            carry = sum/10;
        }
        return dummy.next;
    }
}
