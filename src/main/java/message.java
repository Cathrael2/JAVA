
public class message {
	private String mess;
	
	public message( String inc_mess )
	{
		mess = inc_mess;
	}
	
	public message() {
		// TODO Auto-generated constructor stub
		mess = "";
	}

	public void set_message( String inc_mess )
	{
		mess = inc_mess;
	}
	
	public void show_mess()
	{
		System.out.println(mess);
	}
}