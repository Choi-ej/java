import java.util.Vector;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	// 내부 Vector 변수 선언
	private Vector<T> v;
	// 생성자 - Vector도 이 때 생성
	public MyStack() {
		v = new Vector<T> ();
	}
	// Override 1
	// pop 함수 (리턴 타입 T) -> Vector의 size() 함수와 get() 함수를 이용하여 pop 함수 구현
	public T pop() {
		int size = v.size();
		if(size>0) {
			T get = v.get(size-1); //마지막 요소 저장
			v.remove(size-1);
			return get;
		}else {
			return null;
		}
	}
	

	// Override 2
	// push 함수 (리턴타입 boolean, 매개변수 T 타입) -> Vector 의 add()함수 이용하기
	public boolean push (T ob) {
		return v.add(ob);
	}
	
}

public class StackManager {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>(); //부를 때 여기서 구체화 하면 됨. 각 타입마다 클래스 만들 필요 없다.
		//어떤 애든 들어갈 수 있다.

		for (int i = 0; i < 10; i++)
			stack.push(i);

		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}
		System.out.println("\n2175640 최은진");
	}
}
