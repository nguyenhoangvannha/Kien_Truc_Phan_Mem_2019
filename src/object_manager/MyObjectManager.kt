package object_manager

class MyObjectManager {
    companion object {
        var nextID = 0
        private val objects = mutableMapOf<Int, MyObject>();

        fun register(obj: MyObject): Int {
            val id = nextID++
            objects.run {
                put(id, obj)
            }
            return id;
        }

    }
}