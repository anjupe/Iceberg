package icebergestudy;

public class IcebergVolume {
    private final Iceberg iceberg;
    private final String date;
    private final double volume;
    private final String position;

    public IcebergVolume(Iceberg iceberg, String date, double volume, String position) {
        this.iceberg = iceberg;
        this.date = date;
        this.volume = volume;
        this.position = position;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public String getDate() {
        return date;
    }

    public double getVolume() {
        return volume;
    }

    public String getPosition() {
        return position;
    }
    
    @Override
    public String toString(){
        return iceberg.toString() + ": en la fecha " + date + " su volumen era de " + volume + " litros, y estaba en la posición " + position;
    }
    
        
}
