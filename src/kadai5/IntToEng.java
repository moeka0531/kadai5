package kadai5;

import java.util.Scanner;

public class IntToEng {
	static String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String[] number1 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] number2 = {"null","null","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
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
    	int hand = n/100;
    	
    	if(n>0){
    		s=hundred(hand,ten,units);
    	} else {
    		if(ten==0)s=number[n];
        	else if(ten==1) s=number1[n-10];
        	else{
        		if(units==0)s=number2[ten];
        		else s=number2[ten] +" "+number[units];
        	}
    	}
    	
    	/*if(ten==0)s=number[n];
    	else if(ten==1) s=number1[n-10];
    	else{
    		if(units==0)s=number2[ten];
    		else s=number2[ten] +" "+number[units];
    	}*/
    	return s;
    }
    static String hundred(int hand,int ten,int units){
    	String s = null;
    	if(ten==0&&units==0) s=number[hand]+" hundred";
    	else if(ten==0) s=number[hand]+" hundred"+number[units];
    	else if(ten==1) s=number[hand]+" hundred"+number1[units];
    	else s=number[hand]+" hundred"+number2[ten]+number[units];
    	return s;
    	
    }
    
}
