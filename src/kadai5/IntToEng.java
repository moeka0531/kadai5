package kadai5;

import java.util.Scanner;

public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String s = null;
    	String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	/*if(n==1) s=one(n);
    	if(n==2) s=two(n);
    	if(n==3) s=three(n);
    	if(n==4) s=four(n);
    	if(n==5) s=five(n);
    	if(n==6) s=six(n);
    	if(n==7) s=seven(n);
    	if(n==8) s=eight(n);
    	if(n==9) s=nine(n);
    	if(n==0) s=zero(n);*/
    	
    	return s;
    }
    /*private static String one(int n){
    	return "one";
    }
    private static String two(int n){
    	return "two";
    }
    private static String three(int n){
    	return "three";
    }
    private static String four(int n){
    	return "four";
    }
    private static String five(int n){
    	return "five";
    }
    private static String six(int n){
    	return "six";
    }
    private static String seven(int n){
    	return "seven";
    }
    private static String eight(int n){
    	return "eight";
    }
    private static String nine(int n){
    	return "nine";
    }
    private static String zero(int n){
    	return "zero";
    }*/
}
