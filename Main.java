import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = br.readLine();
	Scanner sc1= new Scanner(line);
	int tests = sc1.nextInt();
	for(int i=0; i<tests; i++) {
		br.readLine();
		String s;
		int number=0;
		TreeMap<String,Integer> trees = new TreeMap<String,Integer>();
		trees.clear();
		while((s=br.readLine())!=null && !s.isEmpty()) {
			Scanner sc2 = new Scanner(s);
			int treeCount=1;
			String tree=sc2.next();
			if(trees.get(tree)==null) {
				trees.put(tree, treeCount);
			}else {
				treeCount=trees.get(tree);
				treeCount++;
				trees.put(tree, treeCount);
			}
			number++;
		}
		for(Entry<String,Integer> entry: trees.entrySet()) {
			String key = entry.getKey();
			double value = entry.getValue();
			value= (value/number)*100;
			System.out.print(key+" ");
			System.out.printf("%.4f \n",value);
		}
		
	}
	
}
}
