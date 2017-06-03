package com.sample.test

//using meta class ,method can be injects to the class
def msg = 'hello'
msg.metaClass.shout = { ->
    println('herr')
    delegate.toUpperCase()
}

println(msg)
println(msg.shout())