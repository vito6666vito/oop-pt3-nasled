package transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean tires;
    private Key key;

    public static class Key {
        private final boolean remoteStart;
        private final boolean withoutKey;

        public Key(boolean remoteStart, boolean withoutKey) {
            this.remoteStart = remoteStart;
            this.withoutKey = withoutKey;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isWithoutKey() {
            return withoutKey;
        }

        @Override
        public String toString() {
            return ", удаленный запуск:" + (remoteStart ? "Да" : "Нет") +
                    ", доступ без ключа:" + (withoutKey ? "Да" : "Нет") + ".";
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, int maxSpeed, String transmission, String bodyType, String registrationNumber,
               int seats, boolean tires, Key key) {
        super(brand,model,year,country,color,maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "sedan";
        }
        this.bodyType = bodyType;

        setRegistrationNumber(registrationNumber);

        if (seats <= 0) {
            seats = 5;
        }
        this.seats = seats;
        this.tires = tires;
        setKey(key);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "manual";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "A000AA";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void tiersChanger(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            tires = false;
        }
        if (month >= 4 && month <= 10) {
            tires = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                ", объем двигателя: " + engineVolume +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", рег.номер: " + registrationNumber +
                ", количество мест: " + seats +
                ", тип резины: " + (tires ? "зимняя" : "летняя") + key;
    }

}
