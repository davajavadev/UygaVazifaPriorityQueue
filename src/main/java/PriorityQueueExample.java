import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            priorityQueue.offer(random.nextInt(1000));
        }
        System.out.println("PriorityQueue : " + priorityQueue);
        int lenght = priorityQueue.size();
        System.out.println("Size PriorityQueue " + lenght);
        double sum = 0;
        for(Integer num : priorityQueue){
            sum+= num ;
        }
        double average = sum/lenght;
        System.out.println("Среднее значение чисел " + average);
    }
}
