﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021063 彭明捷
 */
import java.util.Scanner;
public class ex04 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
        System.out.print("輸入正整數:");
        int n = scn.nextInt();
      for(int x=1 ; x<=n;x++)
     {for(int y=1; y<=n;y++)
      {System.out.print("*");}
         System.out.println();}


	}

}