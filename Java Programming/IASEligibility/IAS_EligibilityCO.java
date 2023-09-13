class IAS_EligibilityCO
{
	public static void main(String[] args) 
	{
		int age = 30;
		String result = (age>=21 && age<=31)?"Eligible for IAS Exam":"Not Eligible for IAS Exam";
		System.out.println(result);
	}
}