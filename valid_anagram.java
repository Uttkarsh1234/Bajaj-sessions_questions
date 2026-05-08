class Solution {
    public String Sorting(String str){
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public boolean isAnagram(String s, String t){
        String str1 = Sorting(s);
        String str2 = Sorting(t);
        if(str1.length()!=str2.length())return false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
