package exercise;

public class CorperateClient extends  Client {
    private AccountManager accountManager;

    public CorperateClient(String clientID, String name, ClientType clientType, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(clientID, name, clientType, serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return accountManager.getName();
    }

    @Override
    public String getClientID() {
        return super.getClientID();
    }

    @Override
    public void setClientID(String clientID) {
        super.setClientID(clientID);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public ClientType getClientType() {
        return super.getClientType();
    }

    @Override
    public void setClientType(ClientType clientType) {
        super.setClientType(clientType);
    }

    @Override
    public ServiceLevel getServiceLevel() {
        return super.getServiceLevel();
    }

    @Override
    public void setServiceLevel(ServiceLevel serviceLevel) {
        super.setServiceLevel(serviceLevel);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
