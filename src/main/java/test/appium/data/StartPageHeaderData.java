package test.appium.data;

public enum StartPageHeaderData {
  SECOND_PAGE_HEADER("Learn new words and grammar"),
  ALERT_MESSAGE("Must use physical device for Push Notifications"),
  ENTER_MESSAGE("Type a message..."),
  CHAT("Chat"),
  EXERCISE("Exercise"),
  GRAMMAR("Grammar"),
  STATS("Stats");


  private String header;

  public String getHeader() {
    return header;
  }

  StartPageHeaderData(String header) {
    this.header = header;
  }
}
