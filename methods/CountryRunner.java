//1st task 16-7-24


class CountryRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in CountryRunner");
		String[] totalStates={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh",
		"Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha",
		"Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
		Country.states(totalStates);
		System.out.println("================================================");
		Country.statesBackward(totalStates);
		
		System.out.println("*************************************************");
		
		int[] totalCodes={560001,813208,670001,507130,403001,800001,121001,171001,360001,450001};
		Country.pincode(totalCodes);
		System.out.println("=================================================");
		Country.pincodeBackward(totalCodes);
		
		System.out.println("**************************************************");
		
		String[] totalMinister={"Jawaharlal Nehru","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Atal Bihari Vajpayee","Manmohan Singh",
		"Chaudhary Charan Singh","Rajiv Gandhi","V.P.Singh","Chandra Shekhar","P.V.Narasimha Rao","H.D.Deve Gowda","Narendra Modi","Gulzarilal Nanda"};
		Country.primeMinister(totalMinister);
		System.out.println("=================================================");
		Country.primeMinisterBackward(totalMinister);
		
		System.out.println("**************************************************");
		
		String[] totalcabinetMinister={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan",
        "Dr.Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H.D.Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan",
        "Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi",
        "Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya","Shri Bhupender Yadav","Shri Gajendra Singh","Smt.Annpurna Devi",
        "Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Country.cabinetMinister(totalcabinetMinister);
		System.out.println("=================================================");
		Country.cabinetMinisterBackward(totalcabinetMinister);
		
		System.out.println("***************************************************");
        
        String[] totalParties={"BJP","Congress","AAP","BSP","NCP"};
		Country.politicalParties(totalParties);	
        System.out.println("===================================================");
        Country.politicalPartiesBackward(totalParties);			

	}
}

