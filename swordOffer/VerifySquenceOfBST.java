package test;

import java.util.Arrays;

/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ
 * 
 */

/*

˼·��


  ��֪�����������������һ��ֵΪroot������������������ֵ����rootС��������ֵ����root��


  1��ȷ��root��


  2���������У���ȥroot��㣩���ҵ���һ������root��λ�ã����λ�����Ϊ���������ұ�Ϊ��������


  3����������������������С��root��ֵ����ֱ�ӷ���false��


  4���ֱ��ж����������������Ƿ����Ƕ��������������ݹ鲽��1��2��3����
 *
 */
public class VerifySquenceOfBST {

	
	public boolean VerifySquenceOfBST(int[] sequence) {

		if (sequence == null || sequence.length == 0)
			return false;
		int root = sequence[sequence.length - 1];
		int i = 0;
		for (; i < sequence.length - 1; i++) {
			if (sequence[i] > root) {
				break;
			}
		}
		int j = i;
		for (; j < sequence.length - 1; j++) {
			if (sequence[j] < root)
				return false;
		}
		boolean left = true;
		boolean right = true;
		if (i > 0) {
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		if (i < sequence.length - 1)
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));
		return (left && right);
	}

}
