import java.util.Scanner;

public class Scan {
    public static ListNode Scan() throws  Exception{
        ListNode head = null , tail = null;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != -1){
            i = scanner.nextInt();
            int data = i;
            if (i == -1){
                return head;
            }
            ListNode temp = new ListNode(data);
            if (head == null){
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
        }
        return head;
    }
}
