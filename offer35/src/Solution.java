/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        Node temp = head;
        if (head == null) return null;
        while (temp.next != null) {
            Node copy = new Node(temp.val);
            Node next = temp.next;
            temp.next = copy;
            copy.next = next;
            temp = next;
        }
        temp.next = new Node(temp.val);

        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        Node res = head.next;
        temp = head;

        while (temp.next != null) {
            Node tempNext = temp.next;
            temp.next = temp.next.next;
            temp = tempNext;
        }
        return res;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;

        a.random = null;
        b.random = a;
        c.random = a;
        d.random = b;

        Node test = copyRandomList(a);

        while (test != null) {
            System.out.println(test.val);
            if (test.random != null)
                System.out.println("random " + test.random.val);
            test = test.next;
        }

        test = a;
        while (test != null) {
            System.out.println(test.val);
            if (test.random != null)
                System.out.println("random " + test.random.val);
            test = test.next;
        }


    }

//    public Node copyRandomList(Node head) {
//
//        Node newTemp = new Node(head.val);
//        Node result = newTemp;
//        while (head.next != null) {
//
//            Node originTemp = head;
//            Node thisTemp = newTemp;
//
//            if (head.val <= 10000) {
//                while (originTemp.random != null) {
//                    if (originTemp.random.val <= 10000) {
//
//                        if (originTemp.random == originTemp) {
//                            thisTemp.random = thisTemp;
//                            originTemp.val += 30000;
//                            originTemp.random = thisTemp;
//                            break;
//                        }
//
//                        Node newRandom = new Node(originTemp.random.val);
//                        thisTemp.random = newRandom;
//                        originTemp.val += 30000;
//
//                        Node originNextRandom = originTemp.random;
//                        originTemp.random = thisTemp;
//                        originTemp = originNextRandom;
//                        thisTemp = newRandom;
//
//                    } else {
//                        thisTemp.random = originTemp.random.random;
//                        break;
//                    }
//                }
//
//                if (originTemp.random == null) {
//                    originTemp.random = thisTemp;
//                    originTemp.val += 30000;
//                }
//            }
//
//            if (head.next.val <= 10000) {
//                newTemp.next = new Node(head.next.val);
//                head.val += 30000;
//                head.random = newTemp;
//
//            } else {
//                newTemp.next = head.next.random;
//            }
//            newTemp = newTemp.next;
//            head = head.next;
//
//
//        }
//
//
//        return result;
//    }
}