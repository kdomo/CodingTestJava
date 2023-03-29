class Solution {
    public String[] split;
    public int count = 0, answer = 0;
    public boolean isCheck;
    public int solution(String word) {
        isCheck = false;
        split = "AEIOU".split("");
        dfs("", word);
        return answer;
    }
    
    public void dfs(String cur, String word) {
        if (isCheck) return;
    
        if (cur.equals(word)) {
            answer = count;
            return;
        }
        
        if (cur.length() == 5) return;
        
        for(int i = 0; i < 5; i++) {
            count++;
            dfs(cur + split[i], word);
        }
    }
}