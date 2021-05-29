package pj.bridgelabz.mysql

import java.sql.{Connection, DriverManager}

object MySqlConnectivity extends App {
    // connect to the database named "mysql" on port 8889 of localhost
    val url = "jdbc:mysql://localhost:3306/demo"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "root"
    val password = "root"
    var connection:Connection = _
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement
      val rs = statement.executeQuery("SELECT * FROM city")
      while (rs.next) {
        val host = rs.getString("cityname")
        //      val user = rs.getString("user")
        println("City Name = %s".format(host))
      }
    } catch {
      case e: Exception => e.printStackTrace
    }
    connection.close
}
