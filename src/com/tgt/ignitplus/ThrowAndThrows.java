/*Program throws user-defined exception explicitly using throw keyword
 */
package com.tgt.ignitplus;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

class ThrowAndThrows {
    static void Age(int age) throws MyException {
        if (age < 0)
            throw new MyException("Age can't be less than zero");
        else
            System.out.println("Input is valid!!");
    }

    public static void main(String[] args) {
        try {
            Age(-2);
        } catch (MyException e) {
            System.out.println("Exception:\n" + e);
        }
    }
}
/*
Output:
Exception:
com.tgt.ignitplus.MyException: Age can't be less than zero
 */