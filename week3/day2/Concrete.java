package week3.day2;

public class Concrete implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Concrete obj=new Concrete();
obj.connect();
obj.disconnect();
obj.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect method");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect method");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeupdate method");
	}

}
