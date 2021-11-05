package exercise;

public class PrivateClient extends Client {

    private String clientID;
    private String name;
    private ClientType clientType;
    private ServiceLevel serviceLevel;

    public PrivateClient(String clientID, String name, ClientType clientType, ServiceLevel serviceLevel) {
        this.clientID = clientID;
        this.name = name;
        this.clientType = clientType;
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String getContactName() {
        return name;
    }

    @Override
    public String toString() {
        return "PrivateClient{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", clientType=" + clientType +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
