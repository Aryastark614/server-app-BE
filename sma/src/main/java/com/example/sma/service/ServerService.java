package com.example.sma.service;

import com.example.sma.model.Server;

import java.io.IOException;
import java.util.Collection;

// This interface defines the contract for a service that handles operations related to servers.
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}