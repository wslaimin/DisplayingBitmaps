package com.lm.test;

import java.lang.reflect.Array;

/**
 * Created by 10528 on 2015/11/10.
 */
public class Test {
    public static void main(String[] args){
        String[] strings=new String[6];
        for(int i=0;i<strings.length;i++){
            strings[i]=new String(""+i);
        }
        String[] a=copyOfRange(strings,0,3);
        String temp=new String("   9    ");
        strings[0]=temp;
        temp.trim();
        print(strings);
        print(a);
    }

    private static <T> void print(T[] ts){
        System.out.print("\n");
        for(int i=0;i<ts.length;i++){
            System.out.print(" "+ts[i]);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] copyOfRange(T[] original, int start, int end) {
        final int originalLength = original.length; // For exception priority compatibility.
        if (start > end) {
            throw new IllegalArgumentException();
        }
        if (start < 0 || start > originalLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        final int resultLength = end - start;
        final int copyLength = Math.min(resultLength, originalLength - start);
        final T[] result = (T[]) Array
                .newInstance(original.getClass().getComponentType(), resultLength);
        System.arraycopy(original, start, result, 0, copyLength);
        return result;
    }
}
