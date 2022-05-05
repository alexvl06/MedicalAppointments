public class Doctor {

    static int id =  0;
    String name;
    String speciality;
    //methods

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor( String name, String speciality) {
        this.id++;
        this.name = name;
        this.speciality = speciality;

        System.out.println("A doctor is being instantiated");
    }

}
