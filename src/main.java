import adapter.FindA;
import object_manager.Course;
import object_manager.MyObject;
import object_manager.Student;

class main {
    public static void main(String[] args) {
        testObjectManager();
    }

    static void testAdapterPattern() {
        int[] A = {-1, 2, 6, 1, 5, 2, 3, 6, 4, 5};
        System.out.println("Hello" + FindA.findA(A, A.length));
        FindA findA = new FindA();
        System.out.println("Hello" + findA.find(A, A.length));
    }

    static void testObjectManager() {
        MyObject x = new Student();
        MyObject y = new Course();
        x.setAttrByName("StudentID", "1512345");
        x.setAttrByName("FullName", "Nguyen Hoang Van Nha");
        x.setAttrByName("GPA", 100.0);
        System.out.println(x.toString());
    }
}