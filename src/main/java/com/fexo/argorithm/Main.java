package com.fexo.argorithm;

import java.util.Scanner;
import java.lang.Integer;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        Integer[] arrays=new Integer[1001];
        for(int i=0;i<count;i++){
            int ii=scan.nextInt();
            arrays[ii]=ii;
        }
        for(Integer i:arrays){
            if(i!=null){
                System.out.println(i);
            }
        }

    }
}