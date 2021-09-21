package com.example.myapplication;

public class NativeLibrary {

    MainActivity mainActivity;

    static {
        System.loadLibrary("native-lib");
    }

    // using dependency injection(constructor inj.)
    public NativeLibrary(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public NativeLibrary() {

    }

    public native int calculateToJni(int val1, int val2);
    
}
