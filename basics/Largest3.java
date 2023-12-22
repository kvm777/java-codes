package basics;

public class Largest3
{
	public static void main(String[] args) {
		int a[] = {1,4,5,2,7,3,9,4,18,33};

		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if (a[j] < a[i]){
					a[j] = a[i]+a[j] - (a[i]=a[j]);
					break;
				}
			}
		}
		System.out.println(a[a.length-3]);
	}
}


