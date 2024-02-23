import java.util.Scanner;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNumber sn=new SingleNumber();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the number of elements into the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int x=sn.singleNumber(nums);
        System.out.println("The element which is not repeated is:"+x);
    }
}
