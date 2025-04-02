package allAboutArrays;

public class Arr1 {

	public static void main(String[] args) {
		
		// NOrmal Array Creation
//		int nums[] = {7,8,9,10};
//		
//		System.out.println(nums[0]);
//		
//		nums[0] = 11;
//		
//		System.out.println(nums[0]);
//		
//		for(int n : nums) {
//			System.out.println(n);
//		}

		// NOw Creating Arrays dyanmically
//		int nums[] = new int[4];
//		nums[0] = 4;
//		nums[1] = 9;
//		nums[2] = 3;
//		nums[3] = 5;
//		
//		System.out.println(nums[1]);
		
		// multi-dimensional arrays now...
		int nums[][] = new int[3][4];
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				nums[i][j] = (int)(Math.random() * 10);
				System.out.println(nums[i][j]);
			}		
		}
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
