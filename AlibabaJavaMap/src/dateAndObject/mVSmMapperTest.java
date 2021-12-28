package dateAndObject;

import java.awt.*;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName mVSmMapperTest.java
 * @Description  多对多映射关系
 * @createTime 2021年12月27日 16:47:00
 */
class Merber{
    private  long mid;
    private String name;
    private Product subItem[];
    public Merber(long iid,String name){
        this.mid = iid ;
        this.name = name;
    }
    public String getinfo(){
        return "[用户信息]mid = " + this.mid + "、name = "+ this.name;
    }
    public void setProduct(Product subItem[]){
        this.subItem = subItem;
    }
    public Product[] getProduct(){
        return this.subItem ;
    }
}
class Product {
    private  long pid;
    private String title;
    private double price;
    private Merber merbers[];
    public Product(long pid, String title,double price){
        this.pid = pid;
        this.title = title;
        this.price = price;
    }
    public void setMerber(Merber merbers[]){
        this.merbers = merbers;
    }
    public Merber[] getMerber(){
        return this.merbers ;
    }
    public String getinfo(){
        return "[商品信息]pid = " + this.pid + "、title = "+ this.title+"、price = "+this.price;
    }
}
public class mVSmMapperTest {
    public static void main(String[] args) {
        Merber mba = new Merber(1,"张三");
        Merber mbb = new Merber(2,"里斯");
        Product proa = new Product(1l,"java代码大全",79.9);
        Product prob = new Product(2l,"数据库概论",99.9);
        Product proc = new Product(3l,"精通linux",50.9);

        mba.setProduct(new Product[]{proa,prob,proc});
        mbb.setProduct(new Product[]{proa});
        proa.setMerber(new Merber[]{mba,mbb});
        prob.setMerber(new Merber[]{mba});
        proc.setMerber(new Merber[]{mbb});

        System.out.println("==========================商品被浏览信息===================");
        System.out.println(proa.getinfo());
        for (int i = 0; i < proa.getMerber().length; i++) {
            System.out.println("\t|-"+proa.getMerber()[i].getinfo());
        }
        System.out.println("==========================用户浏览商品信息===================");
        System.out.println(mba.getinfo());
        for (int i = 0; i <mba.getProduct().length ; i++) {
            System.out.println(mba.getProduct()[i].getinfo());
        }


    }

}
