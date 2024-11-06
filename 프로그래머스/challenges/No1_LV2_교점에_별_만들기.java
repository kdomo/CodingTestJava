import java.util.Arrays;
import java.util.HashSet;

public class No1_LV2_교점에_별_만들기 {
    public static void main(String[] args) {
        int[][] line = new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        System.out.println(Arrays.toString(solution(line)));
        line = new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        System.out.println(Arrays.toString(solution(line)));
        line = new int[][]{{1, -1, 0}, {2, -1, 0}};
        System.out.println(Arrays.toString(solution(line)));
        line = new int[][]{{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        System.out.println(Arrays.toString(solution(line)));
    }

    static long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
    static long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;

    private static String[] solution(int[][] line) {
        String [] answer = {};
        long x, y;
        HashSet<Point> set = new HashSet<>();

        //x= (bf-ed)/(ad-bc)
        //y= (ec-af)/(ad-bc)
        for (int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long adbc = a*d-b*c;
                if (adbc == 0) continue;

                long bfed = b*f-e*d;
                if (bfed % adbc != 0) continue;

                long ecaf= e*c-a*f;
                if(ecaf%adbc!=0) continue;

                x= bfed/adbc;
                y= ecaf/adbc;
                set.add(new Point(x, y));

                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
            }
        }

        long height= maxY - minY +1;
        long width= maxX - minX +1;
        answer= new String[(int)height];
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<width; i++){
            sb.append(".");
        }

        Arrays.fill(answer, sb.toString());

        long nx, ny;
        for(Point p: set){
            ny= maxY -p.y;
            nx= p.x- minX;
            answer[(int)ny]= answer[(int)ny].substring(0, (int)nx)+"*"
                    +answer[(int)ny].substring((int)nx+1);
        }

        return answer;
    }

    public static class Point{
        long x;
        long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
