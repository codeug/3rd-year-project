package environment.communication.module;

import java.net.Socket;

/**
 * {@link ConnectionStatus} for a {@link CommunicationModuleStateClient}. <br>
 * Extends: {@link ConnectionStatus}.
 * 
 * @author Benedict Wilkins
 *
 */
public class ConnectionStatusClient extends ConnectionStatus {

  private static final String TYPE = "CLIENT";
  private static final String[] CLIENTLABELS = { " Connected: ",
      System.lineSeparator() + " Connection: " };

  private boolean connected;
  private String connection;

  /**
   * Constructor.
   * 
   * @param socket
   *          representing the connection
   */
  public ConnectionStatusClient(Socket socket) {
    super(socket.getInetAddress() + ":" + socket.getLocalPort(), TYPE);
    this.connected = socket.isConnected();
    this.connection = socket.getRemoteSocketAddress().toString();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(super.toString());
    builder.append(CLIENTLABELS[0] + connected);
    builder.append(CLIENTLABELS[1] + connection);
    return builder.toString();
  }
}
