package programmers.hash;

import java.util.*;
public class Phonekemon {

    //programmers level 1

    public static void main(String[] args) {
        Phonekemon phonekemon = new Phonekemon();
        int result = phonekemon.solution(new int[]{3, 1, 2, 3});
        System.out.println(result);
    }

    public int solution(int[] nums){
        int answer = 0;
        HashSet<Integer> type = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            type.add(nums[i]);
        }

        if(nums.length/2 <= type.size()){
            answer = nums.length/2;
        }else{
            answer = type.size();
        }

        return answer;
    }

}
