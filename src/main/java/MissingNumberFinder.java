import java.util.HashSet;
import java.util.Set;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
        // Проверяю на пустой массив
        if (nums.length == 0) { //массив с 1 элементом так же является массивом без пропущенного числа
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>(); 
        
        // Нахожу минимальное и максимальное значение в массиве,
        // а также использую HashSet для быстрой проверки наличия чисел
        for (int num : nums) {
            numSet.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Ищу пропущенное число в последовательности
        for (int i = min; i <= max; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {5, 0, 1, 3, 2};
        int[] input2 = {7, 9, 10, 11, 12};

        int result1 = findMissingNumber(input1);
        int result2 = findMissingNumber(input2);

        System.out.println("Missing number: " + result1);
        System.out.println("Missing number: " + result2);
    }
}
