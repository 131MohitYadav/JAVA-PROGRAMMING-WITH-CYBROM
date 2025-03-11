
import com.ram.bean.StudentBean;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(100);
        list.add(20);
        list.add(200);
        
        System.out.println(list);
        System.out.println("Print Data Using for each ");
        for(Integer x:list){
            System.out.println(""+x);
        }
        
        ArrayList<StudentBean> list2=new ArrayList<StudentBean>();
        list2.add(new StudentBean(101, "A", "X1", 0, 0, 0, 0, 0, 0, 0));
        list2.add(new StudentBean(102, "B", "X1", 0, 0, 0, 0, 0, 0, 0));
        list2.add(new StudentBean(103, "C", "X1", 0, 0, 0, 0, 0, 0, 0));
        list2.add(new StudentBean(104, "D", "X1", 0, 0, 0, 0, 0, 0, 0));
        list2.add(new StudentBean(105, "E", "X1", 0, 0, 0, 0, 0, 0, 0));
        
        System.out.println("Print All Data from list 2");
        for(StudentBean sb:list2){
            System.out.println(""+sb.getSid()+"\t"+sb.getName());
        }
        
    }
}
