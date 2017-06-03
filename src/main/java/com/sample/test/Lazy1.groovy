package com.sample.test

// @lazy annotation will create object on demand
// using volatile will make big instance as thread safe
class Big{
    Big(){
        println('Big Created')
        Thread.sleep(1000)
    }
}

class User {
    @Lazy volatile Big big
    def info(){
        big.toString()
    }
}

def user = new User()
println('User Created')
Thread.start { println(user.info())}
Thread.start { println(user.info())}
Thread.sleep(2000)
println(user.info())