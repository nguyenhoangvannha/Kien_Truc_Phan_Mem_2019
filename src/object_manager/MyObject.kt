package object_manager

abstract class MyObject() {
    protected var id: Int = -1

    init {
        id = MyObjectManager.register(this)
    }

    abstract fun getAttrByName(name: String): Any

    abstract fun setAttrByName(name: String, attr: Any)
}