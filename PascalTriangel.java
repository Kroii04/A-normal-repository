import java.util.Scanner;
public class PascalTriangel {
    public static void main(String[] args) {
    	System.out.println("�������:");
    	Scanner in = new Scanner(System.in);
    	int layer = in.nextInt();
    	int[][] arr = new int[layer][layer];
		if(layer<=2) {
			for(int i = 0;i<layer;i++) {
				for(int n=-1;n<i;n++) {
					System.out.print("1 ");
				}
				System.out.println("");
			}
    	}
    	if(layer>2) {
    		//��ǰ���㸳ֵ
    		for(int i=0;i<2;i++) {
    			for(int n=-1;n<i;n++) {
    				arr[i][n+1] = 1;
    			}
    		}
    		//�ӵ����㿪ʼ��ֵ
    		for(int i=2;i<layer;i++) {
    			for(int n=0;n<=i;n++) {
    				if(n!=0 && n!=i) {
    				arr[i][n] = arr[i-1][n] + arr[i-1][n-1];
    			}
    			else {
    				arr[i][n] = 1;
    			}
    			}
    		}
    	}
    	//������ӡ����
    	for(int i=0,j=layer-1;i<layer;i++,j--) {
    		for(int a=0;a<j;a++) {
    			System.out.print(" ");
    		}
    		for(int n=-1;n<i;n++) {
    			System.out.print(arr[i][n+1] + " ");
    		}
    		for(int a=0;a<j;a++) {
    			System.out.print(" ");
    		}
    		System.out.println();
    	}
	}
}