public class MainStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Test case 1:"); 
        stack.pop(); // Stack kosong, tidak dapat pop.
        // stack.printStack();

        System.out.println("\nTest case 2:");
        stack.push(50);
        stack.push(100);
        stack.push(150);
        stack.printStack();

        System.out.println("\nTest case 3:");
        while (!stack.isEmpty()) {
            stack.printStack();
            stack.pop();
        }
        stack.printStack();

        System.out.println("\nTest case 4:");
        stack.push(250);
        stack.push(200);
        stack.printStack();
        System.out.println("Angka di indeks 1 dan 2 telah ditukar.");
        stack.swapElements(1, 2);
        stack.printStack();
    }
}
