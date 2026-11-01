class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        Arrays.sort(skill);
        int j=skill.length-1;
        int i=0;
        int ta=skill[i]+skill[j];
        while(i<j){
            if(skill[i]+skill[j]!=ta)return -1;
            ans+=(long)skill[i]*skill[j];
            i++;
            j--;
        }
        return ans;
    }
}