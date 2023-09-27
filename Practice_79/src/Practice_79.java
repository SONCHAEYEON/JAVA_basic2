import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Practice_79 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();

		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int arr[] = new int[sc.nextInt()];
		System.out.print("난수값의 범위를 설정하세요: ");
		int range = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = rg.nextInt(range + 1);
		
		System.out.println("생성된 난수 배열은 다음과 같습니다.");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
		
		try {
			System.out.print("난수값을 저장할 파일 이름을 입력하세요: ");
			String fileName = sc.next();
			FileWriter fw = new FileWriter(fileName);
			
			for(int i = 0; i < arr.length; i++) {
				fw.write(Integer.toString(arr[i]) + "\t");
				if((i + 1) % 10 == 0)
					fw.write("\n");
			}
			System.out.println("파일 " + fileName + "에 난수값이 저장되었습니다.");
			
			fw.close();
			sc.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
