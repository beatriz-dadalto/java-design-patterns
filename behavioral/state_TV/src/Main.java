public class Main {

  public static void main(String[] args) {
    System.out.println("** STATE PATTERN **\n");

    // initially Tv is Off
    TV tv = new TV();

    System.out.println("User is pressing buttons in the following sequence: ");
    System.out.println("1.Off 2.Mute 3.On 4.On 5.Mute 6.Mute 7.Off\n");

    // TV is already in off state. Again Off button is pressed
    tv.pressOffButton();
    // TV is already in Off state. Again Mute button is pressed
    tv.pressMuteButton();
    // making the TV On
    tv.pressOnButton();
    // TV is already in On state. Again On button is pressed
    tv.pressOnButton();
    // putting the tv in Mute mode
    tv.pressMuteButton();
    // tv is already in Mute mode. Again Mute button is pressed
    tv.pressMuteButton();
    // turning the Tv Off
    tv.pressOffButton();

  }

}
