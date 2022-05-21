package codingTest;

import java.util.*;
import java.util.stream.Collectors;

public class module2 {
	
	public static void main(String[] args) {
		
		//문제풀이 기본 양식
		Solution s = new Solution();
		String[] answer = {};
		

		//
		String[] rooms= {"[1234]None,Of,People,Here", "[5678]Wow"};
		int target = 1234;
		
		
		System.out.println(s.solution01(new String[] {"I 16","D 1"}));
		System.out.println(s.solution02(new String[] {"I 16","D 1"}));
		System.out.println(s.solution03(new String[] {"I 16","D 1"}));
		
	}
	
	public static void tmpArchive() {
		
		//int array
		int[] arr1 = new int [1];
		int[] arr2 = {};
		String[] arr3 = {};
		
		Arrays.sort(arr1);						//오름차순
		Arrays.stream(arr1).sum();				//합계
		Arrays.stream(arr1).filter(s -> true);	//filter
		
		//stream filter 후 list 반환
		//ArrayList<String[]> alreadyRankUser = (ArrayList<String[]>) arr1.stream().filter(t -> t[0].equals(userName) && Integer.parseInt(t[1]) >= userScore).collect(Collectors.toList());
		
		List<Integer[][]> list1 = new ArrayList<Integer[][]>();
		
		
		list1.add(new Integer[][] {{1,3}});
		
		//List
		List<Integer> list2 = new ArrayList<Integer>();
		int index1 = 0;
		list2.add(index1, 0);
		list2.remove(index1);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
		//List Sort
		Collections.sort(list2,new Comparator<Object>() {
			public int compare(Object o1,Object o2) {
//				Object v1 = map.get(o1);
//				Object v2 = map.get(o2);
//				
//				if(v1.equals(v2)) {
//					return ((Comparable) o1).compareTo(o2);
//				}
				
				return ((Comparable) o1).compareTo(o2);
			}
		});
		
		//map 선언 -> key 중복 x
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		HashMap<String, List<String>> ma2 = new HashMap<String, List<String>>();
		
		//ma2.put("aa", new List<String>);
		
		for(String key : map.keySet()) {
			
		}
		
		//HashSet  -- 중복 미허용
		Set<Integer> set1 = new HashSet<Integer>();
		
		
		
		
		//Stack 
		Stack <String> stack = new Stack();
		stack.add(null);	//넣기
		stack.empty();		//비었는지 확인
		stack.peek();		//stack 최상단 값
		stack.pop();		//stack 빼기
		
		//Queue
		Queue <String> queue = new LinkedList<>();
		queue.add(null);	//넣기
		queue.isEmpty();	//비었는지 확인
		queue.peek();		//queue 나올 값
		queue.poll();		//queue 빼기
		
		//Deque
		ArrayDeque<Integer> dq = new ArrayDeque<>(50505);
		dq.isEmpty();
		dq.add(null);
		dq.addFirst(null);
		dq.addLast(null);
		dq.peekFirst();
		dq.peekLast();
		dq.pollFirst();
		dq.pollLast();
		
		//PriorityQueue
		PriorityQueue <Integer> maxPq = new PriorityQueue<Integer>(Collections.reverseOrder()); //최대우선순위큐
		PriorityQueue <Integer> minPq = new PriorityQueue<Integer>(); //최소우선순위큐
		PriorityQueue<HashMap<String, String>> pqh = new PriorityQueue<HashMap<String, String>>(new Comparator<HashMap<String, String>>() {

			@Override
			public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {					
				
				int size1 = Integer.parseInt(o1.get("size"));
				int size2 = Integer.parseInt(o2.get("size"));
				String name1 = o1.get("name");
				String name2 = o2.get("name");
				
				
				if(size1 != size2) {
					return ((Comparable) size1).compareTo(size2);
				} else {
					return ((Comparable) name1).compareTo(name2);
				}
				
			}
			
		});
		
		
		maxPq.add(null);
		maxPq.peek();		//head
		maxPq.poll();		//빼기
		maxPq.isEmpty();	//비었는지
		maxPq.remove();		//삭제
		
		//변환
		//List<Integer> -> int[];
		int[] arr99 = {};
		List<Integer> list99 = new ArrayList<Integer>();
		arr99 = list99.stream().mapToInt(i->i).toArray();
		
		//int[] -> List<Integer>
		int[] arr100 = {};
		List<Integer> list100 = Arrays.stream(arr100).boxed().collect(Collectors.toList());
		
		//Integer[] -> List<Integer>
		Integer[] arr101 = {};
	    List<Integer> list101 = Arrays.asList(arr101);
		
		
		//String
		String str1 = "ABC";
		str1.charAt(1);
		
		
		
		
	}
	
	public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
	
	
	static ArrayList<Integer>[] a;
    static boolean[] c;
    public static void dfs(int x) {
        if (c[x]) {
            return;
        }
        c[x] = true;
        System.out.print(x + " ");
        for (int y : a[x]) {
            if (c[y] == false) {
                dfs(y);
            }
        }
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        c[start] = true;
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x + " ");
            for (int y : a[x]) {
                if (c[y] == false) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }
    }

    public boolean BinarySearch(int []arr, int len, int key){
        int start = 0;
        int end = len-1;
        int mid;
     
        while(end - start >= 0) {
            mid = (start + end) / 2;    //중앙 값
     
            if (arr[mid] == key) {    //key값을 찾았을때
                return true;
     
            } else if (arr[mid] > key) {   //key값이 mid의 값보다 작을때 (왼쪽으로)
                end = mid - 1;
     
            } else {  //key값이 mid의 값보다 클때 (오른쪽으로)
                start = mid + 1;
     
            }
        }
        return false;
    }
    
    static boolean isStringInt(String a) {
		try {
			Integer.parseInt(a);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
    
    
}

class Solution {
	
	public static void solution01() {
		
	}
	
	public static void solution02() {
		
	}
	
	public static void solution03() {
		
	}
	
}