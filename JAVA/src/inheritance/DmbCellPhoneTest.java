package inheritance;

public class DmbCellPhoneTest {

    public static void main(String[] args) {

        DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델: " + dmbcellphone.model);
        System.out.println("색상: " + dmbcellphone.color);
        System.out.println("채널: " + dmbcellphone.channel);

        dmbcellphone.powerOn();
        dmbcellphone.bell();
        dmbcellphone.sendVoice("여보세요??");
        dmbcellphone.receiveVoice("안녕하세요. 저는 최창환입니다. ");
        dmbcellphone.sendVoice("아 ~~ 예 반갑습니다!");
        dmbcellphone.hangUp();
        dmbcellphone.turnOnDmb();
        dmbcellphone.changeChannelDmb(11);
        dmbcellphone.changeChannelDmb(17);
        dmbcellphone.changeChannelDmb(24);
        dmbcellphone.turnOffDmb();

    }

}
