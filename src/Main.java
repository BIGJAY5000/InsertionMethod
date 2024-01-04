public class Main {
    public static void main(String[] args) {
        int [] vals = {1 ,2 ,3 ,4 , 5};
        shiftRight(vals);
        for (int i = 0; i < vals.length; i ++) {
            System.out.print(vals[i] + " ");
        }
    }
    public static int [] insert(int [] arr, int element, int index){
        int [] nums = arr;
        for (int i = nums.length - 1;i > index; i --) {
            nums[i] = nums[i-1];
        }
        nums[index] = element;
        return nums;
    }

    public static int [] shiftRight(int [] nums){
        int temp = nums[nums.length -1];
        for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
        }
        nums[0] = temp;
        return nums;
    }
}