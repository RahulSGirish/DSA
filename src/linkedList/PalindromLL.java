package src.linkedList;

import java.util.ArrayList;

public class PalindromLL {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            ls.add(temp.val);
            temp = temp.next;
        }
        int first = 0;
        int last = ls.size() - 1;
        while (first <= last) {
            if (ls.get(first) != ls.get(last))
                return false;
            else {
                first++;
                last--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // ListNode l1 = new ListNode(0, new ListNode(1,
        // new ListNode(0, new ListNode(2, new ListNode(0, new ListNode(3, new
        // ListNode(3, new ListNode(0))))))));

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2)));
        PalindromLL solution = new PalindromLL();
        boolean result = solution.isPalindrome(l1);
        System.out.println(result);
    }
}
