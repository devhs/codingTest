package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;


class Card{
	static int cnt;
	int data;
	Card(int data){
		this.data = data;
		cnt++;
	}
}

public class module {
	
	public static void main(String[] args) {
		//문제풀이 기본 양식
		Solution s = new Solution();
		String[] answer = {};
		

		//String[] rooms= {"[403]James", "[404]Azad,Louis,Andy", "[101]Azad,Guard"};
		//String[] rooms= {"[101]Azad,Guard", "[202]Guard", "[303]Guard,Dzaz"};
		String[] rooms= {"[1234]None,Of,People,Here", "[5678]Wow"};
		int target = 1234;
		      
		System.out.println(s.solution01(rooms, target));
		
//		answer = s.solution("JEROEN");
//		System.out.println(" answer : " + answer);
		
		
		//answer = s.solution(new String[]{"spy","ray","spy","room","once","ray","spy","once"} );
//		answer = s.solution(new String[]{"spy","ray","spy","room","once","ray","spy","once", "room"} );
//		System.out.println(" answer : " + answer);
//		Arrays.stream(answer).forEach(t -> System.out.println(t));
//		
//		int ans = 0;
//		ans = s.solution00(new int[] {20,40,65,110}, 30);
//		System.out.println(ans);
		
		//
		
		
	
			
		//dfs, bfs
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int start = sc.nextInt();
//		a = (ArrayList<Integer>[]) new ArrayList[n+1];
//		for (int i=1; i<=n; i++) {
//		    a[i] = new ArrayList<Integer>();
//		}
//		for (int i=0; i<m; i++) {
//		    int u = sc.nextInt();
//		    int v = sc.nextInt();
//		    a[u].add(v);
//		    a[v].add(u);
//		}
//		for (int i=1; i<=n; i++) {
//		    Collections.sort(a[i]);
//		}
//		c = new boolean[n+1];
//		dfs(start);
//		System.out.println();
//		c = new boolean[n+1];
//		bfs(start);
//		System.out.println();
//		Card card1 = new Card(6);
//		Card card2 = new Card(1);
//		Card card3 = new Card(2);
//		Card card4 = new Card(3);
//		
//		System.out.println(Card.cnt);
//		
//		Person person = new Person();
//		Person person2 = new Person();
//		
//		person.eat();
//		System.out.println(person.str12);
//		person.str12 ="changed";
//		System.out.println(person.str12);
//		System.out.println(person2.str12);
		
		
	}
	
	
	
	
	public static void arrayCollector() {
		
		
		//array
		int[] arr = new int [1];  //length를 필히 넣어햐 한다. 
		String[] n = new String [1]; //마찬가지
		

		Arrays.sort(arr);					//Array 정렬 (오름차순)
		Arrays.stream(arr).sum();			//Array sum (int)
		Arrays.stream(n).filter(s -> true); //Stream filter
		//Stream filter 처리 후 list 변환
		//ArrayList<String[]> alreadyRankUser = (ArrayList<String[]>) rankList.stream().filter(t -> t[0].equals(userName) && Integer.parseInt(t[1]) >= userScore).collect(Collectors.toList());
		
		//===========================================================
		
		
		List<Integer[][]> list = new ArrayList<Integer[][]>();
		
				
		list.add(new Integer[][] {{1,3}});
		
		//arrayList
		List<Integer> list1 = new ArrayList<Integer>();
		int index = 0;
		list1.add(index, 0);
		list1.remove(index);
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		
		
		//===========================================================
		
		//map 선언
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		HashMap<String, List<String>> ma2 = new HashMap<String, List<String>>();
		
		//ma2.put("aa", new List<String>);
		
		for(String key : map.keySet()) {
			
		}
		
		//===========================================================
		
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
		
		
		//기타
		//int[] 를 integer[]로 바꾸는 방법
		Integer[] arr2 = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
		
		//forEach 구문
		Arrays.stream(arr).forEach(s -> System.out.println(s));
		
		//한글자씩 split -- 파라미터 ""로
		String str = "12345";
		String[] result = str.split("");
		
		//binarySearch
		Arrays.binarySearch(result, "1");
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		//정렬
		/*
		String[] result = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}

		// 정렬
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return ((o2 + o1).compareTo(o1 + o2));
			}
		});
		*/
		
		
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
}







class Solution {
	
