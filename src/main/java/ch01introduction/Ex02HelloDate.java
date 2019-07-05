//package com.tij4f2014.ch01;
package ch01introduction;

/**
 * Created by callas on 9/16/2014.
 */
public class Ex02HelloDate {
    static private StringBuffer sb;
    @Override
    public String toString() {
        sb = new StringBuffer();
        sb.append("Hello, World");
        return String.valueOf(sb);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ex02HelloDate helloDate = new Ex02HelloDate();
        System.out.println("helloData=[" + helloDate.toString() + "]\n" );

    }

}
