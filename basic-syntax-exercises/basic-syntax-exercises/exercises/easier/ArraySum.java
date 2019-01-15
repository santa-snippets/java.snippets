package exercises.easier;

public class ArraySum {
  public static void main(String[] args) {
    double[] numbers = { 1.1, 2.2, 3.3 };
    System.out.println("Sum of {1.1,2.2,3.3}=" + arraySum1(numbers));
    System.out.println("Average of {1.1,2.2,3.3}=" + arrayAverage(numbers));
    double[] moreNumbers = { 1.1, 2.2, 3.3, -1, -2, 4 };
    System.out.println("Number positive=" + numPositive(moreNumbers));
    System.out.println("Number from 1.1 to 3.2=" + numInRange(moreNumbers, 1.0, 3.2));
  }
  
  public static double arraySum1(double[] nums) {
    double sum = 0;
    for(double num: nums) {
      sum = sum + num; // Or sum += num
    }
    return(sum);
  }
  
  public static double arrayAverage(double[] nums) {
    return(arraySum1(nums)/nums.length);
  }
  
  public static int numPositive(double[] nums) {
    int count = 0;
    for(double num: nums) {
      if (num >=0) {
        count = count + 1; // Or count++
      }
    }
    return(count);
  }
  
  public static int numInRange(double[] nums, double lowerBound, double upperBound) {
    int count = 0;
    for(double num: nums) {
      if ((num >= lowerBound) && (num <= upperBound)) {
        count = count + 1; // Or count++
      }
    }
    return(count);
  }
  
  public static double arraySum2(double[] nums) {
    double sum = 0;
    for(int i=0; i<nums.length; i++) {
      sum = sum + nums[i]; 
    }
    return(sum);
  }
  
  public static double arraySum3(double[] nums) {
    double sum = 0;
    int i=0;
    while(i<nums.length) {
      sum = sum + nums[i]; 
      i++; // Or i = i + 1, or i += 1
    }
    return(sum);
  }
  
  // Unlike the other three versions, this one fails for a 0-length array
  
  public static double arraySum4(double[] nums) {
    double sum = 0;
    int i=0;
    do {
      sum = sum + nums[i]; 
      i++; 
    } while(i<nums.length);
    return(sum);
  }
}
