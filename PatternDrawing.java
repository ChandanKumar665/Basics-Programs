package com.github.chandankumar665.patterns;
import java.util.Scanner;
public class PatternDrawing {
    
    public static void halfPyramid(int rows) {
        int columns=rows;
        int position;
        for(position=1;position<=rows;position++){
        for(columns=1;columns<=position;columns++){
            System.out.print("*");
        }
            System.out.println("");
    }
    }
    public static void pyramid(int rows) {
        int columns=rows;
        int position,k;
        for(position=1;position<=rows;position++){
        for(columns=rows;columns>=position;columns--){
           if(columns==position){
            break;
           }
            System.out.print(" ");
        }
       
        for(k=1;k<=2*position-1;k++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of rows");
        int rows=in.nextInt();
		halfPyramid(rows);
        pyramid(rows);
    }
}