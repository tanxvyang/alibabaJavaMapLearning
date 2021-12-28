package dateAndObject;

import sun.java2d.pipe.SpanIterator;

/**
 * @author tanxy
 * @version 1.0.0
 * @ClassName RoleAndPower.java
 * @Description 复杂多对多映射，角色权限关系
 * @createTime 2021年12月27日 17:20:00
 */
class Role{
private long rid;
private String title;
private Member merbers[];
private Privlege privleges[];
    public Role(long rid,String title){
        this.rid = rid ;
        this.title = title;
    }
    public String getinfo(){
        return "[角色信息]rid = " + this.rid + "、name = "+ this.title;
    }
    public void setMerbers(Member merbers[]){
        this.merbers = merbers;
    }
    public Member[] getMerbers(){
        return this.merbers;
    }
    public void setPrivleges(Privlege privleges[]){
        this.privleges = privleges;
    }
    public Privlege[] getprivlege(){
        return this.privleges;
    }

}
class  Member{
    private String mid;
    private String name;
    private Role roles[];
    public Member(String mid,String name){
        this.mid = mid ;
        this.name = name;
    }
    public void setRoles(Role roles[]){
        this.roles = roles;
    }
    public Role[] getRole(){
        return this.roles;
    }

    public String getinfo(){
        return "[用户信息]mid = " + this.mid + "、name = "+ this.name;
    }
}
class Privlege{
    private long pid;
    private String title;
    private Role role;
    public Privlege(long pid,String title){
        this.pid = pid ;
        this.title = title;
    }
    public void setRole(Role role){
        this.role=role;
    }
    public Role  getRoles(){
        return this.role;
    }
    public String getinfo(){
        return "[权限信息]pid = " + this.pid + "、name = "+ this.title;
    }
}


public class RoleAndPower {
    public static void main(String[] args) {
//        设置对象数据
        Member mema = new Member("mldn-a","张三");
        Member memb = new Member("mldn-b","李四");
        Member memc = new Member("mldn-c","王五");

        Role roleA = new Role(1l,"系统配置");
        Role roleB= new Role(2l,"备份管理");
        Role roleC = new Role(3l,"人事管理");

        Privlege privlegeA = new Privlege(1000l,"系统初始化");
        Privlege privlegeB = new Privlege(1001l,"系统还原");
        Privlege privlegeC = new Privlege(1002l,"系统环境修改");
        Privlege privlegeD = new Privlege(2001l,"备份公文");
        Privlege privlegeE = new Privlege(2001l,"备份员工数据");
        Privlege privlegeF = new Privlege(2001l,"备份部分数据");
        Privlege privlegeG = new Privlege(3001l,"增加员工");
        Privlege privlegeH = new Privlege(3002l,"删除员工");
        Privlege privlegeI = new Privlege(3003l,"修改员工");
        Privlege privlegeJ = new Privlege(3004l,"浏览员工");
//增加角色与权限的对应关系
        roleA.setPrivleges(new Privlege[]{privlegeA,privlegeB,privlegeC});
        roleB.setPrivleges(new Privlege[]{privlegeD,privlegeE,privlegeF});
        roleC.setPrivleges(new Privlege[]{privlegeG,privlegeH,privlegeI});
//        增加权限与角色对应
        privlegeA.setRole(roleA);
        privlegeB.setRole(roleA);
        privlegeC.setRole(roleA);
        privlegeD.setRole(roleB);
        privlegeE.setRole(roleB);
        privlegeF.setRole(roleB);
        privlegeG.setRole(roleC);
        privlegeH.setRole(roleC);
        privlegeI.setRole(roleC);
        privlegeJ.setRole(roleC);
//        增加用户与角色对应关系
        mema.setRoles(new Role[]{roleA,roleB});
        memb.setRoles(new Role[]{roleA,roleB,roleC});
        roleA.setMerbers(new Member[]{mema,memb});
        roleB.setMerbers(new Member[]{mema,memb});
        roleC.setMerbers(new Member[]{memb});

        //根据要求找数据
        System.out.println("==========================通过用户查找信息===============================");
        System.out.println(memb.getinfo());
        for (int i = 0; i < memb.getRole().length; i++) {
            System.out.println("\t|-"+memb.getRole()[i].getinfo());
            for (int j = 0; j < memb.getRole()[i].getprivlege().length; j++) {
                System.out.println("\t\t|-"+memb.getRole()[i].getprivlege()[j].getinfo());
            }
        }

        System.out.println("==========================通过角色查找信息===============================");
        System.out.println(roleB.getinfo());
        System.out.println("\t|---浏览此角色下的权限信息");
        for (int i = 0; i < roleB.getprivlege().length; i++) {
            System.out.println("\t\t|-"+roleB.getprivlege()[i].getinfo());
        }
        System.out.println("\t|---浏览此角色下的用户信息信息");
        for (int x = 0 ; x < roleB.getMerbers().length ;x++){
            System.out.println("\t\t|-"+roleB.getMerbers()[x].getinfo());
        }

        System.out.println("==========================通过权限查找信息===============================");
        System.out.println(privlegeB.getinfo());
        for (int i = 0; i < privlegeB.getRoles().getMerbers().length; i++) {
            System.out.println("\t|--"+privlegeB.getRoles().getMerbers()[i].getinfo());
        }

    }
}
