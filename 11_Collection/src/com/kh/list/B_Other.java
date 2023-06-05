package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {

		 B_Other b = new  B_Other();
//		 b.method1();
//		 b.method2();
		 b.method3();
	}
	
	
	// Vector 
	// - 동기화된(synchronized)메서드로 구성 
	public void method1() {
		Vector v = new Vector();
		v.add(0);
		v.add(1);
		v.trimToSize(); // capacity조절 해주는 것
		
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(5);  // 공간 8이 나옴 (공간을 더 늘려줌)
		v.setSize(10); // [0, 1, 3, 4, null, null, null, null, null, null] 남은 공간을 null로 채워줌 
		
		v.clear(); // 사이즈는 비워 졌고 공간은 그대로 size : 0   capacity : 16
		v.trimToSize();
		
		System.out.println(v); //[0, 1]
		System.out.println("size : " + v.size()); //size : 2
		System.out.println("capacity : " + v.capacity()); // 기본값 10 (공간을 형성)
		
		
	}
	
	
	//스택(Stack)
//	 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out)구조
	public void method2() {
//		스택은 마지막에 추가한 것부터 빠져나감 
		Stack s = new Stack();
		s.push(0); //추가할 땐 push
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();  // 뺄땐 pop 마지막 넣은 3이 빠져나감 
		s.push(4);
		s.pop();  // 4가 빠져 나감
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop(); // 7이 빠져 나감
		System.out.println(s);  // [0, 1, 2, 5, 6]
	
		
	}

	// 큐(Quene) :처음에 저장한 것을 제일 먼저 꺼내는 FIFO(First In First Out)구조
	public void method3() {
		
//		Queue는 먼저 추가한 것부터 빠져나감 
		Queue q = new LinkedList();
		
		q.offer(0); //추가
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll(); //빼기, 0이 빠져나감
		q.add(4); //추가
		q.remove(); //1이 빠져나감
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove();//2가 빠져나감
		
		System.out.println(q); // [3, 4, 5, 6, 7]
	}
}
