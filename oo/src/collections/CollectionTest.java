package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {
public static void main(String[] args) {
//	Random rand=new Random(47);
	ArrayList<Integer> c=new ArrayList<Integer>();
//	for(int i=0;i<10;i++)
//	{
//		c.add(rand.nextInt(20));
//		
//	}
//	for(Integer i:c)
//	{
//		System.out.print(i+",");
//	}
	Collections.sort(c);//�ϲ�����
//	System.out.println(c.toString());
	//List a=Arrays.asList(2,4,7);
	ArrayList a=new ArrayList();//��������ʵ��
	for(int i=1;i<5;i++){
		a.add(i+5);
	}
	String s1 = String.valueOf(a.get(0));
    synchronized (System.out) {
        System.out.print(s1);
    }//�������㿪ʼ
	
	//a.contains("a");
	//Iterator iterator=a.iterator();//˫�򣬻�������
////	System.out.println(a.get(0));
//	LinkedList list=new LinkedList();//����˫������
//	list.add("dsd");
//	System.out.println(list.get(0));
	TreeSet<String> set=new TreeSet<String>();//��treemap��ʵ��
//	set.add("a");
	set.iterator();//����Ԫ���Ƿ��ظ�
	TreeMap<String,String> treemap=new TreeMap<String,String>();//�����б�
	LinkedHashMap<String,String> link=new LinkedHashMap<String,String>();//�̳�hashmap
	short s=1;
	s+=1;
	String aa="123445";
	//System.out.println(aa.substring(1,3));
	List<String> list = new ArrayList<String>();
	boolean result = list.remove("6");//false
	
}
}
