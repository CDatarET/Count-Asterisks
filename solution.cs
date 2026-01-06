public class Solution {
    public int CountAsterisks(string s) {
        bool open = false;
        int a = 0;
        for(int i = 0; i < s.Length; i++){
            if(s[i] == '|'){
                if(open) open = false;
                else open = true;
            }
            else{
                if(open) continue;
                if(s[i] == '*') a++;
            }
        }

        return(a);
    }
}
