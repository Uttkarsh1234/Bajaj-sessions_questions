import java.util.*;
class container_with_most_water {
        public int maxArea(int[] height) {
                int maxi = 0, i = 0, j = height.length - 1;
                while (i < j) {
                        // j - i : representing the length;
                        // min(height[i],height[j]) : represents the width or height in this case
                        int area = (j - i) * Math.min(height[i], height[j]);
                        maxi = Math.max(maxi, area);
                        if (height[i] < height[j]) {
                                i++;
                        } else {
                                j--;
                        }
                }
                return maxi;
        }
}
