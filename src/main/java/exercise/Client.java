package exercise;

public abstract class Client {
    private String clientID;
    private String name;
    private ClientType clientType;
    private ServiceLevel serviceLevel;
    
    abstract String getContactName();

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

}
