package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Dups!
 * Write code to remove duplicates from an unsorted linked list.
 */
class _02_01_RemoveDups {

    LinkedListNode removeDups(LinkedListNode head) {
        Set<Integer> integerSet = new HashSet<>();
        LinkedListNode pre = null;
        LinkedListNode next = head;
        while ( next != null) {
            if(integerSet.contains(next.val)) {
               pre.next = next.next;
            } else {
                integerSet.add(next.val);

            }
            pre = next;
            next = next.next;
        }
        return head;
    }
}
