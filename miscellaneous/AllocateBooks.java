/* Allocate Books 
Given an array ‘arr’ of integer numbers, ‘arr[i]’ represents the number of pages in the ‘i-th’ book.
There are ‘m’ number of students, and the task is to allocate all the books to the students.
Allocate books in such a way that:
1. Each student gets at least one book.
2. Each book should be allocated to only one student.
3. Book allocation should be in a contiguous manner.
You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.
If the allocation of books is not possible, return -1.
*/

import java.util.ArrayList;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int left=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            left=Math.max(left, arr.get(i));
        }
        int right=arr.stream().mapToInt(Integer::intValue).sum();
        while(left<=right) {
            int mid=(left+right)/2;
            int std=countStudents(arr, mid, n);
            if(std>m) left=mid+1;
            else right=mid-1;
        }
        return left;
    }

    public static int countStudents(ArrayList<Integer> arr, int pages, int n) {
        int std=1;
        int pagesStudent=0;
        for(int i=0; i<n; i++) {
            if(pagesStudent+arr.get(i)<=pages) {
                pagesStudent+=arr.get(i);
            } else {
                std++;
                pagesStudent=arr.get(i);
            }
        }

        return std;
    }
}
