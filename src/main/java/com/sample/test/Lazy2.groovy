package com.sample.test

// @lazy annotation will create object on demand
// using volatile will make big instance as thread safe
//if its default constructor no need eot specify "new NewBig(10000)"
// for lazy annotation

class NewBig{
    NewBig(int bigValue){
        println("Big Created $bigValue")
        Thread.sleep(1000)
    }
}

class NewUser {
    @Lazy volatile big = new NewBig(10000)
    def info(){
        big.toString()
    }
}

def user = new NewUser()
println('User Created')
Thread.start { println(user.info())}
Thread.start { println(user.info())}
Thread.sleep(2000)
println(user.info())
