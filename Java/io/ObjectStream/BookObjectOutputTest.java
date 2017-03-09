
public class BookObjectOutputTest
{
    public static void main(String[] args)
    {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        ArrayList list = new ArrayList();
        Book b1 = new Book("a001", "자바완성", "홍길동", 10000);
        Book b2 = new Book("a002", "스트럿츠", "김유신", 20000);
        Book b3 = new Book("a003", "기초 EJB", "김성박", 25000);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        
        try {
            fout = new FileOutputStream("booklist.dat");
            oos = new ObjectOutputStream(fout);

            oos.writeObject(list);
            oos.reset();

            System.out.println("Saved");
        } catch (Exception e) {
        } finally {
            try {
                oos.close();
                fout.close();
            } catch (Exception e) { }
        }
    }
}