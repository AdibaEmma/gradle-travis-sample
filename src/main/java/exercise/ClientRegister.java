package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public List<String> getPlatinumClients() {
        return clientList.stream()
                .filter(c -> c.getServiceLevel() == ServiceLevel.PLATINUM)
                .map(Client::getContactName)
                .collect(Collectors.toList());
    }
    public List<String> getPremiumClients() {
        return clientList.stream()
                .filter(c -> c.getServiceLevel() == ServiceLevel.PREMIUM)
                .map(Client::getContactName)
                .collect(Collectors.toList());
    }
    public Optional<Client> getClientById(String id) {
        return clientList.stream()
                .filter(c -> c.getClientID().equals(id))
                .findFirst();
    }


    public Map<ServiceLevel, Integer> getClientCountAtEachServiceLevel() {
        Map<ServiceLevel, Integer> clientListByServiceLevel = new HashMap<>();
        clientListByServiceLevel.put(ServiceLevel.GOLD, getGoldClients().size());
        clientListByServiceLevel.put(ServiceLevel.PLATINUM, getPlatinumClients().size());
        clientListByServiceLevel.put(ServiceLevel.PREMIUM, getPremiumClients().size());
        return clientListByServiceLevel;

    }

    @Override
    public String toString() {
        return "ClientRegister{" +
                "clientList=" + clientList +
                '}';
    }
}
