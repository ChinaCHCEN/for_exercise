package 蓝桥杯官网;

import java.util.Scanner;

public class 波动数列 {
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();//长度
//		int s = sc.nextInt();//和
//		int a = sc.nextInt();//后一项比前一项增加a
//		int b = sc.nextInt();//后一项比前一项减少b
//		
//		double arr[] = new double[n];
//		int d = 0;
//		double i = 0;
//	   while(i != 100)
//	   {
//	    	double sum = i;
//	    	for(int j = 1;j <n;j++)
//	    	{
//	    		arr[0] = i;	
////	    		arr[j] = arr[j-1]+a || arr[j] = arr[j-1]-b 都可以然后判断
//	    		if(sum == s&&j == n-1)
//	           	{
//	    			for(int k = 0;k < n;k++)
//	    			{
//	    				System.out.print(arr[k]+" ");
//	    			}
//	    			System.out.println();
//	    			d++;	    			
//	    		}
//	    	}
//	    	i++;
//	    }
//	    System.out.println(d);
//	}
//}

private static int vu=0;
private static int[] a;
private static int[][] v=new int[1004][2];
private static int mac=0;

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int n=input.nextInt(),s=input.nextInt(),c=input.nextInt(),b=input.nextInt();
	a=new int[]{c,-b};
	for (int i = 1; i <1000000; i++)
	{
		mac=i;
		dfs(i,1,n,s);
	}
	System.out.println(vu%100000007);
}

//mun是自增变量，count是匹配的位数，n是输入的位数，s是总和
private static void dfs(int mun, int count,int n, int s) {
	if(mac==s&&count==n)
	{
		vu++;
		return;
	}
	else if(count==n)
	{
		return;
	}else{
		for(int i = 0; i <2; i++)
		{
			if(v[count][i]==0)
			{
				v[count][i]=1;
				mac+=mun+a[i]; //mun+  c或-b
				dfs(mun+a[i],count+1,n,s);
				mac-=mun+a[i]; //mac减去mun+a[i]
				v[count][i]=0;
			} 
		}
	}
	}
}

