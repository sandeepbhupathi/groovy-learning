package com.sample.test

import groovy.transform.InheritConstructors
//inheritConstructor will make super class constructors available for its child class

class Vehical {
    Vehical(long id){}
    Vehical(long id,Date date){}
}

@InheritConstructors
class Car extends Vehical{
    int fuelLevel
  Car(long id,Date date,int thefuelLevel){
      super(id,date)
      fuelLevel = thefuelLevel
  }

}

def car = new Car(1)
def car1 = new Car(1,new Date());
def car2 = new Car(1,new Date(),10);
println 'OK'