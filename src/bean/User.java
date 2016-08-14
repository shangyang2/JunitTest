package bean;

public class User {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "bean.User";
		
		Class clazz = Class.forName(path);
		
		//获取类的名字
		System.out.println(clazz.getName());
	}

}
