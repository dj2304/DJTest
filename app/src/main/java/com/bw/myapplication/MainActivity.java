package com.bw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] arr={3,1,7,2,6,7,4,5};

        //这是一个测试修改
//        changet(arr, 0);
    }

     public void changet(int[] arr, int left, int r){
        int v = arr[r];
        int j=left-1;
        for(int i = left; i<=r; i++){
            if(arr[i]<=v){
                swap(arr, j+1, i);
                j++;
            }
        }
        swap(arr, r, j+1);
     }

     public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     }
}
