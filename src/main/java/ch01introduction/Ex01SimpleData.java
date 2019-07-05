//package com.tij4f2014.ch01;
package ch01introduction;

/**
 * Created by callas on 9/16/2014.
 */
public class Ex01SimpleData {
    private int counter;
    private char oneChar;

    static private StringBuffer stringBuffer;

    public Ex01SimpleData() {
        setCounter(0);
        setOneChar(' ');
    }
    public Ex01SimpleData(int i, char c) {
        setCounter(i);
        setOneChar(c);
    }
    public int getCounter() {
        return counter;
    }
    protected void setCounter(int i) {
        counter = i;
    }
    public char getOneChar() {
        return oneChar;
    }
    protected void setOneChar(char c) {
        oneChar = c;
    }
    @Override
    public String toString() {
        stringBuffer = new StringBuffer();
        stringBuffer.append("counter:");
        stringBuffer.append(getCounter());
        stringBuffer.append("\tcharacter:");
        stringBuffer.append(getOneChar());
        return String.valueOf(stringBuffer);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Ex01SimpleData simpleData1 = new Ex01SimpleData();
        Ex01SimpleData simpleData2 = new Ex01SimpleData(12,'z');

        System.out.println("simpleData1=[" + simpleData1.toString() + "]\n");
        System.out.println("simpleData2=[" + simpleData2.toString() + "]\n");
    }

}
