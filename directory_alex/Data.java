public class Data{
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	int age;
	Data[] relations;

	/*Data is a constructer*/ 
	public Data (){
		relations = new Data[10];
	}

	/*Getting and setting first name*/
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String first_name){
		firstName = first_name;
	}

	/*Getting and setting last name*/
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String last_name){
		lastName = last_name;
	}

	/*Getting & setting phone number*/
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String phone_number){
		phoneNumber = phone_number;
	}

	/*Getting and setting address*/
	public String getAddress(){
		return address;
	}
	public void setAddress(String user_address){
		address = user_address;
	}

	/*Getting and setting age*/
	public int age(){
		return age;
	}
	public void setAge(int my_age){
		age = my_age;
	}

	/*Getting and setting relations*/
	public Data[] getRelations(){
		return relations;
	}
	public void setRelations(Data[] user_relations){
		relations = user_relations;
	}
}