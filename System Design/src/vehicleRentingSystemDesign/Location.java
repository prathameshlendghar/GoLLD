package vehicleRentingSystemDesign;

public class Location {
    String city;
    String subDistrict;
    String district;
    int pinCode;
    double lat;
    double lng;

    public Location(){}

    public Location(String city, String subDistrict, String district, int pinCode, double lat, double lng) {
        this.city = city;
        this.subDistrict = subDistrict;
        this.district = district;
        this.pinCode = pinCode;
        this.lat = lat;
        this.lng = lng;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
