package com.sample.test

//sample interface and its implementation with closure

interface MyInterface{
    void f1()
}

def use(MyInterface inter){
    inter.f1()
}

use( {
        println('....Test1....')
    })