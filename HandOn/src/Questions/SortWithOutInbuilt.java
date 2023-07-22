package Questions;

import java.util.Arrays;

public class SortWithOutInbuilt {

	public static void main(String[] args) {
		int sort[]= {2,6,7,1};
		int temp = 0;
		System.out.println("before sorting "+Arrays.toString(sort));
		for(int i = 0 ; i<sort.length;i++) {
			for(int j =i+1;j<sort.length;j++) {
				if(sort[i]>sort[j]) {
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
			}
		}
		//for(int i =0;i<sort.length;i++) {
		System.out.println("after sorting "+Arrays.toString(sort));

	}

}
