package com.guava.join;

/**
 * @author xuzhongming
 * @since 14 十一月 2017
 */
public class Test1 {
    public static void main(String[] args) {
//        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
//        String result = Joiner.on(",").join(names);
//        System.out.println(result);


//        Map<String, Integer> salary = Maps.newHashMap();
//        salary.put("xzm", 1000);
//        salary.put("cl", 1000);
//        String result = Joiner.on(" , ").withKeyValueSeparator(" = ").join(salary);
//        System.out.println(result);


//        List<ArrayList<String>> nested = Lists.newArrayList(Lists.newArrayList("apple", "banana", "orange"),
//                Lists.newArrayList("cat", "dog", "bird"),
//                Lists.newArrayList("John", "Jane", "Adam"));
//        String result = Joiner.on(";").join(Iterables.transform(nested, new Function<List<String>, Object>() {
//            @Nullable
//            @Override
//            public Object apply(@Nullable List<String> input) {
//                return Joiner.on("_").join(input);
//            }
//        }));
//        System.out.println(result);//结果是apple_banana_orange;cat_dog_bird;John_Jane_Adam


//        List<String> names = Lists.newArrayList("John", null, "Jane", "Adam", "Tom");
//        //String result = Joiner.on(",").skipNulls().join(names);//John,Jane,Adam,Tom
//        String result = Joiner.on(",").useForNull("nameless").join(names);//John,nameless,Jane,Adam,Tom
//        System.out.println(result);

    }
}
