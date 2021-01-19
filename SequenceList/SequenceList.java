package SequenceList;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
    //Iterator是Java输出的特有方法
    public T[] eles;//创建顺序表。

    private int N;

    public SequenceList(int capacity){//创建顺序表，capacity为容量，N为实际存储的元素。
        this.eles=(T[]) new Object[capacity];
        this.N=0;
    }

    public void clear(){//将顺序表置空。
        this.N=0;
    }

    public boolean isEmpty(){//判断顺序表是否为空。
        return N==0;
    }

    public int length(){//获取顺序表长度。
        return N;
    }

    public T get(int index){//获取指定位置的元素值,i是从0开始的索引值而非从一开始的序号.
        return eles[index];
    }

    public void insert(T t){//在顺序表尾插入元素t.
        if(N==eles.length) resize(2* eles.length);
        eles[N]=t;//赋值好之后，N自动加一。
        N++;
    }

    public void insert(int i,T t){//在顺序表的指定位置i插入元素t（元素后移并且插入），i是从0开始的索引值而非从一开始的序号。
        if(N==eles.length) resize(2* eles.length);
        for(int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }
        eles[i]=t;
        N++;
    }

    public T remove(int i){//删除i处的元素并返回元素。
        if(N<=(1/3)*eles.length) resize((int)0.5* eles.length);
        T current=eles[i];
        for(int index=i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
        N--;//删除操作后长度减一；
        return current;
    }

    public int indexof(T t){//返回第一次出现元素t的索引位置。
        for(int index=0;index<N;index++){
            if(eles[index].equals(t))
                return index;
        }
        return -1;
    }

    public void resize(int resize){//顺序表的扩容和缩容
        T[] temp=eles;
        eles=(T[])new Object[resize];
        for(int i=0;i<N;i++){
            eles[i]=temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new S_Itertor();
    }
    /*
    本来应该返回一个Iterator，但由于它是接口只能通过看构建
    内部类SIterator来进行实现，其中需要重写hasNext(),Next()方法。
    */

    public class S_Itertor implements Iterator{
        private int cursor;
        public S_Itertor(){
            this.cursor=0;
        }
        @Override
        public boolean hasNext() {
            return cursor<N;
        }
        @Override
        public Object next() {
            return eles[cursor++];
        }
    }
}
