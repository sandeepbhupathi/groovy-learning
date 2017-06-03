package com.sample.test


//delegates with method chaining
def greet = { name -> println "${toUpperCase()} $name" }

greet.delegate = "hello"
greet('Sandeep')

//metaClass with chaining
def bldr = new StringBuilder("how r u")
bldr.metaClass.toUpperCase = {
    ->delegate.toString().toUpperCase()}
greet.delegate = bldr
greet('Sandeep')


//chaining
def closure = { -> }
closure.delegate = 'hehehe'

greet.delegate = closure
greet('Sandeep')
