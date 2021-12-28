import java.util.concurrent.CountDownLatch;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName staticTest.java
 * @Description TODO
 * @createTime 2021年12月20日 16:35:00
 */
class Book {
    private String title;
    private  static  int count = 0;

    public  Book(){
        this("NOTTITLE - " + count++ );
    }
    public Book(String title){
        this.title=title;
        count++;
        System.out.println("第"+ count + "本图书创建出来。");
    }

    public String getTitle(){
        return this.title;
    }
}
public class staticTest {
    public static void main(String[] args) {
        System.out.println(new Book("java").getTitle());
        System.out.println(new Book("jsp").getTitle());
        System.out.println(new Book("sql").getTitle());
        System.out.println(new Book().getTitle());



    }

}
