package fr.su.traducteurtms;

public class LieuOut {

    private String apiLieu;
    private Boolean suppression;
    private LieuOutData data;

    public String getApiLieu() {
        return apiLieu;
    }

    public void setApiLieu(String apiLieu) {
        this.apiLieu = apiLieu;
    }

    public Boolean getSuppression() {
        return suppression;
    }

    public void setSuppression(Boolean suppression) {
        this.suppression = suppression;
    }

    public LieuOutData getData() {
        return data;
    }

    public void setData(LieuOutData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LieuOut{" +
                "apiLieu='" + apiLieu + '\'' +
                ", suppression=" + suppression +
                ", data=" + data +
                '}';
    }
}
