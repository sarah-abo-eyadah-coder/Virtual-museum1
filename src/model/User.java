
package model;


public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public boolean login(String id) {
        return this.userId.equals(id);
    }

    public void logout() {
        System.out.println("Logged out successfully.");
}
}

