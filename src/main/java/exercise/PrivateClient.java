package exercise;

public class PrivateClient extends Client {
    public PrivateClient(String clientID, String name, ClientType clientType, ServiceLevel serviceLevel) {
        super(clientID, name, clientType, serviceLevel);
    }

    @Override
    public String getContactName() {
        return getName();
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
