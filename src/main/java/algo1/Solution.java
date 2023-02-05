package algo1;

import java.util.Arrays;

//연속된 수의 합
class Solution {
	public int[] solution(int num, int total) {
		int n = total/num - (num - 1)/2;

		int[] answer = new int[num];

		for (int i = 0; i < num; i++)
			answer[i] = n + i;

		return answer;
	}


	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = 3;
 		int total = 12;

		System.out.println(Arrays.toString(solution.solution(num, total)));
	}
}
