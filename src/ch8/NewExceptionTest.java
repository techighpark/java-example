package ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println(se.getMessage());
            se.printStackTrace();
            System.out.println("Re-install after free up space");
        } catch (MemoryException me) {
            System.out.println(me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("Re-install");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) throw new SpaceException("Not enough space to install");
        if (!enoughMemory()) throw new MemoryException("Not enough memory to install");
    }

    static void copyFiles() {
        System.out.println("Copied!");
    }

    static void deleteTempFiles() {
        System.out.println("Deleted!");
    }

    static boolean enoughSpace() {
        return true;
    }

    static boolean enoughMemory() {
        return false;
    }
}


class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
