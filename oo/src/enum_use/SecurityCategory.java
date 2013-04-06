package enum_use;
public enum SecurityCategory {
    STOCK(Security.Stock.class), BOND(Security.Bond.class);
    Security[] values;
    SecurityCategory(Class<? extends Security> kind) {
        values = kind.getEnumConstants();
    }
}

interface Security {
    enum Stock implements Security {
        SHORT, LONG, MARGIN
    }
    enum Bond implements Security {
        ETF, MUTUAL, OPEN
    }
}

