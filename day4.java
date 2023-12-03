class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
     int len=fb.length;
     int c=0;
     if(len==1 && fb[0]==0)
     return true;

     if(fb[0]==0 && fb[1]==0){
         fb[0]=1;
         c++;
     }
     for(int i=0;i<len;i++){
         if(i+1<len && fb[i]==0 && fb[i+1]==0 && fb[i-1]==0){
             fb[i]=1;
             c++;
         }
     }
     if(len-2>0 && fb[len-2]==0 && fb[len-1]==0){
         fb[len-1]=1;
         c++;
     }
     if(c>=n)
     return true;

     else
     return false ;
    }
}