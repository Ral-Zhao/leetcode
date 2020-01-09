package subsets78;


import java.util.List;

public class Test {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = new int[]{0};
        List<List<Integer>> result = s.subsets(arr);
        for(List<Integer> list : result){
            if(list.size() == 0){
                System.out.println(",");
                continue;
            }
            for (int num : list)
            {
                System.out.print(num+",");
            }
            System.out.println();
        }
    }
}
