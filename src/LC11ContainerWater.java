public class LC11ContainerWater {
  public int maxArea(int[] height) {
    int[][] heights_s = new int[height.length][2];
    for (int i = 0; i < height.length; i++) {
      System.out.println(height[i]);
      heights_s[i][0]=i;
      heights_s[i][1]=height[i];
    }

    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i; j < height.length; j++) {

        if(heights_s[i][1]>=heights_s[j][1]){
          int tmp = heights_s[i][0];
          heights_s[i][0] = heights_s[j][0];
          heights_s[j][0] = tmp;
          int tmp2 = heights_s[i][1];
          heights_s[i][1] = heights_s[j][1];
          heights_s[j][1] = tmp2;
        }
      }
    }

    int maxs = 0;

    if(height.length == 2){
      maxs=(height[1]>=height[0])?height[0]:height[1];
    }

    for (int i = 0; i < height.length; i++) {
      System.out.println(heights_s[i][0]+" : "+heights_s[i][1]);
    }


    for (int i = height.length-1; i >= 1; i--) {
      for (int j = i; j >= 0; j--) {
        int wall = (heights_s[i][1]>=heights_s[j][1])?heights_s[j][1]:heights_s[i][1];
        int floor = Math.abs(heights_s[i][0]-heights_s[j][0]);
        int maxh = wall * floor;
        System.out.println(maxh);
        maxs = (maxh>=maxs)?maxh:maxs;
        System.out.println("wall: "+wall+" floor: "+floor+" max:"+maxs);
      }
    }


    return maxs;
  }
}
