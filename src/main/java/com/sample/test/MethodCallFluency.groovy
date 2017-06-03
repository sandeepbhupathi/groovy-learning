package com.sample.test

def info(){
    println("HeHe")
}
def info2(String value){
    print("Hello $value")
}
def log(parmas){
    parmas.each({k,v ->
        println("$k----------$v")
    })
}

def log2(date,parmas){
    println(date)
    parmas.each({k,v ->
        println("$k----------$v")
    })
}


//method with single parameter
log([level:'Warning',message:'Starting'])
log(level:'Warning',message:'Starting')
log level:'Warning',message:'Starting'


//method with multi parameter
log2 (new Date(2014,04,18), [level:'Warning',message:'Starting'])



//method call without arguments need parenthesis
info()

//info

//methods call with arguments don't require braces for call
info2 'Hello'