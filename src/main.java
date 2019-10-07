import adapter.FindA;
import adapter.GenericFinder;

class main {
    public static void main(String[] args) {

    }
    static void testAdaptorPattern(){
        int[] A = {-1, 2, 6, 1, 5, 2, 3, 6, 4, 5};
        System.out.println("Hello" + FindA.findA(A, A.length));
        FindA findA = new FindA();
        System.out.println("Hello" + findA.find(A, A.length));
    }

}