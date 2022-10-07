public enum LoadCapacity {
    N1("до 3.5 тонн"), N2("3.5-12 тонн"), N3("более 12 тонн");
    private String loadCapacity;

    LoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public String defineLoadCapacity() {
        if (loadCapacity != null) {
            return loadCapacity;
        } else {
            return loadCapacity = "Инфо нет";
        }
    }


    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
