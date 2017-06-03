package com.sample.test

// interface with multiple unimplementetd methods sample
interface MyInterfaceNew{
    void f2(int myValue)
    void f2(double myValue)
    void f2(int myValue,double myValue2)
    void f3(double myDouble)
}

def use(MyInterfaceNew inter){
    inter.f2(2)
    inter.f2(2.3)
    inter.f2(2,4.4)
    inter.f3(2.3)
}

void printInfo(int i){
    println ".......Received....$i"
}

void printInfo(double d){
    println ".......Received Double....$d"
}

void printInfo(int i,double d){
    println ".......Received....$i and Double $d.."
}

use([f2: {Object[] value -> printInfo(*value)
}, f3: {double valueDouble -> println(".....Test2......$valueDouble") } ]as MyInterfaceNew)
