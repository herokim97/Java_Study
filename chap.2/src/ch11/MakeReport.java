package ch11;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();
	
	private String line = " ========================================== \n";
	private String title = "Name \t Address \tPhoneNumber \n";
	
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("Kim \t");
		buffer.append("USA, LA \t ");
		buffer.append("010-2791-1600 \n");
		
		buffer.append("Lee \t");
		buffer.append("Daegu Doru \t");
		buffer.append("010-4198-2128 \n");
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}

}
