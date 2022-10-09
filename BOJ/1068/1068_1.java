/**
* 메모리: 14312 KB, 시간: 124 ms
* 2022.10.09
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static ArrayList<Integer> nodeList = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int deleteNode = Integer.parseInt(br.readLine());
        for (String s : str.split(" ")) {
            nodeList.add(Integer.parseInt(s));
        }

        dfs(deleteNode);

        int cnt = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i) != -2 && !nodeList.contains(i)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int deleteNode) {
        nodeList.set(deleteNode, -2);
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i) == deleteNode){
                dfs(i);
            }
        }
    }
}