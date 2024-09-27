package chapter3.codes.likeatrayofcups;

public class AnArrayIsLikeATrayOfCups {
  int[] nums;
  public AnArrayIsLikeATrayOfCups() {
    nums = new int[7];
    nums[0] = 6;
    nums[1] = 19;
    nums[2] = 44;
    nums[3] = 42;
    nums[4] = 10;
    nums[5] = 20;
    nums[6] = 1;
  }
  public void printElements() {
    for (int i = 0; i < nums.length; i++) {
     System.out.println("Element " + (i+1) + ": " + nums[i]);
    }
  }
}
