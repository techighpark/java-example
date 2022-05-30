package ch;

class InitBlock {
    static {
        System.out.println("static initial block");
    }

//    {
//        System.out.println("instance initial block");
//    }

    InitBlock() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("ch.InitBlock ib = new ch.InitBlock();");
//        ch.InitBlock ib = new ch.InitBlock();

        System.out.println("ch.InitBlock ib2 = new ch.InitBlock();");
//        ch.InitBlock ib2 = new ch.InitBlock();
    }
}