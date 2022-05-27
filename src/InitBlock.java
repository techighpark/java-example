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
        System.out.println("InitBlock ib = new InitBlock();");
//        InitBlock ib = new InitBlock();

        System.out.println("InitBlock ib2 = new InitBlock();");
//        InitBlock ib2 = new InitBlock();
    }
}