package entities;

public class Rooms {
    private String name;
    private String email;
    private int room;

    public Rooms() {
    }
    public Rooms(String email, String name, int room) {
        this.email = email;
        this.name = name;
        this.room = room;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
