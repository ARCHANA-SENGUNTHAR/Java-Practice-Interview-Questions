package src;
public class ProdExceptSelf {
    public static int[] productExceptSelf(int [] nums){
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        int [] nums = new int[n];
        System.out.print("\nEnter array elements: ");
        for(int i=0;i<n;i++){
            nums[i] = s.nextInt();
        }
        int [] result = productExceptSelf(nums);
        System.out.print("Product Except self is: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        s.close();
    }
}