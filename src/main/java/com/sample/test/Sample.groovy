import com.sample.test.Canonical1

//canonical annotation will auto create constructors for all combinations in variables in class
//defines getters and setters for member variables
def book = new Canonical1('Sandeeps hehe Story','Sandeep',100)

println(book.authod)