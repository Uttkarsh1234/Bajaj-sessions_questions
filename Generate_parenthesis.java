class Solution {
    public void func(int len,String s , int open,int close,List<String> li){
        if(s.length() == 2*len){
            li.add(s);
            return ;
        }

        if(open<len){
            func(len,s+'(',open+1,close,li);
        }
        if(close<open){
            func(len,s+')',open,close+1,li);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        func(n,"",0,0,li);
        return li;
    }
}
