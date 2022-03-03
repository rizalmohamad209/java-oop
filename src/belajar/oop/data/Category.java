package belajar.oop.data;

public class Category {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null){

            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    private boolean expensive;
}
