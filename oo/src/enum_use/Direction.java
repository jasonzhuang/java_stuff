package enum_use;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Direction {

    /*NOTE:
     * 1.�����ȶ���enumʵ��,����ڶ���enumʵ��֮ǰ�����κη���������,��ô��������
     * 2.���췽��ֻ����private���η�
     * 3.����enumʱ,��������Ϊ������һ����ص���,�����̳���java.lang.Enum
     * 4.���˲��ܼ̳���һ��enum��(�Ѿ��̳���Enum),�����Ͽ��Խ�enum����һ���������,����������main����
     * 5.switchֻ�ܽ�������ֵ,ö����Ȼ�߱�����ֵ�Ĵ���,���ҿ���ͨ��ordinal()����ȡ�������
     * 6.Enum��û��values()����,���Զ���enumʱ����������Ӹ�static����
     * 7.Ҫʵ�ֳ�����ط���,��ҪΪenum����abstract����,Ȼ��Ϊÿ��enumʵ��ʵ�ָó��󷽷�
     * 8.#####��enum����ʵ��singleton#######
     */
    WEST("This is west") {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    NORTH("This is north") {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    EAST("This is east") {
        String getInfo() {
            return "hello";
        }
    },
    SOUTH("This is south") {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    private String description;

    public Map<String, Integer> map = new HashMap<String, Integer>();

    public List<String> list = new ArrayList<String>();

    private Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    abstract String getInfo();

    public static void main(String[] args) {
        for (Direction direction : Direction.values()) {
            System.out.println(direction.getInfo());
        }
    }
}
