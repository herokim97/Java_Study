package ch10;

import java.util.*;

public class chap10 extends ex {
	
	public static void main(String[] args)
	{
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

	
}
class ex {
	static double dNum = 1.2;
	static float fNum = 0.9F;
	
	static int iNum1 = (int)dNum + (int)fNum;
	static int iNum2 = (int)(dNum + fNum);
	
	
}
