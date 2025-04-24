 package optimalcardpick;
 import java.util.Scanner;
public class OptimalCardPick {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Number of cards!");
        int n = sc.nextInt();  // number of cards
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Numbers on cards " + (i+1)+":");
            cards[i] = sc.nextInt();
        }
        int sereja = 0;
        int dima = 0;
        int left = 0;
        int right = n - 1;
        boolean isSerejaTurn = true;
        while (left <= right) {
            int chosen;
            if (cards[left] > cards[right]) {
                chosen = cards[left];
                left++;
            } else {
                chosen = cards[right];
                right--;
            }
            if (isSerejaTurn) {
                sereja += chosen;
            } else {
                dima += chosen;
            }
            isSerejaTurn = !isSerejaTurn; // alternate turn
        }
        System.out.println("Sereja' total:"+sereja + " Dima's total: " + dima);
    }
}
     
    
 
