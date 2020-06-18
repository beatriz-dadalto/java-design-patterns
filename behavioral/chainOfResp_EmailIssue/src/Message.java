public class Message {

  public String text;
  public MessagePriority priority;

  public Message(String message, MessagePriority priority) {
    text = message;
    this.priority = priority;
  }

}
