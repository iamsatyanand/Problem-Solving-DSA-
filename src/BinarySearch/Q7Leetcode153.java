package BinarySearch;

public class Q7Leetcode153 {
}



/**
 calculate mid

 first find of the array is sorted  i.e. no rotation
    for that we have to check that arr of low is less than arr of high
    then left most element is the smallest

 check when mid will be the answer
    when element at mid is less than element at mid - 1 valid for the case where mid - 1 >= 0
    or
    when element at mid+1 is less than element at mid valid for teh case where mid + 1 < n


 find that mid is on upper curve or lower curve
    if arr of mid is greater than arr of low then its on upper curve
    if arr of mid is lower than arr of low then its on lower curve

 if we are on upper curve
 then, smallest element is always on the right side of the mid
    so low  = mid + 1
 else its on left side i.e. we are on lower curve
    high =  mid - 1
 * **/
