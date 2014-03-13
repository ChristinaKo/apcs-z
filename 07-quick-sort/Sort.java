import java.io.*;
import java.util.*;

public class Sort{
    //I  tried
    public static int[] qsort(int[] a){
	if(a.length <= 1){
	    return a;
	}
	else{
	    int p = (a.length)/2;
	    ArrayList <Integer> R1 = new ArrayList<Integer>();
	    ArrayList <Integer> R2 = new ArrayList <Integer>();
	    int piv = a[p];
	    for (int i = 0; i <a.length; i ++){
		if (i ==p){
		}
		else if(a[i]<piv){
		    R1.add(a[i]);
		}
		else{
		    R2.add(a[i]);
		}
	    }
	    Integer[] lowr = R1.toArray(new Integer[R1.size()]);
	    int[] rlow = new int[lowr.length];
	    for (int i = 0; i < lowr.length; i++) {
		rlow[i] = lowr[i].intValue();
	    }
	    rlow = qsort(rlow);
	    Integer[] hir =R2.toArray(new Integer[R2.size()]);
	    int[] rhi = new int[hir.length];
	    for (int i=0; i <hir.length; i ++){
		rhi[i] = hir[i].intValue();
	    }
	    rhi = qsort(rhi);
	    for (int x = 0; x < a.length; x ++){
		if (x < rlow.length){
		    a[x] = rlow[x];
		}
		else if (x == rlow.length){
		    a[x] = piv;
		}
		else{
		    a[x] = rhi[x - (rlow.length + 1)];
		}
	    }
		return a;
	}
    }
    public static void main(String[] args){
	Sort s = new Sort();
	int[] x = {14,52,6,234,15,2,3,124,52,3,1,35,94,123};
	System.out.println(Arrays.toString(s.qsort(x)));
    }
}