	/**
	 * 
	 * @author hs
	 * @스택 - 주식 가격......  얘 잘 모르겟다
	 *
	 */
	public int[] solution1(int[] prices) {
        
		Stack<Integer[]> stack = new Stack<>();
	    int[] ret = new int[prices.length];

	    for (int i = prices.length - 2; i >= 0; i--) {
	        int day = 0;

	        while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
	            day += stack.pop()[1];
	        }

	        ret[i] = stack.push(new Integer[]{prices[i], day + 1})[1];
	    }
	    
	    return ret;
    }
	
	public int solution2(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		int currentWeight = 0;
		
		for(int t: truck_weights){
            while(true) {
                if(queue.isEmpty()){
                    queue.add(t);
                    currentWeight += t;
                    answer++;
                    break;
                } else if(queue.size() == bridge_length){
                    currentWeight -= queue.poll();
                } else {
                    if(currentWeight + t > weight){
                        queue.add(0);
                        answer++;
                    } else {
                        queue.add(t);
                        currentWeight+=t;
                        answer++;
                        break;
                    }
                }
            }
		}	
		answer  = answer + bridge_length;
		
		return answer;
	}
	
	public int solution3(int[] A , int[] B) {
		int answer = 0;
        
        Arrays.sort(A);
	    Integer[] arr = Arrays.stream( B ).boxed().toArray( Integer[]::new );
	    
	    List<Integer> list = Arrays.asList(arr);
	    
	    Arrays.sort(arr, Collections.reverseOrder());
	    for (int i = 0; i < B.length; i++) {
			B[i] = arr[i];
            System.out.println(B[i]);
		}
	    
	    for(int i = 0; i< A.length; i++){
	        answer += (A[i] * B[i]);
	    }
	    
	    return answer;
	}
	
