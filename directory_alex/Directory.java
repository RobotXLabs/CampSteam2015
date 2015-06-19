public class Directory{
	final static String HELLO_FRIEND = "\u001B[42;31m";
	final static String GOODBYE_FRIEND = "\u001B[0m";


	public static void main(String [] args){

		Data bob = new Data();
		bob.setFirstName("Bawb");
		bob.setLastName("Z-Awsome-Baws");
		System.out.println(bob.getFirstName() + ' ' + bob.getLastName());

		Data zBestBob = new Data(bob.getFirstName(), bob.getLastName(), 10);

		Data alice = new Data();
		alice.setFirstName("Alice");
		alice.setLastName("Z-Awesome-Programmer");
		System.out.println(alice.getFirstName() + ' ' + alice.getLastName());

		Data supercalifragilisticexpialidocious = new Data();
		supercalifragilisticexpialidocious.setFirstName("Supercalifragilisticexpialidocous");
		supercalifragilisticexpialidocious.setLastName("myFirstNameIsSpelledWrong");
		System.out.println(supercalifragilisticexpialidocious.getFirstName() + ' ' + supercalifragilisticexpialidocious.getLastName());

		Data [] alice_relations = new Data[2];
		alice_relations[0] = bob;
		alice_relations[1] = supercalifragilisticexpialidocious;
		alice.setRelations(alice_relations);
		System.out.println();
		System.out.println(HELLO_FRIEND + "The relations of 'alice' are" + GOODBYE_FRIEND);	
		for(Data d: alice.getRelations()){
			
			System.out.println(d.getFirstName() + ' ' + d.getLastName());

		}
		System.out.println();
		System.out.println(zBestBob.getFirstName() + ' ' + zBestBob.getLastName() + ' ' + 10);
	}
}