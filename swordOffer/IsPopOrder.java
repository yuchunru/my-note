package test;

/*输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
*/

//算法思路：如果下一个弹出的数字恰好为栈顶数字，那么直接弹出。
//如果下一个弹出的数字不在栈顶，我们将还未入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
//若所有数字都压入栈任然没有找到下个弹出的数字，那么该序列不可能是一个弹栈序列
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
