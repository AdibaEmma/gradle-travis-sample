package exercise;

public class CorperateClient extends  Client {
    private String clientID;
    private String name;
    private ClientType clientType;
    private ServiceLevel serviceLevel;
    private AccountManager accountManager;

    public CorperateClient(String clientID, String name, ClientType clientType, ServiceLevel serviceLevel, AccountManager accountManager) {
        this.clientID = clientID;
        this.name = name;
        this.clientType = clientType;
        this.serviceLevel = serviceLevel;
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return accountManager.getName();
    }


    @Override
    public String getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    @Override
    public ClientType getClientType() {
        return clientType;
    }

    @Override
    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "CorporateClient{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", clientType=" + clientType +
                ", serviceLevel=" + serviceLevel +
                ", accountManager=" + accountManager +
                '}';
    }
}
