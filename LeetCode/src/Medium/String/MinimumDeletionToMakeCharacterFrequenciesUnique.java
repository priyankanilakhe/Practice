package Medium.String;

import java.util.HashSet;

class MinimumDeletionToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<count.length;i++){
            while(count[i] > 0 && set.contains(count[i])){
                count[i]--;
                res++;
            }
            set.add(count[i]);
            
        }
        return res;
    }
}