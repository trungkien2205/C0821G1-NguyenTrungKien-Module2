package models;

public class Booking {
    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerId;
    private String serviceName;
    private String serviceType;

    public Booking(String bookingId, String startDay, String endDay, String customerId, String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public Booking(String[] strings){
        this.bookingId=strings[0];
        this.startDay = strings[1];
        this.endDay=strings[2];
        this.customerId=strings[3];
        this.serviceName=strings[4];
        this.serviceType=strings[5];
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return bookingId + ',' + startDay + ',' + endDay + ',' + customerId + ',' + serviceName + ',' +serviceType;
    }
}
