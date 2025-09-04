import java.util.ArrayList;

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

public class convertBinaryNumberInLLToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0; i < arr.size(); i++) {
            result += (arr.get(i) * (Math.pow(2, (arr.size() - i - 1))));
        }

        return result;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(0, new ListNode(1)));

        convertBinaryNumberInLLToInteger res = new convertBinaryNumberInLLToInteger();
        int result = res.getDecimalValue(l1);

        System.out.println(result);
    }
}
