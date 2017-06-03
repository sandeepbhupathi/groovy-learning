package com.sample.test

import groovy.transform.Immutable

//@Immutable(knownImmutableClasses = [AuthorNew])

//Sample for immutable annotation with known immutable and copy with
//known immutable will make the lib class as immutable
//copy with will make the copy of object available from existing object
@Immutable(knownImmutables  = ['author'],copyWith = true)
class BookNew{
    String title
    AuthorNew author
    int pages
    Date publicationDate
    List<String> area
}

def book1 = new BookNew('hehehe hahaha',new AuthorNew('Sandeep','Bhupathi'),
        90,Date.parse('MM/dd/yyyy','05/28/2017'),['behavior','Self-Improvement'])

println book1
println book1.author

def book2 = book1.copyWith(title:'New Title')
println book2
println book2.author
