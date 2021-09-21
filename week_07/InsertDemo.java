package com.peanutnowing.demo;

import java.sql.*;

/**
 * 插入100万条数据
 */
public class InsertDemo {


  public static void main(String[] args) {

    long start = System.currentTimeMillis();
    insertMillion();
    long end = System.currentTimeMillis();
    System.out.println("执行耗时：" + (end - start)/1000 + "秒");
  }

  public static void insertMillion(){

    //1.获取数据库连接对象
    Connection conn = null;
    PreparedStatement pstmt = null;
    {
      try {
        //"&rewriteBatchedStatements=true",一次插入多条数据，只插入一次
        conn = DriverManager.getConnection("jdbc:mysql:///test?" + "&rewriteBatchedStatements=true","root","root");
        //2.定义sql语句
        String sql = "insert into t_user values(default,?,?)";
        //3.获取执行sql的对象PreparedStatement
        pstmt = conn.prepareStatement(sql);
        //4.组装sql
        for (int i = 0; i < 1000000; i++) {
          pstmt.setString(1,(int)(Math.random()*1000000)+"");
          pstmt.setString(2,(int)(Math.random()*1000000)+"");
          pstmt.addBatch();
        }
        //5.往数据库插入一次数据
        pstmt.executeBatch();
        System.out.println("插入100万条数据成功！");

      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        //6.释放资源
        if(pstmt != null) {
          try {
            pstmt.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }

        if(conn != null) {
          try {
            conn.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
    }

  }

}


