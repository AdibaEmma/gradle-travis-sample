package exercise;

public class Client {
    private String clientID;
    private String name;
    private ClientType clientType;
    private ServiceLevel serviceLevel;

    public Client(String clientID, String name, ClientType clientType, ServiceLevel serviceLevel) {
        this.clientID = clientID;
        this.name = name;
        this.clientType = clientType;
        this.serviceLevel = serviceLevel;
    }

    public String getContactName() {
        return this.name;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", clientType=" + clientType +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
