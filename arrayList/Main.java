package arrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        for(int i = 0; i<n; i++){
            arrList.add(sc.nextInt()); 
        }
        System.out.println(arrList); 
        System.out.println("Initial size: "+arrList.size());
        Collections.sort(arrList);
	System.out.println(arrList);
	Collections.reverse(arrList);
	System.out.println(arrList);
        arrList.remove(3);
        System.out.println(arrList); 
        arrList.set(3,4);
        System.out.println(arrList);
        System.out.println("First element of the ArrayList: "+arrList.get(0));    
        System.out.println("'44' is there in arraylist: "+arrList.contains(44)); 
	}
}