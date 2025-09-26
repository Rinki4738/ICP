package assignmentt;

public class arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findMinArrowShots(int[][] points) {
	        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
	        int val=points[0][1];
	        int cnt=1;
	        for(int i=1;i<points.length;i++){
	            if(points[i][0]<=val){
	                continue;
	            }
	            else{
	                cnt++;
	                val=points[i][1];
	            }
	        }
	        return cnt;
	        
	    }

}
