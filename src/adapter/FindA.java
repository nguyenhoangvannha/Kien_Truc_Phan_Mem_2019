package adapter;

public class FindA extends GenericFinder {

    @Override
    protected boolean Helper1(int x) {
        return x > 0;
    }

    @Override
    protected boolean Helper2(int xnew, int xcur) {
        return xnew > xcur;
    }
}