package ch;

class Document {
    static int count = 0;
    static String publisher = "tk";
    String title;
    String p;

    Document() {
        this("title", "publisher" + ++count);
        System.out.println(count + publisher + this.p + this.title);
        // class variable -> this.variable
        // instance variable -> variable

    }

    Document(String title, String p) {
        this.title = title;
        this.p = p;
        System.out.println(this.title + "  " + publisher + "ppp" + p + this.p);
    }
}

class InitSequenceTest2 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("JAVA", "TK");
        Document d3 = new Document();
        Document d4 = new Document();
//        d2.publisher = "abc";
        System.out.println(d2.title);
//        System.out.println(d2.publisher);
        System.out.println(d2.p);
        System.out.println(Document.publisher);
    }

}
