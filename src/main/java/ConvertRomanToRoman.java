//Basic Roman Numerals
//        Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals. The numerals being used are: I for 1, V for 5, X for 10, L for 50, C for 100, D for 500 and M for 1000. In Roman numerals, to create a number like 11 you simply add a 1 after the 10, so you get XI. But to create a number like 19, you use the subtraction notation which is to add an I before an X or V (or add an X before an L or C). So 19 in Roman numerals is XIX.
//
//        The goal of your program is to return the decimal equivalent of the Roman numeral given. For example: if str is "XXIV" your program should return 24
//        Examples
//        Input: "IV"
//        Output: 4
//        Input: "XLVI"
//        Output: 46



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertRomanToRoman {
    public static int BasicRomanNumerals(String str) {
        //initilizing return;
        //using hashmap to insert kay=string value=integer
        //if current value of numeral is grester or equals to next value of numeral,then add this value to running total
        // else subtract then add this value to running number.


        if(str == null || str.length() == 0){
            return 0;
        }
        Map<Character ,Integer> map =new HashMap<Character ,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;

        for(int i=0;i<str.length()-1;i++){
            if(map.get(str.charAt(i)) >= map.get(str.charAt(i+1))){
                result = result + map.get(str.charAt(i));
            }
            else{
                result = result - map.get(str.charAt(i));
            }
        }
        result = result + map.get(str.charAt(str.length()-1));
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BasicRomanNumerals(s.nextLine()));
    }

}