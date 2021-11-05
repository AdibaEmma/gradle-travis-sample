package exercise;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientRegister {
    private List<Client> clientList;

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<String> getClientList() {
        return clientList.stream()
                .map(Client::getContactName)
                .collect(Collectors.toList());
    }

    public List<String> getGoldClients() {
        return clientList.stream()
                .filter(c -> c.getServiceLevel() == ServiceLevel.GOLD)
                .map(Client::getContactName)
                .collect(Collectors.toList());
    }

    public Optional<Client> getClientById(String id) {
        return clientList.stream()
                .filter(c -> c.getClientID().equals(id))
                .findFirst();
    }

    @Override
    public String toString() {
        return "ClientRegister{" +
                "clientList=" + clientList +
                '}';
    }
}
