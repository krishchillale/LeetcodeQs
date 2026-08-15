import java.util.*;
public class Q2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();
        int same=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                first.add(nums[i]);
            }
            else if(nums[i]==pivot){
                same++;
            }
            else{
                sec.add(nums[i]);
            }
        }
        int i=0;
        while(i<first.size()){
            nums[i]= first.get(i++);
        }
        while(same!=0){
            nums[i++]=pivot;
            same--;
        }
        int j=0;
        while(j< sec.size()){
            nums[i++]= sec.get(j++);
        }
        return nums;
    }
}
