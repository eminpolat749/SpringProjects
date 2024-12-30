package org.csystem.app.service.info.client;

import java.time.LocalDateTime;

public class ClientInfo { // DTO
    public String host;
    public String localHost;
    public int port;
    public int localPort;
    public LocalDateTime requestDateTime;

    public ClientInfo(String host, String localHost, int port, int localPort, LocalDateTime requestDateTime)
    {
        this.host = host;
        this.localHost = localHost;
        this.port = port;
        this.localPort = localPort;
        this.requestDateTime = requestDateTime;
    }
}
