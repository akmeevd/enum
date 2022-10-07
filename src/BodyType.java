public enum BodyType {
    sedan, hatchback, coupe, stationWagon, offRoadVehicle, crossover, pickUp, van, minivan;

    private String bodyType;

    public String defineBodyType() {
        if (bodyType != null) {
            return bodyType;
        } else {
            return bodyType = "Инфо нет";
        }
    }


    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
