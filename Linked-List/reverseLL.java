import java.util.ArrayList;
import java.util.Collections;

public class reverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(arr);
        ListNode head1 = new ListNode(arr.get(0));
        ListNode resNode = head1;
        for (int i = 1; i < arr.size(); i++) {
            resNode.next = new ListNode(arr.get(i));
            resNode = resNode.next;
        }
        return head1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        reverseLL res = new reverseLL();
        ListNode result = res.reverseList(l1);

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
