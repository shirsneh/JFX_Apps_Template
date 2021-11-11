package org.example;

import java.util.Stack;

class HexCalc {
    public String hexCalc (String str){
        int result = 0;
        int countExp = 0;
        int nextNum = 0;
        str = str.replaceAll("\\s+", "");
        char[] chArr = str.toCharArray();
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();
        for(int i=0;i<chArr.length;i++) {
            if ((chArr[i] >= '0' && chArr[i] <= '9')||(chArr[i]>='A'&&chArr[i]<='F')) {
                StringBuffer currNum = new StringBuffer();
                while (i < chArr.length && ((chArr[i] >= '0' && chArr[i] <= '9') || (chArr[i] >= 'A' && chArr[i] <= 'F'))){
                    currNum.append(chArr[i++]);
                }
                if (countExp == 2)
                    nextNum = Integer.parseInt(currNum.toString().toLowerCase(),16) * (-1);
                else
                    nextNum = Integer.parseInt(currNum.toString().toLowerCase(),16);

                values.push(nextNum);
                countExp = 0;
            }
            if (i<chArr.length && (chArr[i] == '+' || chArr[i] == '-' || chArr[i] == '*' || chArr[i] == '/')) {
                if (chArr[i] == '-' && (i == 0 || countExp == 1)) {
                    countExp = 2;
                } else {
                    while (!ops.empty() && !(chArr[i] == '*' || chArr[i] == '/') && (ops.peek() == '+' || ops.peek() == '-'))
                        values.push(calc(ops.pop(), values.pop(), values.pop()));

                    ops.push(chArr[i]);
                    countExp = 1;
                }
            }
        }
        while (!ops.empty()) {
            values.push(calc(ops.pop(), values.pop(), values.pop()));
        }
        result = values.pop();
        return String.valueOf(result);
    }

    public static int calc(char op, int y, int x) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
        }
        return 0;
    }
}



