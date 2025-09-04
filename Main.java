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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = 0, val2 = 0;
        ListNode temp = l1;
        while (temp != null) {
            val1 = val1 * 10 + temp.val;
            temp = temp.next;
        }
        temp = l2;
        while (temp != null) {
            val2 = val2 * 10 + temp.val;
            temp = temp.next;
        }
        int sum = val1 + val2;
        String str = String.valueOf(sum);

        ListNode res = new ListNode();
        ListNode curr = res;
        for (int i = 0; i < str.length(); i++) {
            curr.next = new ListNode(str.charAt(i) - '0');
            curr = curr.next;
        }
        return res.next;
    }

    int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

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