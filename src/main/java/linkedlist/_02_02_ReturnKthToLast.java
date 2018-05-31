package linkedlist;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
class _02_02_ReturnKthToLast {

    LinkedListNode kthToLast(LinkedListNode head, int k) {
        LinkedListNode runner = head;
        LinkedListNode curr = head;
        for(int i = 0; i < k; i++) {
            if(runner == null) return null;
            runner = runner.next;
        }

        if(runner == null) return null;


        while(runner.next!= null){
            runner = runner.next;
            curr = curr.next;
        }

        return curr;
    }
}
