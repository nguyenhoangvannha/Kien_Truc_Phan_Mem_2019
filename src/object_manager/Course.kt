package object_manager

class Course : MyObject() {
    override fun setAttrByName(name: String, attr: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAttrByName(name: String): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected var courseId: String? = null;
    protected var fullName: String? = null;
    protected var credits: Int? = null;
}