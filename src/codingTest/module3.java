package codingTest;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class module3 {
	
	public static void main(String[] args) {
		
		//문제풀이 기본 양식
		Solution s = new Solution();
		String[] answer = {};
		

		//
		String[] rooms= {"[1234]None,Of,People,Here", "[5678]Wow"};
		int target = 1234;
		
		
//		System.out.println(s.solution01(new String[] {"I 16","D 1"}));
//		System.out.println(s.solution02(new String[] {"I 16","D 1"}));
		
		
		//System.out.println(s.solution03(new int[] {2,3,1,4}, 3));
		//System.out.println(s.solution03(new int[] {1,2,3,4}, 5));
//		System.out.println(s.solution06(new int[] {2,3,1,4}, 3));
		System.out.println(s.solution06(new int[] {1,2,3,4}, 5));
//		System.out.println(s.solution06(new int[] {1,2,3,4}, 20));
		
	}
    
}

class Solution {
	
	public static int[][] map;
	public static boolean[] visited;
	public static int max;
	public static int n;
	
	
public static int solution01(int[][] board) {
	int answer = 0;
	
	int m = board[0].length;	// 가로
	int n = board.length;		// 세로
	int sum = 0;				// 전체 타일 과자 총합
	int min = 1001;				// 포기할 타일 중 최소값
	
	//전체 총합 구하기
	for (int[] line : board) {
		sum += Arrays.stream(line).sum();
	}
	
	//전부 갈 수 있는 경우, 총합 리턴
	if(m % 2 == 1 || n % 2 == 1) {
		return sum;
	}
	
	//못 가는 타일 1개 고르기
	for(int i = 0; i < n; i++) {
		for(int j = 0; j <m; j++) {
			if ( (i%2 ==0 && j%2 ==1) || (i%2 == 1 && j%2 ==0)) {
				min = Math.min(min,  board[i][j]);
			}
		}
	}
    
	answer = sum - min;
	
	return answer;
}
	
	public static int solution02(int[][] boxes) {
		 int answer = 0;
	       
	       HashMap<Integer,Integer> hm = new HashMap<>();

	       
	       for (int i=0 ; i<boxes.length ;i++) {
	          if (hm.containsKey(boxes[i][0])) {
	             hm.remove(boxes[i][0]);
	          }else {
	             hm.put(boxes[i][0], i);
	          }
	          
	          if (hm.containsKey(boxes[i][1])) {
	             hm.remove(boxes[i][1]);
	          }else {
	             hm.put(boxes[i][1], i);
	          }
	          
	       }


	       answer = hm.size()/2;
	       
	       
	       return answer;

	}
	

	
//	
//	public static int solution02(int[][] boxes) {
//		
//	}
//	
	public int solution03(int[] play_list, int listen_time) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList();
		
		int sum = Arrays.stream(play_list).sum();
		
		if(sum < listen_time) {
			return play_list.length;
		}
		
		int maxCount = 0;
		int tmpSum = 0;
		int count = 0;
		for(int i = 0; i < play_list.length ; i++) {
			System.out.println("start ============ : " + i );
			int j = i;
			count = 0;
			tmpSum = 0;
			while(true) {
				if(j == i) {
					tmpSum += 1;
					count++;
				} else {
					System.out.println("add : " + play_list[j%play_list.length]);
					tmpSum += play_list[j%play_list.length];
					count++;
				}
				j++;
				System.out.println(tmpSum);
				
				if(tmpSum > listen_time) {
					break;
				}
			}
			
			maxCount = Math.max(maxCount, count);
			
			System.out.println("max : " + maxCount);
		}
		
		answer = maxCount;
		return answer;
		
	}
	
	
	public int solution04(int[] play_list, int listen_time) {
		
		int answer = 0;
		
		int sum = Arrays.stream(play_list).sum();
		
		if(listen_time <= 2) {
			return Math.min(play_list.length, listen_time);
		}
		
		if(sum < listen_time) {
			return play_list.length;
		}
		
		int maxCount = 0;
		int tmpSum = 0;
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < play_list.length ; i++) {
			System.out.println("start ============ : " + i  + " / " + play_list[i]);
			int j = i;
			count = 0;
			tmpSum = 0;
			set = new HashSet<>();
			while(true) {
				if(j == i) {
					tmpSum += 1;
				} else {
					System.out.println("add : " + play_list[j%play_list.length]);
					tmpSum += play_list[j%play_list.length];
				}
				j++;
				System.out.println(tmpSum);
				set.add(j%play_list.length);
				if(tmpSum > listen_time) {
					break;
				}
			}
			
			maxCount = Math.max(maxCount, set.size());
			
			System.out.println("max : " + maxCount);
		}
		
		answer = maxCount;
		return answer;
		
	}
	
	public int solution05(int[] play_list, int listen_time) {
		int answer = 0;
		
		int sum = Arrays.stream(play_list).sum();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		if(listen_time <= 2) {
			return Math.min(play_list.length, listen_time);
		}
		
		if(sum < listen_time) {
			return play_list.length;
		}
		
		for(int i = 0; i < play_list.length; i++) {
			
		}
		
		
		return answer;
	}
	
	
	public int solution06(int[] play_list, int listen_time) {
		
		int answer = 0;
		
		int[] s = new int[play_list.length]; 	//s = 그냥 앞에서부터 음악시간 더한 배열
		int s2 = 0;
		int s3 = 0;
		
		s[0] = play_list[0];
		
		for(int i = 1; i < play_list.length; i++) {
			s[i] = play_list[i-1] + play_list[i];
		}
		
		int start = 0;
		int end = play_list.length-1;
		int mid = 0;
		
		boolean flag = false;
		
		while(start<=end) {
		   mid = (start+end)/2;
		   flag = false;
		   System.out.println("start : " + start + " mid : " + mid + " end : " + end);
		   
		   for(int i = answer; i <= end ;i++){
			  if(i-1 > -1) {
				  s2 = s[i-1] + 1;
			  } else {
				  s2 = 1;
			  }
	    	  s3 = s[i-answer] - (play_list[i] > 1 ? 1 : 0);
	    	  
		      if(s2 - s3 <= listen_time) {
		         start = mid + 1;
		         
		         if(mid >= answer) {
		        	 answer= mid;
		         }
		         flag=true;
		         break;
		      }
		   }
	      
		   if(!flag){
		      end=mid-1;
		   }
		   
		}
		
		return answer;
	}
	
	
}