package HW9.prob4;

public class Ticket {
    int id;
    String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ticket[");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
