package ch14;

public class CompleteCalc extends Calculator{
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("���� ��� ���� ���� �˴ϴ�");
		
	}

	@Override
	public int times(int num1, int num2)
	{
		return num1*num2;
	}
	
	@Override
	public int divide(int num1, int num2)
	{
		if(num2 == 0)
		{
			
			return ERROR;
		}
		else
			return num1/num2;
	}
	
	public void showInfo()
	{
		System.out.println("Progress Complete");
	}

}
