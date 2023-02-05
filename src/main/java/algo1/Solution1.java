package algo1;

// 옹알이(1)
public class Solution1 {
	public int solution(String[] babbling) {
		int answer = 0;

		String[] speakingList = {"aya", "ye", "woo", "ma"};

		for (String str : babbling) {
			String tempStr = str;
			System.out.println("str = " + str);
			for (String speak : speakingList) {
				tempStr = tempStr.replace(speak, "");
				System.out.println("speak = " + speak + ", tempStr = " + tempStr);
			}
			if (tempStr.length() == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution1 solution = new Solution1();

		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(solution.solution(babbling));
	}
}

