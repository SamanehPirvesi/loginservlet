import service.UserService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 UserService us=new UserService();
if(us.isUserCorrect("aaa", "s123")==true) {
System.out.println("is true");}
else 
{
	System.out.println("false");}
	}

}
