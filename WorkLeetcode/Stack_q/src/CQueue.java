import java.util.Stack;

class CQueue {
    Stack<Integer> S1;
    Stack<Integer> S2;

    public CQueue() {
        S1 = new Stack<>();
        S2 = new Stack<>();
    }

    public void appendTail(int value) {
        if (S2.empty()) {
            S1.push(value);
        } else if (S1.empty()){
            while (!S2.empty()){
                S1.push(S2.pop());
            }
            S1.push(value);
        }
    }

    public int deleteHead() {
        if (S2.empty() && !S1.empty()) {
            while (!S1.empty()) {
                S2.push(S1.pop());
            }
            return S2.pop();
        } else if (!S2.empty() && S1.empty()) {
            return S2.pop();
        } else {
            return -1;
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */