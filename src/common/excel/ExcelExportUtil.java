package common.excel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author: lsl
 * @createDate: 2019/9/26
 */
public class ExcelExportUtil {

    public static void export(List<?> exportList, Class clazz){

        System.out.println(clazz.getName());

        Field[] declaredFields = clazz.getDeclaredFields();

        List<ColumnName> tableHeaders = new ArrayList<>();

        List<FieldSort> fieldSorts = new ArrayList<>();

        for(Field field:declaredFields){
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            for(Annotation annotation:declaredAnnotations){
                if(annotation instanceof ColumnName){
                    ColumnName columnName = ((ColumnName) annotation);
                    tableHeaders.add(columnName);
                    field.setAccessible(true);
                    FieldSort fieldSort = new FieldSort(field,columnName.index());
                    fieldSorts.add(fieldSort);
                }
            }
        }

        /**处理表头*/
        tableHeaders.sort(Comparator.comparingInt(a->a.index()));
        /**
         * TODO 写入表头
         */

        /**处理主体内容*/
        exportList.stream().forEach(
                a->fieldSorts.stream()
                        .sorted(Comparator.comparingInt(b->b.getIndex()))
                        .forEach(b->switchPrint(a,b.getField()))
        );

        /** 写入内容
        fieldSorts.sort(Comparator.comparingInt(a->a.getIndex()));
        for(T t:exportList){
            for(FieldSort fieldSort:fieldSorts){
                try {
                    Field field = fieldSort.getField();
                    System.out.println(field.getGenericType().getTypeName());
                    System.out.println(field.get(t));
                    switchPrint(t,field);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    public static void main(String[] args){
        List<Test> list = new ArrayList<>(2);
        Test test1 = new Test("1","a",30,28888.5d,new Date());
        Test test2 = new Test("2","b",20,18888.5d,new Date());
        list.add(test1);
        list.add(test2);
        ExcelExportUtil.export(list, Test.class);
    }

    private static void switchPrint(Object t,Field field){
        try {
            switch (field.getGenericType().getTypeName()){
                case "java.lang.String":
                    System.out.println(field.get(t));
                    break;
                case "java.lang.Double":
                    System.out.println(field.get(t) instanceof Double);
                    break;
                case "java.lang.Float":
                    System.out.println(field.getFloat(t));
                    break;
                case "java.lang.Long":
                    System.out.println(field.getLong(t));
                    break;
                case "java.lang.Integer":
                    System.out.println(field.getInt(t));
                    break;
                case "java.lang.Short":
                    System.out.println(field.getShort(t));
                    break;
                case "java.lang.Byte":
                    System.out.println(field.getByte(t));
                    break;
                case "java.util.Date":
                    System.out.println(field.get(t));
                    break;
                case "double":
                    System.out.println(field.getDouble(t));
                    break;
                case "float":
                    System.out.println(field.getFloat(t));
                    break;
                case "long":
                    System.out.println(field.getLong(t));
                    break;
                case "int":
                    System.out.println(field.getInt(t));
                    break;
                case "short":
                    System.out.println(field.getShort(t));
                    break;
                case "byte":
                    System.out.println(field.getByte(t));
                    break;
                default:
                    System.out.println(field.get(t));
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
