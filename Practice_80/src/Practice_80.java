import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_80 {
	
	public static void printArray10PerLine(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + "\t");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
			String fileName = sc.next();
			
			System.out.println("파일에서 난수를 읽어들입니다.");
			Scanner fr = new Scanner(new FileReader(fileName)); // 파일을 읽어올 Scanner
			ArrayList<Integer> list = new ArrayList<>();
			
			while(fr.hasNextInt()) {  // 입력한 숫자가 정수면 true, 아니면 false
				int value = fr.nextInt();
				list.add(value);
			}
			System.out.println("난수의 개수는 모두 " + list.size() + "개입니다.");
			
			System.out.println("입력된 난수는 다음과 같습니다.");
			printArray10PerLine(list);
			
			ArrayList<Integer> sort = new ArrayList<>();
			for(int i = 0; i < list.size(); i++) 
				sort.add(list.get(i));
			Collections.sort(sort);
			
			System.out.println("정렬된 난수 배열은 다음과 같습니다.");
			printArray10PerLine(sort);

			sc.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
