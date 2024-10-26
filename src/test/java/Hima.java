public class Hima {
    String name,job;
    int id;

    public Hima(String name, String job, int id) {
        this.name = name;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Hima d =new Hima("hima","tesster",45);
        //System.out.println(d.getId());
        d.setId(555);
        System.out.println(d.getId());
    }
}
