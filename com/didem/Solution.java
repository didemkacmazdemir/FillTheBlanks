package com.didem;


public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int result = findSumOfWater(10, arr);
        System.out.println(result);

    }

    public static int findSumOfWater(int length, int arr[]){
        int temp = arr[length-1];
        int sumOfWater = 0;
        for(int i = length - 1; i >= 0; --i){
            if(temp >= arr[i]){
                sumOfWater += (temp - arr[i]);
            }else{
                temp= arr[i];
            }
        }
        return sumOfWater;
    }

}

