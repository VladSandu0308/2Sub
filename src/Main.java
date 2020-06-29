import java.util.*;

public class Main {

    public static void twoDiff(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target + nums[i])) {
                int two = target + nums[i];
                System.out.println(map.get(two) + "-" + i);
            }

            if (map.containsKey(nums[i] - target)) {
                int two = nums[i] - target;
                System.out.println(i + "-" + map.get(two));
            }

            map.put(nums[i], i);
        }

    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = myScan.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i < n; ++i) {
            arr[i] = myScan.nextInt();
        }
  
        System.out.println("Enter your given number: ");

        int m = myScan.nextInt();
        twoDiff(arr, m);

    }
}
