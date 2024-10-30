import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
        {
            printTaskTitle(1);
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

            for (Integer num : nums) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        }

        //Task 2
        {
            printTaskTitle(2);
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            Set<Integer> numsSet = new HashSet<>();

            for (Integer num : nums) {
                if (num % 2 == 0) {
                    numsSet.add(num);
                }
            }
            for (Integer i : numsSet) {
                System.out.println(i);
            }
        }

        //task 3
        {
            printTaskTitle(3);
            String text = "Напишите код, который выводит в консоль все Напишите код, который выводит в консоль ";
            text = text.toLowerCase(Locale.ROOT).replaceAll("[.|,]", "");
            System.out.println(text);
            String[] words = text.split(" ");

            Set<String> wordsSet = new HashSet<>(List.of(words));
            System.out.println(wordsSet);
        }

        //Task 4
        {
            printTaskTitle(4);
            List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
            Map<String, Integer> wordCount = new HashMap<>();
            for (String string : strings) {
                wordCount.put(string, wordCount.getOrDefault(string, 0) + 1);
            }
            for (Integer value : wordCount.values()) {
                System.out.println(value);
            }
        }

    }

    public static void printTaskTitle(int taskNumber) {
        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");
    }
}
