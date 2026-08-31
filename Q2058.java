public class Q2058 {
    public class ListNode {
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

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        ListNode prev = null, curr = head;
        int ccount = 0, count = 0;
        int first = -1, last = -1;
        while (curr.next != null) {
            count++;
            if (prev != null && ((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val))) {
                ccount++;
                if (first == -1) {
                    first = count;
                } else if (last != -1) {
                    result[0] = Math.min(result[0], count - last);
                }
                last = count;
            }
            prev = curr;
            curr = curr.next;
        }
        result[1] = last - first;
        if (ccount < 2) {
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }
}
