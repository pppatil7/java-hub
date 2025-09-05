package leet;

public class RemoveElementSolution {


    public int removeElement(int[] nums, int val) {

        int size=nums.length;
        int temp=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i;j<size;j++){
                    
                }
                size--;
            }
        }
        return size;
    }

    public static void main(String[] args) {

    }
}
