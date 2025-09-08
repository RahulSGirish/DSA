package src.linkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int var1) {
        this.val = var1;
    }

    ListNode(int var1, ListNode var2) {
        this.val = var1;
        this.next = var2;
    }
}
