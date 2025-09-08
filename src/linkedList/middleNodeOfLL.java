package src.linkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class middleNodeOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int mid = size / 2;
        temp = head;
        for (int i = 1; i <= mid; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        middleNodeOfLL res = new middleNodeOfLL();
        ListNode result = res.middleNode(l1);

        printList(result);
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}
