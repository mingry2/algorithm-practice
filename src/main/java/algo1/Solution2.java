package algo1;

// 다음에 올 숫자
public class Solution2 {
	public int solution(int[] common) {
		int answer = 0;

		if(common[2]-common[1] == common[1]-common[0]) // 등차 수열 (+동일한 숫자)
			return common[common.length-1] + common[2] - common[1]; // = 5
		else
			return common[common.length-1] * (common[2]/common[1]); // 등비 수열 (*동일한 숫자)

	}

	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] common = new int[]{3,6,9};
		System.out.println(solution2.solution(common));
	}
}


