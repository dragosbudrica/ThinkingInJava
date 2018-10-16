package generics.exercise22;
import java.lang.reflect.*;

abstract class GenericWithCreate<T> {
    Class<T> kind;
    GenericWithCreate(Class<T> kind) {
        this.kind = kind;
    }
    abstract T create();
}

class User {
    private String firstName;
    private String lastName;
    private Integer age;

    User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nAge: " + age;
    }
}

class UserCreator extends GenericWithCreate<User> {
    UserCreator(Class<User> kind) {
        super(kind);
    }
    User create() {
        Constructor[] ctors = kind.getDeclaredConstructors();
        Constructor ctor = null;
        for (Constructor ctor1 : ctors) {
            ctor = ctor1;
            if (ctor.getGenericParameterTypes().length > 0)
                break;
        }
        if(ctor != null) {
            try {
                ctor.setAccessible(true);
                return (User) ctor.newInstance("Dragos", "Budrica", 24);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.toString());
            }
        }
        return null;
    }
}

public class Test {
    public static void main(String[] args) {
        UserCreator c = new UserCreator(User.class);
        User user = c.create();
        if(user != null) {
            System.out.println(user);
        } else {
            System.out.println("No such constructor found!");
        }
    }
}