package HW5;

import static HW5.TicTacToe.Value.VALUE_BIT_LENGTH;

public class TicTacToe {
    public static final int FIELD_SIZE = 3 * 3;

    public enum Value {
        EMPTY(0), CROSS(1), ZERO(2), RESERVE_VALUE(3);

        public static final int VALUE_BIT_LENGTH = 2;

        private final int code;

        Value(int code) {
            this.code = code;
        }
    }

    public static int zipToInt(Value[] values) {
        if (values.length != FIELD_SIZE) {
            throw new IllegalArgumentException("Array must contain " + FIELD_SIZE + " values");
        }

        int result = 0;
        for (Value value : values) {
            result <<= VALUE_BIT_LENGTH;
            result += value.code;
        }
        result <<= Integer.SIZE - VALUE_BIT_LENGTH * FIELD_SIZE;
        return result;
    }
}
