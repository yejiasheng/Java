package SequenceList;

import java.util.Iterator;

//创建顺序表以及进行一系列的相关操作。
/*顺序表的优缺点：
优点：存取速度高效，通过下标来直接存储
缺点：1.插入和删除比较慢，2.不可以增长长度（Java无malloc，但是可以用resize方法改变）
 */
public class SequenceList基础功能测试 {
    public static void main(String[] args) {
        SequenceList<String> s1=new SequenceList(2);
        //capacity越大越好，避免后续空间不够用，但可能会造成浪费
        s1.insert("love ");
        s1.insert("Kobe Bryant");
        s1.insert(1,"Lebron James and ");
        s1.insert(0,"i ");
        s1.insert("!");
        Iterator it=s1.iterator();
        while(it.hasNext()){
            String s= (String) it.next();
            System.out.print(s);
        }//第一种输出方式
        System.out.println();
        for (String s : s1) {
            System.out.print(s);
        }//第二种输出方式
        System.out.println();
        System.out.println("The Sequence list's length is "+s1.length());
        s1.remove(2);//删除第三个元素
        System.out.println("The second element is:"+s1.get(1));//输出第二个元素
        s1.length();
        s1.clear();//顺序表置空
        System.out.println("Is the Sequence list empty?:"+s1.isEmpty());
        System.out.println("The length is："+s1.length());

    }
}
