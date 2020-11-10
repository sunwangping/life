package lifeName;

import java.util.Scanner;

public class lifeName {
	
	public void creat() {
		Scanner cin = new Scanner(System.in);
		int num1,num2,age;
		System.out.println("输入棋盘大小");
		num1 = cin.nextInt();
		int[][] chess = new int[num1][num1];
		System.out.println("输入代数");
		age = cin.nextInt();
		System.out.println("输入活细胞个数");
		num2 = cin.nextInt();	
		for(int i=0; i<num2; i++) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			chess[x][y] = 1;
		}
		
		for(int j=0; j<num1; j++) {
			for(int k=0; k<num1; k++) {
				System.out.print(chess[j][k]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<age; i++) {
			for(int j=1; j<num1-1; j++) {
				int number = 0;
				for(int k=1; k<num1-1; k++) {
						if(chess[j-1][k-1] == 1)number++;
						if(chess[j-1][k] == 1)number++;
						if(chess[j-1][k+1] == 1)number++;
						if(chess[j][k-1] == 1)number++;
						if(chess[j][k+1] == 1)number++;
						if(chess[j+1][k-1] == 1)number++;
						if(chess[j+1][k] == 1)number++;
						if(chess[j+1][k+1] == 1)number++;
						
						if(number == 3)chess[j][k] = 1;
						else if(number == 2)chess[j][k] = chess[j][k];
						else chess[j][k] = 0;
						
						number = 0;
				}
			}
			
			for(int j=0; j<num1; j++) {
				for(int k=0; k<num1; k++) {
					System.out.print(chess[j][k]);
				}
				System.out.println();
			}

			System.out.println();	
		}
	}
	
	
}
