package proplems.LeatCode;

public class AddTwoNumbers {
    static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            boolean done = false;
//            ListNode n1 = l1;
//            ListNode n2 = l2;
//            ListNode newList = new ListNode(n1.next.val + n2.next.val);
//            while (!done) {
//                int val;
//                if (n1 == null) {
//                    if (n2 == null) done = true;
//                    else val = n2.val;
//                } else if (n2 == null) val = n1.val;
//                val = n1.val + n2.val;
//                n1 = l1.next;
//                n2 = l2.next;
//                newList = newList.next;
//                addValue(newList, val);
//            }
//            return newList;
            int num1 = turnListToNumber(l1);
            int num2 = turnListToNumber(l2);
            return turnNumToList(num1 + num2);

        }
    }

    private static int turnListToNumber(ListNode node) {
        int num = 0;
        int numToMultiplyBy = 1;
        while (node != null) {
            num = num + node.val * numToMultiplyBy;
            numToMultiplyBy = numToMultiplyBy * 10;
            node = node.next;
        }
        return num;
    }

    private static ListNode turnNumToList(int num) {
        String numRepresentation = "" + num;
        ListNode list = new ListNode();
        var pointer = list;
        char[] charArray = numRepresentation.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            int val = Integer.parseInt(String.valueOf(c));
//            pointer.val = val;
//            pointer = pointer.next;
            addValue(pointer ,val);
        }
        return list.next;
    }

    private static ListNode add(ListNode start, ListNode next) {
        start.next = next;
        return start;
    }

    private static ListNode addValue(ListNode start, int nextVal) {
        return add(start, new ListNode(nextVal));
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        addValue(list1, 4);
        addValue(list1.next, 3);
        ListNode list2 = new ListNode(5);
        addValue(list2, 6);
        addValue(list2.next, 4);
        System.out.println(Solution.addTwoNumbers(list1, list2));
    }


}
