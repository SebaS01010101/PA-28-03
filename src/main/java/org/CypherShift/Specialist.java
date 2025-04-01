class Specialist {

    private int id;
    private String name;
    private String specialization;
    private String experience;
    private boolean isAvailable;

    public Specialist(int id, String name, String specialization, String experience, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getExperience() {
        return experience;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}