public class TestQuickSort{
	public static void main(String[] args){
		int[] a={1,3,2,5,4};
		
		selectSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void selectSort(int[] a){
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;//�±긳ֵ
				}
			}
			if(min!=i){
				swap(a,i,min);
			}
		}
	}
	public static void swap(int[] a,int b,int c){
		int t=a[b];
		a[b]=a[c];
		a[c]=t;
	}

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}*/
}

		int temp=a[0];
		//left=1;
		//right=a.length-1;
		while(left<right){
		while(left<right&a[right]>temp)
			right--;
		if(left<right){
			swap(a,left,right);
			left++;
		}
		
		while(left<right&a[left]<=temp)
			left++;
			if(left<right){
				swap(a,right,left);
				right--;
			}
		}
		
		a[left]=temp;
		quickSort(a,left,temp);
		quickSort(a,temp+1,right);
	}
	public static void swap(int[] a,int b,int c){
		int t=a[b];
		a[b]=a[c];
		a[c]=t;
	}
	public static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}*/