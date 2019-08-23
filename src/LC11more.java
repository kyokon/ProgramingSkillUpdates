public class LC11more {
  public int maxArea(int[] height) {

    int maxs = 0;

    if(height.length == 2){
      maxs=(height[1]>=height[0])?height[0]:height[1];
    }

    for (int i = height.length-1; i >= 1; i--) {
      for (int j = i; j >= 0; j--) {
        int wall = (height[i]>=height[j])?height[j]:height[i];
        int floor = Math.abs(i-j);
        int maxh = wall * floor;
        maxs = (maxh>=maxs)?maxh:maxs;
        System.out.println("wall: "+wall+" floor: "+floor+" max:"+maxs);
      }
    }


    return maxs;
  }
}
