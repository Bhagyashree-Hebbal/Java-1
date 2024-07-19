//2nd task 9-7-24


class HospitalRunner
{
    public static void main(String[] args)
	{
		System.out.println("running main in HospitalRunner");
		String medicineName1=Hospital.medicineName(150);
		System.out.println("MedicineName1:"+medicineName1);
		String medicineName2=Hospital.medicineName(100);
		System.out.println("MedicineName2:"+medicineName2);
		String medicineName3=Hospital.medicineName(200);
		System.out.println("MedicineName3:"+medicineName3);
		String medicineName4=Hospital.medicineName(250);
		System.out.println("MedicineName4:"+medicineName4);
		
		
		System.out.println("running main in HospitalRunner");
		String symptom1=Hospital.symptom("Prastamol");
		System.out.println("symptom1:"+symptom1);
		String symptom2=Hospital.symptom("Silicazib");
		System.out.println("symptom2:"+symptom2);
		String symptom3=Hospital.symptom("Multi-vitamin");
		System.out.println("symptom3:"+symptom3);
		String symptom4=Hospital.symptom("Vicks action 500");
		System.out.println("symptom4:"+symptom4);
		
		
		System.out.println("running main in HospitalRunner");
		String doctorName1=Hospital.doctorName("8AM to 10AM");
		System.out.println("DoctorName1:"+doctorName1);
		String doctorName2=Hospital.doctorName("11AM to 1PM");
		System.out.println("DoctorName2:"+doctorName2);
		String doctorName3=Hospital.doctorName("3PM to 5PM");
		System.out.println("DoctorName3:"+doctorName3);
		String doctorName4=Hospital.doctorName("8PM to 10PM");
		System.out.println("DoctorName4:"+doctorName4);
	}

}