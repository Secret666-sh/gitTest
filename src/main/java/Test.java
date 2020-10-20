import java.util.HashMap;

public class Test {


    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("111", "222");
        System.out.println(hashMap.get("111"));
        System.out.println();

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(111, 111);
        System.out.println(objectObjectHashMap.get(111));


        Student student = new Student();
        student.setAddress("1111");
        System.out.println(student.getAddress());
        if (student != null) {
            System.out.println("eeeeeeee");
        }


    }

}
