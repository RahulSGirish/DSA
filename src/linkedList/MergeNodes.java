package src.linkedList;

public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;

        ListNode res = new ListNode();
        ListNode dummy = res;
        int sumTillNow = 0;
        while (temp != null) {
            if (temp.val != 0) {
                sumTillNow += temp.val;
            } else {
                if (sumTillNow != 0) {
                    dummy.next = new ListNode(sumTillNow);
                    dummy = dummy.next;
                    sumTillNow = 0;
                }
            }
            temp = temp.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0, new ListNode(1,
                new ListNode(0, new ListNode(2, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(0))))))));

        MergeNodes solution = new MergeNodes();
        ListNode result = solution.mergeNodes(l1);

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
