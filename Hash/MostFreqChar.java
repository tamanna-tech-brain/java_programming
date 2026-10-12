package Hash;

import java.util.HashMap;

public class MostFreqChar {
    public static void main(String[] args) {
        String s = "success";
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            int freq = map.get(ch);
            map.put(ch, freq+1);
        }
        else map.put(ch,1);
       }
       int maxfreq = 1;
       char ans = 'z';
       for(char ch : map.keySet()){
        int freq = map.get(ch);
        if(freq>maxfreq) maxfreq = freq;
        if (freq==maxfreq && ch<=ans){
            ans = ch;
       }
    }
    System.out.println(ans);
    }
}
