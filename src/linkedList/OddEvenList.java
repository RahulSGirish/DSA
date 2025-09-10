package src.linkedList;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0, new ListNode(1,
                new ListNode(0, new ListNode(2, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(0))))))));

        // ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2)));
        OddEvenList solution = new OddEvenList();
        ListNode result = solution.oddEvenList(l1);
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
