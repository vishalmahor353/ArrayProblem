//  a = {1,2,3,4,5,6}; b = {7,8,9,10,11,12}; output = {1,6,12,7,2,5,11,8,3,4,10,9} in one loop

package LiveProject;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6};
        int[] b = {7,8,9,10,11,12};
        // output = {1,6,12,7,2,5,11,8,3,4,10,9}
        int[] c = new int[a.length + b.length];
        int index = 0;

        for(int i = 0; i<Math.min(a.length, b.length)/2;i++){
             c[index++] = a[i];
             c[index++] = a[a.length - i - 1];
             c[index++] = b[b.length - i - 1];
             c[index++] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}