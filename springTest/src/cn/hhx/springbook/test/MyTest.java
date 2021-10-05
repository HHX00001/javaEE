package cn.hhx.springbook.test;

import cn.hhx.springbook.bean.Knight;
import org.junit.Test;

/**
 * @author hhxStellar
 * @date 2021/9/29-19:40
 */
public class MyTest {
    @Test
    public void test1() {
        Knight knight = new Knight();
        knight.embarkOnQuest();
    }
}
