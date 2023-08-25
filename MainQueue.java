public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Test Case 1: Pop saat queue kosong
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Test Case 1: " + e.getMessage());
        }

        // Test Case 2: Push beberapa angka
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Test Case 2:");
        System.out.println("Isi queue:");
        queue.printQueue();

        // Test Case 3: Pop angka
        int poppedValue = queue.dequeue();
        System.out.println("\nTest Case 3:");
        System.out.println("Angka yang di-pop: " + poppedValue);
        System.out.println("Isi queue:");
        queue.printQueue();

        // Test Case 4: Menukar dua angka (swap)
        queue.swap();
        System.out.println("\nTest Case 4:");
        System.out.println("Isi queue setelah swap:");
        queue.printQueue();
    }
}

