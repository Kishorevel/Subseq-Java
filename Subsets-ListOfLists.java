import java.util.*;
public class SubsetRet {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subSets(nums);
        System.out.println(ans);
    }
    static List<List<Integer>> subSets(int[] ar){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : ar){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
// O/P : [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
