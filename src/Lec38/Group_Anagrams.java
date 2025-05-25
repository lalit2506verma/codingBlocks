package Lec38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(arr));
    }

    public static String key_for_anagrams(String s){
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : freq){
            sb.append(n + " ");
        }

        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ll = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String key = key_for_anagrams(strs[i]);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        for(String key : map.keySet()){
            ll.add(map.get(key));
        }

        return ll;
    }
}
