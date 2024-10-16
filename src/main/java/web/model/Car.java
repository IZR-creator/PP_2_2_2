package web.model;

public class Car {
    private int idCar;
    private String model;
    private String series;

    public Car(int idCar, String model, String series) {
        this.idCar = idCar;
        this.model = model;
        this.series = series;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
