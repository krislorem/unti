package MySQLdb;

import org.jetbrains.annotations.Contract;

import java.sql.*;

/**
 * @author xiemu
 * @version 1.0
 * &#064;introduction
 *
 */
class ConnectJdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/student2?useUnicode=true&characterEncoding=UTF-8&useSSL=false&severTimezone=Asia/Beijing";
    @Contract ( pure = true )
    ConnectJdbc ( ) {
    }
    public static void main( String[] args) {
        String driver = " com.mysql.jdbc.Driver.class";
        Connection con = null;
        Statement stmt;
        try {
            Class.forName ( driver );
        } catch ( java.lang.ClassNotFoundException e ) {
            System.out.println ( "无法加载驱动." );
        }
        try {
            con = DriverManager.getConnection ( URL , "root" , "40273939zjpzjp" );
            stmt = con.createStatement ( );
            System.out.println ( "语句对象：" + stmt );
            System.out.println ( "连接成功." );
//            stmt.executeUpdate ( "create database  if not exists student2 charset UTF8" );
            stmt.executeUpdate ("use student2 ;");
//            stmt.executeUpdate (  "create table if not exists  student(sno int primary key auto_increment, name varchar(20), gender  char(1), birthday date, address varchar(30))");
//            stmt.executeUpdate ( "insert into `student`  values \n" +
//                    " (null, '小明', '男', '2000-10-20','湖南永州'),\n" +
//                    " (null, '小红', '女', '1998-08-24','福建南平'),\n" +
//                    " (null, '小军', '男', '1997-06-18','四川泸州'),\n" +
//                    " (null, '小玲', '女', '1999-05-14','山东菏泽'),\n" +
//                    " (null, '小聪', '男', '2001-10-21','贵州遵义');" );
//            stmt.executeUpdate ("update student set name = '明' where sno = 1");
          ResultSet resultSet =
                      stmt.executeQuery ( "select *from student");
            while (resultSet.next () ){
                int sno = resultSet.getInt("sno");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String birthday = resultSet.getString("birthday");
                String address = resultSet.getString("address");
                System.out.println ( sno + "\t" + name + "\t" + gender + "\t" + birthday + "\t" + address);
            }
            stmt.executeUpdate ("insert into student values (6,'陈也', '男', '2004-01-01', '江苏南通')"  );
            stmt.close ();
            con.close ();
        }  catch ( SQLException e ) {
            e.printStackTrace ( );
        }catch ( Exception e ) {
            System.out.println ( "连接失败:" + e.getMessage ( ) );
        }
        if ( con != null ) {
            try {
                con.close ( );
            } catch ( SQLException e ) {
                e.printStackTrace ( );
            }
        }
    }
}
