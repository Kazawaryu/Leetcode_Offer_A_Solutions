class MinStack {
    node pointer;

    static class node {
        int num;
        int min;
        node next = null;

        public node(int num) {
            this.num = num;
        }
    }

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        pointer = null;
    }

    public void push(int x) {
        node node = new node(x);
        if (pointer != null)
            node.min = Math.min(x, pointer.min);
        else node.min = x;
        node.next = pointer;
        pointer = node;
    }

    public void pop() {
        if (pointer != null)
            pointer = pointer.next;
    }

    public int top() {
        return pointer.num;
    }

    public int min() {
        return pointer.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */