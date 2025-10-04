package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionSortedArray {


    public static int[] unionSortedArray(int nums1[], int[] nums2) {
    List<Integer> unionList = new ArrayList<>();
    int i = 0, j = 0;
    int n = nums1.length, m = nums2.length;

    while (i < n && j < m) {
        if (nums1[i] < nums2[j]) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                unionList.add(nums1[i]);
            }
            i++;
        } else if (nums1[i] > nums2[j]) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                unionList.add(nums2[j]);
            }
            j++;
        } else {
            // Both are equal, add one and skip duplicates
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                unionList.add(nums1[i]);
            }
            i++;
            j++;
        }
    }
    // Add remaining elements from nums1
    while (i < n) {
        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
            unionList.add(nums1[i]);
        }
        i++;
    }
    // Add remaining elements from nums2
    while (j < m) {
        if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
            unionList.add(nums2[j]);
        }
        j++;
    }
    // Convert to array
    int[] Union = new int[unionList.size()];
    for (int k = 0; k < unionList.size(); k++) {
        Union[k] = unionList.get(k);
    }
    return Union;
}

    public static void main(String[] args){

        int nums1[] = {1, 2, 3, 4, 5};
        int nums2[] = {1, 2, 7};

        int result[] = unionSortedArray(nums1,nums2);

        System.out.print(Arrays.toString(result));
    }
    
}
