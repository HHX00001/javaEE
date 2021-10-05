package cn.hhx.springbook.bean;

/**
 * @author hhxStellar
 * @date 2021/9/29-19:40
 */
public class Knight {

    private Quest quest;

    public Knight() {
        this.quest = new Quest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
