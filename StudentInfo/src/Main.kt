data class Student(val name : String, val id : Int , val grade : Double)
val students = listOf<Student>(
    Student("John", 223,140.0),
    Student("Mark", 548,120.0),
    Student("Muhammed", 342,150.0),
    Student("Sara", 781,130.0)
)
fun main() {
    println(
        "[ 1 ] To search for a student using the ID.....\n"+
        "[ 2 ] To search for a student by name......     "
    )
    val s = readln().toInt()
    when(s){
        1 ->{ println("Enter Student Id.......")
            val id = readln().toInt()
            println(getStudentById(id))
        }
        2 -> {println("Search for the student by name.....")
            val search = readln()
            println(searchInStudents(search))
        }


    }

}

fun getStudentById(ID : Int ):Student?{
    return students.find { it.id == ID }!! // !=null
    /*
    When you search the list and don't find the ID,
    the ID value will be null and hence
    you will get a null pointer exception
     */
}

fun searchInStudents(Name : String):Student?{
    return students.find { it.name.lowercase()==Name.lowercase() }
}

