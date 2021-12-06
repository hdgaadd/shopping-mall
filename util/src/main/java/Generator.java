/**
 * Created by hdgaadd on 2021/12/06/18:25
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: WBG
 * @description: 自动创建service、impl、controller
 * @date: 2019/02/18 08:15
 */
public class Generator {

    //项目包名
    static String Package = "com.codeman";


    public static void main(String[] args) throws Exception {
        Generator auto = new Generator();
        //获取所有数据表
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("please prefix your file name ");
        String fileName = sc.nextLine();
        list.add(fileName);
        for (String table : list) {
            createStart(tables(table));
        }

    }



    /**
     * 把输入字符串的首字母改成大写
     *
     * @param str
     * @return
     */
    private static String initcap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

    /**
     * 把输入字符串的首字母改成小写
     *
     * @param str
     * @return
     */
    private static String initlow(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'A' && ch[0] <= 'Z') {
            ch[0] = (char) (ch[0] + 32);
        }
        return new String(ch);
    }

    //首字母转换和下划线转换
    private static String tables(String table) {
        String[] tables = table.split("_");
        table = "";
        for (String s : tables) {
            table += initcap(s);
        }
        return table;
    }
    /**
     * 创建Dao
     */
    private static String createDao(String tableName) {
        String service = "package "+Package+".mapper;\n\n" +
                "import org.apache.ibatis.annotations.Mapper;\n" +
                "\n" +
                "/**\n" +
                " * Created by hdgaadd\n" +
                " */\n" +
                "@Mapper\n" +
                "public interface "+tableName+"Mapper {\n" +

                "}";
        return service;
    }

    /**
     * 创建Service
     *
     * @param tableName 数据库表
     */
    private static String createService(String tableName) {
        String service = "package "+Package+".service;\n" +
                "\n" +
                "/**\n" +
                " * Created by hdgaadd\n" +
                " */\n" +
                "public interface " + tableName + "Service {\n" +
                "}";
        return service;
    }

    /**
     * 创建ServiceImpl
     *
     * @param tableName 数据库表
     */
    private static String createServiceImpl(String tableName) {
        String serviceImpl = "package "+Package+".service.impl;\n" +
                "\n" +
                "import "+Package+".service." + tableName + "Service;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "\n" +
                "/**\n" +
                " * Created by hdgaadd\n" +
                " */\n" +
                "@Service\n" +
                "public class " + tableName + "ServiceImpl implements " + tableName + "Service {\n" +
                "}\n";
        return serviceImpl;
    }

    /**
     * 创建Controller
     *
     * @param tableName 数据库表
     */
    private static String createController(String tableName) {
        String controller ="package "+Package+".controller;\n\n" +"import io.swagger.annotations.Api;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.RestController;\n\n"+
                "/**\n" +
                " * Created by hdgaadd\n" +
                " */\n" +
                "@Api(tags = \"" + "\")\n" +
                "@RestController\n" +
                "@RequestMapping(\"/" + "\")\n" +
                "public class " + tableName + "Controller {\n" +
                "}\n";
        return controller;
    }

    /**
     * create XML
     *
     */
    private static String createXml(String tableName) {
        String controller =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n" +
                        "<mapper namespace=\"com.codeman.mapper." + tableName +"Mapper\">\n" +
                        "</mapper>";
        return controller;
    }

    /**
     * 开始创建
     *
     * @param tableName 数据库表
     */
    static void createStart(String tableName) {
        //获取当前项目的路径
        String baseUrl = System.getProperty("user.dir");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your modele name");
        String moduleName = sc.nextLine();
        String url = baseUrl +  "\\" + moduleName + "\\src\\main\\java\\com\\codeman\\";
        //创建Dao
        createFile(new File(url + "mapper\\" + tableName + "Mapper.java"), createDao(tableName));
        //创建Service
        createFile(new File(url + "service\\" + tableName + "Service.java"), createService(tableName));
        //创建ServiceImpl
        createFile(new File(url + "service\\impl\\" + tableName + "ServiceImpl.java"), createServiceImpl(tableName));
        //创建Controller
        createFile(new File(url + "controller\\" + tableName + "Controller.java"), createController(tableName));
        // 创建Mapper.xml
        createFile(new File(baseUrl + "\\" + moduleName + "\\src\\main\\resources\\" + "mapper\\" + tableName + "Mapper.xml"), createXml(tableName));
    }

    /**
     * @param file    创建的文件
     * @param context 文件里面的内容
     */
    static boolean createFile(File file, String context) {
        //获取文件
        File parent = file.getParentFile();
        //如果是目录
        if (parent != null) {
            //创建目录
            parent.mkdirs();
        }
        try {
            //创建文件
            file.createNewFile();
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
                fileWriter.write(context);
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                return false;
            }
        } catch (IOException e) {
            System.out.println("创建文件失败:" + e.getMessage());
        }
        return true;
    }
}
