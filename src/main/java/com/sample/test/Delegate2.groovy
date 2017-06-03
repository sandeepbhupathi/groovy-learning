package com.sample.test

/**
 * Created by sande on 5/24/2017.
 */

class Worker {
    def work(){
        println("I'm working..")
    }
}

class Manager {
    @groovy.lang.Delegate Worker work = new Worker();
}


def manager = new Manager();

manager.work()