public enum Capacity {
    veryLittle(null), little("до 25 мест"), medium("40-50"), big("60-80"), veryBig("100-120");

    private String capacity;

    Capacity(String capacity) {
        this.capacity = capacity;
    }

    public String defineCapacity() {
        if (capacity != null) {
            return capacity;
        } else {
            return capacity = "Инфо нет";
        }
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
