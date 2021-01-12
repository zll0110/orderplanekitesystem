public class Flight {
    private String id;
    private String planetype;  //飞机型号
    private String seatsNo;  //座位号
    private Float totalSeatsNum; //空座位数量
    private String departureAirPort;  //出发机场
    private String destinationAirPort;  //到达机场
    private String DepartureDate;  //出发日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanetype() {
        return planetype;
    }

    public void setPlanetype(String planetype) {
        this.planetype = planetype;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String departureDate) {
        DepartureDate = departureDate;
    }



}
