package com.sample.test


def info(name,gender,age){
    println """First Name: ${name.firstName} Last Name: ${name.lastName} 
               Gender: $gender Age: $age"""
}

info(firstName: 'Sandeep', lastName: 'Bhupathi','M',31)