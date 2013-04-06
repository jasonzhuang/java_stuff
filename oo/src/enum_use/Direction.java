package enum_use;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Direction {

    /*NOTE:
     * 1.必须先定义enum实例,如果在定义enum实例之前定义任何方法或属性,那么编译会出错
     * 2.构造方法只能用private修饰符
     * 3.创建enum时,编译器会为你生成一个相关的类,这个类继承自java.lang.Enum
     * 4.除了不能继承自一个enum外(已经继承自Enum),基本上可以将enum看作一个常规的类,甚至可以有main方法
     * 5.switch只能接受整数值,枚举天然具备整数值的次序,并且可以通过ordinal()方法取得其次序
     * 6.Enum中没有values()方法,在自定义enum时编译器会添加该static方法
     * 7.要实现常量相关方法,需要为enum定义abstract方法,然后为每个enum实例实现该抽象方法
     * 8.#####用enum可以实现singleton#######
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
