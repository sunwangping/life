package lifeName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class lifeName {

	static int num1;
	static int age;
	static int[][] chess,chess_copy;
	
	public void creat() {
		Scanner cin = new Scanner(System.in);
		int num1,num2,age;
		System.out.println("输入棋盘大小");
		num1 = cin.nextInt();
		int[][] chess = new int[num1][num1];
		int[][] chess_copy = new int[num1][num1];
		System.out.println("输入代数");
		age = cin.nextInt();
		System.out.println("输入活细胞个数");
		num2 = cin.nextInt();	
		for(int i=0; i<num2; i++) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			chess[x][y] = 1;
		}
		
		System.out.println();
		
		for(int i=0; i<age; i++) {
			for(int j=0; j<num1; j++) {
				int number = 0;
				for(int k=0; k<num1; k++) {
						if(j-1 > -1 && k-1> -1)if(chess[j-1][k-1] == 1)number++;
						if(j-1 > -1)if(chess[j-1][k] == 1)number++;
						if(j-1 > -1 && k+1 < num1)if(chess[j-1][k+1] == 1)number++;
						if(k-1> -1)if(chess[j][k-1] == 1)number++;
						if(k+1 < num1)if(chess[j][k+1] == 1)number++;
						if(k-1> -1 && j+1 < num1)if(chess[j+1][k-1] == 1)number++;
						if(j+1 < num1)if(chess[j+1][k] == 1)number++;
						if(j+1 < num1 && k+1 < num1)if(chess[j+1][k+1] == 1)number++;
						
						if(number == 3)chess_copy[j][k] = 1;
						else if(number == 2)chess_copy[j][k] = chess[j][k];
						else chess_copy[j][k] = 0;
						
						number = 0;
				}
			}
			
			chess = chess_copy;
			
			for(int j=0; j<num1; j++) {
				for(int k=0; k<num1; k++) {
					if(chess[j][k] == 1)System.out.println(j+","+k);
				}
				System.out.println();
			}

			System.out.println();	
		}
	}
	
	 public static String txt_String(File file){
	        StringBuilder result = new StringBuilder();
	        int count = 1;
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
	            String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                if(count == 1)num1 = Integer.parseInt(s);
	                else if (count == 2)age = Integer.parseInt(s);
	                else {
						
					}
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();
	    }
}
