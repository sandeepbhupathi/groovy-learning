package com.sample.test

/**
 * Created by sande on 5/24/2017.
 * Domain Specific Languages
 */
class Mailer {
    def from = {fromEmail ->
        println("From Email")
    }

    def to(emailID){
        println("Sending To $emailID")
    }

    def sub(subject) {
        println(subject)
    }
    def body = {
        body ->
            println(body)
    }

    def static send(block) {
        Mailer mailer = new Mailer();
       /* def blockClone = block.clone()
        blockClone.delegate = mailer
        blockClone(mailer)*/
        mailer.with block
        println("Sending...")
    }
}
//delegate with domain specific languages
Mailer.send{
    from("sandeepbupathi08@gmail.com")
    to("bhupathi.sandeep@tcs.com")
    sub("you are so hehe")
    body("you got sh........")
}