	public String solution4(String s) {
		
		String answer = "";
		
		String[] stringArr = s.split(" ");
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(String str: stringArr) {
			int num = 0;
			
			if(str.contains("-")) {
				num = (-1) * Integer.parseInt(str.replace("-", ""));
			} else {
				num = Integer.parseInt(str);
			}
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
        return answer;
	}
	
	public String[] solution5(String[] record) {
        
		HashMap<String, String> uidMap = new HashMap<String, String>();
        
        String[] answer = {};
        String answerStream = "";
        for(String str : record) {
        	String[] messageContent = str.split(" ");
        	String postFix = "";
            if(messageContent[0].equals("Leave")){                
                postFix = "나갔습니다.";
            } else if(messageContent[0].equals("Change")) {
                uidMap.replace(messageContent[1], messageContent[2]);
            } else {
                postFix = "들어왔습니다.";
                uidMap.put(messageContent[1], messageContent[2]);
            }
            
        	if(!messageContent[0].equals("Change")) {
        		answerStream += messageContent[1]+"님이 "+ postFix + ", ";
        	}
        }
        
        for( String key : uidMap.keySet() ){
            System.out.println(uidMap.get(key));
            System.out.println(answerStream);
            String reg = key.toString();
            answerStream.replaceAll(key, uidMap.get(key));
        }
        
        answer = answerStream.split(",");
        
        return answer;
    }
	
	public int[] solution6(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        TreeMap<String, int[]> map = new TreeMap<>();
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        for(int x = 0; x < m; x++) {
        	for(int y = 0; y < n; y++) {
        		
        		if(picture[x][y] != 0) {
        			
        		}
        	}
        }
        
        
        return answer;
    }
	
	public String solution7(String number, int k) {
		
		String answer = "";
		String[] arr = number.split("\\[0-9]{1}");
		
		Arrays.stream(arr).forEach(s -> System.out.println(s));
        
		
        return answer;
    }
	
	public int solution8(String s) {
		int answer = 0;
		
		HashMap<String, Integer> aMap = new HashMap<>();
		String[] str = s.split("");
		
		for(int i = 0; i < str.length ; i++) {
			if(!aMap.containsKey(str[i])) {
				aMap.put(str[i], 0);
			} else {
				aMap.replace(str[i], aMap.get(str[i]) +1 );
			}
		}
		
		for(String key : aMap.keySet()) {
			if(aMap.get(key) % 2 == 1) {
				answer++;
			}
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public String solution9(int n) {
		String answer = "";
		String[] str = new String[3];
        int[] b = new int[9999999];
        str[0] = "4";
        str[1] = "1";
        str[2] = "2";
        
        int i = 0;
        while(n > 0){
        	int remainder = n % 3;
            n /= 3;
            
            if(remainder == 0) n--;
            
            answer += str[remainder] + answer;
        }
		
		return answer;
	}
	
	public int solution10(int n) {
		int answer = 0;
		
		int[] clapChecker = new int [n+1];
		
		for(int i = 1 ; i <= n; i++) {
			String v = Integer.toString(i);
			System.out.println(i+" : " + v.matches(".*[369].*"));
			
			if(v.matches(".*[369].*")) {
				clapChecker[i] = 1;
			} else {
				clapChecker[i] = 0;
			}
		}
		
		answer = Arrays.stream(clapChecker).sum();
		
		return answer;
	}
	
	public int solution11(int[] success) {
		int answer = Integer.MAX_VALUE;
		HashMap<String, int[]> map = new HashMap<String, int[]>();
		
		for(int i = 0; i < success.length; i++) {
			if(map.containsKey(Integer.toString(success[i]))) {
				int[] org = map.get(Integer.toString(success[i]));
				if(org[1] == -1) {
					org[1] = i;
					map.replace(Integer.toString(success[i]), org);
				}
			} else {
				map.put(Integer.toString(success[i]), new int[] {i,-1});
			}
		}
		
		for (String key : map.keySet()) {
			int[] a = map.get(key);
			System.out.println(key + " / " + a[0] + ": "+ a[1]);
			if(a[1] != -1) {
				answer = answer > a[1]-a[0] == true ? a[1] - a[0] : answer;
			}
		}
		
		if(answer == Integer.MAX_VALUE) {
			answer = -1;
		}
		
		return answer;
	}
	
	public int solution99(int k, String[] user_scores) {

		int answer = 0;
		
		LinkedList<String[]> rankList = new LinkedList<String[]>();
		String[] snapShot = new String[k];
		for(int i = 0; i < k; i++) {
			rankList.add(new String[] {" ","0"});
		}
		
		//K는 1이상 100이하인 자연수
		//user_scores의 길이는 1 이상 1000 이하
		//user_scores -> 닉네임 점수
		//바뀐다 -> 닉네임
		int z = 0;
		for(String s : user_scores) {
			//랭크 정보 변경 전 스냅샷
			for(int i = 0; i < k; i++) {
				String[] rankUser = rankList.get(i);
				snapShot[i] = rankUser[0].toString();
			}
			
			//읽어들인 유저 정보 스캔
			String[] user = s.split(" ");
			String userName = user[0]; 
			int userScore = Integer.parseInt(user[1]);			

			if(rankList.size() == 0) {
				rankList.add(user);
			} else {
				for(int i = 0; i < k; i++) {
					String[] rankUser = rankList.get(i);
					int rankUserScore = Integer.parseInt(rankUser[1]);
					
					if(rankUserScore < userScore) {
						
						//랭크에 이미 있는 경우 -> 구 랭크를 지워준다.
						boolean needRemove = false;
						int removeIndex = -1;
						for(int j = 0; j < k; j++) {
							String[] tmpUser = rankList.get(j);
							int tmpRankUserScore = Integer.parseInt(tmpUser[1]);
							
							
							if(tmpUser[0].equals(userName) && tmpRankUserScore < userScore) {
								needRemove = true;
								removeIndex = j;
								break;
							}
						}
						
						if(needRemove) {
							//System.out.println("needRemove" + removeIndex);
							rankList.remove(removeIndex);
							rankList.add(i, user);
						} else {
							ArrayList<String[]> alreadyRankUser = (ArrayList<String[]>) rankList.stream().filter(t -> t[0].equals(userName) && Integer.parseInt(t[1]) >= userScore).collect(Collectors.toList());
							
							//alreadyRankUser.forEach((t) -> {System.out.println(t[0]);});
							if(alreadyRankUser.size() == 0) {
								rankList.add(i, user);
							}
						}
						//rankList.remove(k);
						break;
					}
				}

			}
			
			//랭크 정보 변경 전 스냅샷
			for(int i = 0; i < k; i++) {
				String[] rankUser = rankList.get(i);
				if(!snapShot[i].equals(rankUser[0].toString())) {
					answer++;
					break;
				}
			}
//			System.out.println("========================= i : " + z++);
//			rankList.forEach((t) -> {
//				System.out.println(t[0] + "/ "+ t[1]);
//			});
//			
//			
//			System.out.println("=========================");
//			
		}
		
		return answer;
	}
	
	//정렬
	public String solution13(int[] numbers) {
		
		// 숫자를 문자열로 변환
		String[] result = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);
		}

		// 정렬
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println((o2 + o1).compareTo(o1 + o2));
				return ((o2 + o1).compareTo(o1 + o2));
			}
		});

		// 0만 여러개 있는 배열의 경우 하나의 0만 리턴
		if(result[0].equals("0")) {
			return "0";
		}
		
		String answer = "";
		// 정렬된 문자 하나로 합치기
		for (String a : result) {
			answer += a;
		}
		return answer;
		
	}
	
	public int solution14(int[] people, int limit) {
		
		//구명보트 앞뒤로 태우기 ----- 탐욕법
		int answer = 0;

        Arrays.sort(people);

        int right = people.length - 1;
        int left = 0;

        while (right >= left) {
            int weight = people[right--];
            if (weight + people[left] <= limit) {
              left++;
            }
            answer++;
          }

        return answer;
    }
	
	public int solution15(String name) {
        int answer = 0;
        String[] arr = name.split("");
        int[] resetStack = {1,2,3,4,5,6,7,8,9,10,11,12,13,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int currentPoint = 0;
        
        for(int i = 0; i < arr.length ; i++) {
        	int targetPoint = arr[i].codePointAt(0)-65;
        	System.out.println("move To :" + arr[i]);
        	System.out.println(Math.abs(targetPoint-currentPoint));
        	System.out.println(resetStack[targetPoint]);
        	answer += Math.min(Math.abs(targetPoint-currentPoint), resetStack[targetPoint]);
        	if(i != arr.length-1) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	
	public String[] solution(String[] movie) {
		
		String[] ans = {};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String m : movie) {
			if(map.containsKey(m)) {
				Integer orgCount = map.get(m);
				map.replace(m, orgCount+1);
			} else {
				map.put(m, 1);
			}
		}
		
		List<String> tmpList = new ArrayList<String>();
		
		tmpList.addAll(map.keySet());

		Collections.sort(tmpList,new Comparator<Object>() {
			public int compare(Object o1,Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				
				if(v1.equals(v2)) {
					return ((Comparable) o1).compareTo(o2);
				}
				
				return ((Comparable) v2).compareTo(v1);
			}
		});
		
		ans = tmpList.toArray(new String[0]);
		
		return ans;
	}
	
	public int solution00(int[] user_times, int T) {
		int answer = 0 ; 
		
		for (int time : user_times) {
			
			int multiple  = (int) Math.ceil((float)time/T);
			int remainTime = multiple * T - time;
			answer = Math.max(answer, remainTime);
		}
		
		return answer;
	}
	
	
	public String[] solution01(String[] rooms, int target) {
		
		String[] answer = {};
		
		HashMap<String, ArrayList<String>> roomMap = new HashMap<String, ArrayList<String>>();
		HashMap<String, ArrayList<String>> humanMap = new HashMap<String, ArrayList<String>>();
		
		for( String s : rooms) {
			
			String roomNum = s.substring(s.indexOf("[")+1,s.indexOf("]"));
			String[] nameList = s.substring(s.indexOf("]")+1).split(",");
			
			//System.out.println(roomNum);
			//Arrays.stream(nameList).forEach(t -> System.out.println(t));
			
			roomMap.put(roomNum, new ArrayList<String>(Arrays.asList(nameList)));
			
			for(String h : nameList) {
				ArrayList<String> list = humanMap.getOrDefault(h, new ArrayList<String>());
				list.add(roomNum);
				humanMap.put(h, list);
			}
			
		}
		
		HashMap<String, ArrayList<String>> resultMap = new HashMap<String, ArrayList<String>>();
		
		
		//우선 순위 고려
		//1. 호수 filtering
		int min = 99999;
		PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int a = Math.abs(target - Integer.parseInt(o1));
				int b = Math.abs(target - Integer.parseInt(o2));

				return ((Comparable) a).compareTo(b);
			}
		});
		
		for( String s : roomMap.keySet()) {
			if(Math.abs(target - Integer.parseInt(s)) != 0) {
				pq.add(s);
			}
		}
		
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
		
		
		for( String s : humanMap.keySet()) {
			
			if(humanMap.get(s).contains(String.valueOf(target))) {
			} else {
				HashMap<String, String> tmp = new HashMap<String, String>();
				tmp.put("name", s);
				tmp.put("size", String.valueOf(humanMap.get(s).size()));
				pqh.add(tmp);
			}
		}
		
		answer = new String[pqh.size()];
		
		int i = 0;
		
		for (HashMap<String, String> hashMap : pqh) {
			answer[i++] = (hashMap.get("name"));
		}
		
		
		Arrays.stream(answer).forEach(t -> System.out.println(t));
		
		return answer;
	}
}


