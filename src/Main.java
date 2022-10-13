import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("secret.txt");
            writer.write("beautiful day");
            writer.write("beautiful");
            writer.append("紅楼夢（こうろうむ、繁体字: 紅樓夢; 簡体字: 红楼梦; 拼音: Hóng Lóu Mèng; ウェード式: Hung2 Lou2 Meng4）は、清朝中期乾隆帝の時代（18世紀中頃）に書かれた中国長篇章回式白話小説。原本の前80回はなお残っており、完本は114回に達しなかったと推定される。今流通している前80回が曹雪芹（そう・せつきん）の原文、後40回は高鶚（こう・がく）の続作といわれている。『三国志演義』『水滸伝』『西遊記』と並べて『中国四大名著』と位置づけられる、『紅楼夢』はその首であり、現代中国でも紅楼夢賞・世界華文長編小説賞という文学賞が存在する。\n" +
                    "\n" +
                    "石頭記（せきとうき・いしき）・金玉縁・情僧録・金陵十二釵・風月宝鑑ともいう。中国の源氏物語ともいわれている[1]。");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}