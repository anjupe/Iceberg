package icebergestudy;

public class Iceberg {
    private final String creation;
    private final String identification;

    public Iceberg(String creation, String identification) {
        this.creation = creation;
        this.identification = identification;
    }

    public String getDate() {
        return creation;
    }

    public String getIdentification() {
        return identification;
    }
    
    public String toString(){
        return "El iceberg " + identification + " creado el " +creation;
    }
    
    
    
}
