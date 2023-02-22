public class test {

    public static void main(String[] args) {
         CQueue obj = new CQueue();
         obj.deleteHead();
         obj.appendTail(12);
         obj.deleteHead();
         obj.appendTail(10);
         obj.appendTail(9);
         obj.deleteHead();
         obj.deleteHead();
         obj.deleteHead();
         obj.appendTail(20);
         obj.deleteHead();
         obj.appendTail(1);
         obj.appendTail(8);
         obj.appendTail(20);
         obj.appendTail(1);
         obj.appendTail(11);
         obj.appendTail(2);
         obj.deleteHead();
         obj.deleteHead();
         obj.deleteHead();
         obj.deleteHead();
    }
    /*
    ["CQueue","deleteHead","appendTail","deleteHead","appendTail","appendTail","deleteHead",
    "deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail",
    "appendTail","appendTail","appendTail","deleteHead","deleteHead","deleteHead","deleteHead"]
            [[],[],[12],[],[10],[9],[],[],[],[20],[],[1],[8],[20],[1],[11],[2],[],[],[],[]]*/
}
