package object_manager

open class Student : MyObject() {

    protected var studentId: String? = null;
    protected var fullName: String? = null;
    protected var gpa: Double? = null;

    override fun getAttrByName(name: String): Any {
        when (name) {
            "GPA" -> return gpa!!
            "StudentID" -> return studentId!!
            "FullName" -> return fullName!!
        }
        return null!!
    }

    override fun setAttrByName(name: String, attr: Any) {
        when (name) {
            "GPA" -> gpa = attr as Double
            "StudentID" -> studentId = attr as String
            "FullName" -> fullName = attr as String
        }
    }

    override fun toString(): String {
        return "Student(studentId=$studentId, fullName=$fullName, gpa=$gpa)"
    }
}