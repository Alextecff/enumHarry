public enum Faculty {
    GRIFINDOR("Godrik Grifindor", "Minerva Macgonagall", 14),
    PUFFENDUY, //Penelopa Puffenduy
    KOGTEVRAN, //Kandida Koktevran
    SLISERIN("Salazar Slizerin", "Severus Snegg", 12);

    private String founder; // основатель
    private String head;    // руководитель
    private int capacity;   // вместимость

    Faculty() {
    }

    Faculty(String founder, String head, int capacity) {
        this.founder = founder;
        this.head = head;
        this.capacity = capacity;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "founder='" + founder + '\'' +
                ", head='" + head + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
