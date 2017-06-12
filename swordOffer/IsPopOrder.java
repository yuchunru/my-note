package test;

/*���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
*/
import java.util.Stack;

public class IsPopOrder {

	public boolean IsPopOrder(int[] pushA, int[] popA) {

		if (pushA.length != popA.length) {
			return false;
		} else {

			Stack<Integer> st = new Stack<Integer>();
			int i = -1;
			int j = 0;
			while (i != pushA.length) {
				if (!st.isEmpty() && st.peek() == popA[j]) {
					st.pop();
					j++;
				} else {
					++i;
					if (i != pushA.length) {
						st.push(pushA[i]);
					}
				}
			}

			if (i == pushA.length && j == pushA.length) {
				return true;
			}
			return false;
		}
	}

}
