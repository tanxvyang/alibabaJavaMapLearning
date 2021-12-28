package dateAndObject;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName mapperTest.java
 * @Description 一对多映射关系
 * @createTime 2021年12月27日 16:25:00
 */
class Item{
    private  long iid;
    private String title;
    private SubItem subItem[];
    public Item(long iid,String title){
        this.iid = iid ;
        this.title = title;
    }
    public String getinfo(){
        return "[分类信息]iid = " + this.iid + "、title = "+ this.title;
    }
    public void setSubItem(SubItem subItem[]){
        this.subItem = subItem;
    }
    public SubItem[] getSubItem(){
        return this.subItem ;
    }
}
class  SubItem{
    private  long sid;
    private String title;
    private Item item;
    public SubItem(long sid,String title){
        this.sid = sid;
        this.title = title;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item ;
    }
    public String getinfo(){
        return "[子类信息]iid = " + this.sid + "、title = "+ this.title;
    }
}
public class mapperTest {
    public static void main(String[] args) {
        //根据结构设置对象数据
        Item item = new Item(1L,"图书");
        SubItem subItems[] = new SubItem[]{
                new SubItem(10L,"编程图书"),
                new SubItem(10L,"建筑列图书"),
                new SubItem(10L,"计算机图书"),
        };
          item.setSubItem(subItems);
        for (int i = 0; i < subItems.length ;i++) {
            subItems[i].setItem(item);
        }
        System.out.println(item.getinfo());
        for (int i = 0; i < item.getSubItem().length; i++) {
            System.out.println(" \t|- "+ item.getSubItem()[i].getinfo());
        }
    }
}
