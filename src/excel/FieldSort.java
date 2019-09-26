package excel;

import java.lang.reflect.Field;

/**
 * @author: lsl
 * @createDate: 2019/9/26
 */
public class FieldSort {

    private Field field;

    private int index;

    public FieldSort(){

    }
    public FieldSort(Field field, int index) {
        this.field = field;
        this.index = index;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
