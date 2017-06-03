package com.sample.test

import groovy.transform.Immutable
//Sample for immutable annotation

@Immutable
class Author {
    String firstName
    String lastName
}
@Immutable
class Book{
    String title
    Author author
    int pages
    Date publicationDate
    List<String> area
}

def book1 = new Book('hehehe hahaha',new Author('Sandeep','Bhupathi'),
        90,Date.parse('MM/dd/yyyy','05/28/2017'),['behavior','Self-Improvement'])

println book1
println book1.author