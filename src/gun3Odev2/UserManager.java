package gun3Odev2;

public class UserManager {

	public void add(User user) {
		System.out.println("Eklendi "+user.getFirstName()+user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Güncellendi "+user.getFirstName()+user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Silindi "+user.getFirstName()+user.getLastName());
	}
	
	public void list() {
		System.out.println("Listelendi");
	}
}
