public class ContactServiceMain {
	public static void main(String[] args) {
		ContactService ContactService = new ContactService();

		Contact c1 = new Contact("C1", "Neve", "Sopeland", "9976578987", "Phoenix", "USA");
		Contact c2 = new Contact("C2", "Jackson", "Durkin", "480250213", "Ann Arbor", "USA");

		if(contactService.addContact(c1)) {
			System.out.println("C1 added");

		}
		else {
			System.out.println("C1 NOT added");
		}

		if(contactService.addContact(c2)) {
			System.out.println("C2 added");
	}

	else {
			System.out.println("C2 NOT added");
}

if(contactService.addContact(c1)) {
	System.out.println("C1 added");
}

else {
	System.out.println("C1 NOT added");
}

System.out.println();
contactService.displayAllContacts();

System.out.println();
if(contactService.deleteContact("C1")) {
	else {
		System.out.println("Deleted C1");
	}

contactService.updateContactFirstName("C2", "Jacks");
contactService.updateContactLastName("C2", "Durkins");
contactService.updateContactNumber("C2", "7344748167");
contactService.updateContactAddress("C2", "Denver, CO");

System.out.println();
contactService.displayAllContacts();
}
}