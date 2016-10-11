package com.iwooto.utils;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] t = {0,4,3,0};
		twoSum(t,0);
	}
	public static int[] twoSum(int[] nums, int target) {
	        if(nums.length < 2){
	            return null;
	        }
	        int[] temp = new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            temp[i] =  target - nums[i];
	            for(int j = 0;j < i;j++){
	                if(temp[j]==nums[i]){
	                    return new int[]{j,i};
	                }
	            }
	        }
	        return null;
    }
	/**
	 * 二分法
	 * @param nums
	 * @return
	 */
	public List<Integer> countSmaller2(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<Integer>(len);
        if(0 == len){
            return list;
        }else if(1 == len){
        	list.add(0);
        	return list;
        }
        for(int i=0;i<len;i++){
        	list.add(null);
        }
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i = len - 1 ;i >= 0;i--){
        	int left = 0;
        	int right = tempList.size();
        	while(left < right){
        	    int mid = left + (right - left)/2;
        	    if(tempList.get(mid)>= nums[i]){
        	        right = mid;
        	    }else{
        	        left = mid +1;
        	    }
        	}
        	list.set(i,right);
        	tempList.add(right,nums[i]);
        }
        return list;
    }
	  public static List<Integer> countSmaller(int[] nums) {
	        int len = nums.length;
	        
	        List<Integer> list = new ArrayList<Integer>(len);
	        if(0 == len){
	            return list;
	        }else if(1 == len){
	        	list.add(0);
	        }
	        for(int i=0;i<len;i++){
	        	list.add(null);
	        }
	        for(int i = len - 1 ;i >= 0;i--){
	        	int cur = nums[i];
	        	int count = 0;
	        	for(int j = i+1;j<= len-1;j++ ){
	        		int nex = nums[j];
	        		if(cur == nex){
	        			count = count + list.get(j);
	        		}else if(cur > nex){
	        			count++;
	        		}
	        	}
	        	list.set(i,count);
	        }
	        return list;
	    }
	   public List<Integer> getNumRow(int numRow){
	        List<Integer> list = new ArrayList<Integer>();
	        if(0 == numRow){
	            return list;
	        }else if(1 == numRow){
	            list.add(1);
	            return list;
	        }else{
	            int fNumRow = numRow - 1;
	            List<Integer> tempList = getNumRow(fNumRow);
	            list.add(1);
	            for(int i = 1;i < fNumRow;i++){
	                int num = tempList.get(i-1)+ tempList.get(i);
	                list.add(num);
	            }
	            list.add(1);
	            
	            return list;
	        }
	    }
	    public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        if(0 >= numRows){
	            return list;
	        }else{
	            for(int i= 1;i<numRows;i++){
	                List<Integer> tempList = getNumRow(i);
	                list.add(tempList);
	            }
	            return list;
	        }
	    }
}
