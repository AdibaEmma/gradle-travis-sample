package exercise;

import java.util.List;

public class ClientRegister {
    private List<Client> clientList;

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }
}
