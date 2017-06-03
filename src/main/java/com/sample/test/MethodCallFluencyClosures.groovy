package com.sample.test

def sample(before,value,after){
    def resule = before(value)
    after(resule*2)
}

def sample1(before,after,value){
    def resule = before(value)
    after(resule*2)
}

def sample2(value,before,after){
    def resule = before(value)
    after(resule*2)
}

sample({it*2},5,{println(it)})

//idiomatic expressions, will allow last parameter of the closure passed from outside
sample({it*2},5) {println(it)}

sample1({it*2},{println(it)},5)

sample2(5,{it*2},{println(it)})


def list = [1,2,3,4,5,6]
def result = list.inject(0,{c,e -> c+e})
println("--------$result")

def result2 = list.inject(0){c,e -> c+e}
println("--------$result2")

def result3 = list.inject 0,{c,e -> c+e}
println("--------$result3")