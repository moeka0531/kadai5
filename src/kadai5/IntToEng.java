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
    	int units = n % 10;
    	int ten = n / 10;
    	String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String[] number1 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    	String[] number2 = {"null","null","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    	if(ten==0)s=number[n];
    	else if(ten==1) s=number1[n-10];
    	else{
    		if(units==0)s=number2[ten];
    		else s=number2[ten] +" "+number[units];
    	}
    	return s;
    }
}
