package src.linkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int total = x + y + carry;
            carry = total / 10;

            curr.next = new ListNode(total % 10);
            curr = curr.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        printList(result); // Expected: 7 -> 0 -> 8
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
