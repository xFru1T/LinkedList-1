import java.util.*;
class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Print count numbers: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        while (count > 0) {
            System.out.print("Print " + count + " number(s): ");
            int num = scanner.nextInt();
            count -= 1;
            scanner.nextLine();
            list.add(num);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                list.remove(i);
            }
        }
        System.out.println("Deleted each 2nd element: " + list);
    }
}