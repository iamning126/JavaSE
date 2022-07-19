package com.iamning.base;

/**
 * @author huning
 * @version 1.0
 * @since 1.8
 */
//类注释
public class Doc {
    String name;

    /**
     * @author huning
     * @param name
     * @return
     * @throws Exception
     */
    //方法注释
    public String test(String name)throws Exception{
        return name;
    }
    //命令行 javadoc 参数 Java文件
    //javadoc -encoding UTF-8 -charset UTF-8 Doc.java
    //学会查找使用IDEA生产JavaDoc文档！
}
