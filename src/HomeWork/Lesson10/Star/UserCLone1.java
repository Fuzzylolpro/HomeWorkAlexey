package HomeWork.Lesson10.Star;

public class UserCLone1 extends User implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setAge(5);
        User user1 = (User) user.clone();

        System.out.println(user1.getAge());
        System.out.println(user1.equals(user));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
