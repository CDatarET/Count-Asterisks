class Solution {
    public int countAsterisks(String s) {
        boolean open = false;
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                if(open) open = false;
                else open = true;
            }
            else{
                if(open) continue;
                if(s.charAt(i) == '*') a++;
            }
        }

        return(a);
    }
}
