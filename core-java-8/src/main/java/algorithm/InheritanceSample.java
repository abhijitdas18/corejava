package algorithm;



import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class InheritanceSample {

    public static void main(String[] args) throws InterruptedException{
        String str = new String ("Hello");

        str = null;

        System.gc();
        Thread.sleep(5000);

        System.out.println("MAin");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("final");
    }
}
