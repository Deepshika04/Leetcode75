class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
       while(l1>0){
           l1=l1%l2;
           l2=l2-l1;
       } 
       return str1.substring(0,l2);
    }
}