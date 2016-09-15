package mx.com.edcore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gabriel Cisneros Landeros
 */
public class JDBC {

    private String server;
    private String port;
    private String user;
    private String password;
    private String bd;
    private Connection conexion;
    private Statement stmt;

    /**
     * Establece la Bade de datos a ser conectado
     */
    public JDBC() {
        this.server = "200.78.237.211";
        this.bd = "edcore_zapopan";
        this.port = "3306";
        this.user = "root";
        this.password = "14-adq-050";
        this.conexion = null;
        this.stmt = null;
    }

    /**
     * Abre conexion a la Base de datos
     *
     * @return
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public Connection open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://" + this.server + ":" + this.port + "/" + this.bd + "?useUnicode=true&characterEncoding=UTF-8", this.user, this.password);
        stmt = conexion.createStatement();
        return conexion;
    }

    /**
     * Cierra conexion a la Base de datos
     *
     * @throws java.sql.SQLException
     */
    public void close() throws SQLException {
        if (this.conexion != null) {
            this.conexion.close();
        }
        this.conexion = null;
    }
}
