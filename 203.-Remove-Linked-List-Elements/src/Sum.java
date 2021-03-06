/**
 * 描述:递归求和
 */
public class Sum {
    public static int sum(int[] arr){
        return sum(arr,0);
    }

    // 计算arr[l...n)这个区间内所有数字的和
    private static int sum(int[] arr,int l){
        if(l == arr.length){
            return 0;
        }else {
            return arr[l] + sum(arr,l+1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};

        System.out.println(sum(nums));
    }
}
