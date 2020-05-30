    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            Arrays.sort(points, Comparator.comparingLong(o -> ((long) o[0] * (long) o[0] + (long) o[1] * (long) o[1])));
            int[][] ret = new int[K][];
            for (int i=0;i<K;i++)ret[i] = new int[]{points[i][0],points[i][1]};
            return ret;
        }
    }
