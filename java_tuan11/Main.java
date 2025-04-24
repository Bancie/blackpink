package java_tuan11;

public class Main {
    public static void main(String[] args) {
        Employee nv1 = new Manager("a", 12, 2000,"Marketing") ;
        Employee nv2 = new Manager("b", 12, 2001,"Marketing") ;
        Project pj=new Project();
        pj.addnv(nv1);
        pj.addnv(nv2);
        pj.thongtin();
        System.out.println(pj.demManager());
        System.out.println(pj.tuoitrungbinh());
        pj.timqulcaonhat();
    }
}
