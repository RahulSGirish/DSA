package src.linkedList;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0, new ListNode(1,
                new ListNode(0, new ListNode(2, new ListNode(0, new ListNode(3, new ListNode(3, new ListNode(0))))))));

        HasCycle solution = new HasCycle();
        boolean result = solution.hasCycle(l1);
        System.out.println(result);
    }
}
