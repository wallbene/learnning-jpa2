package br.com.caelum;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class testa {
	public static void main(String[] args) throws PropertyVetoException, SQLException {
		ComboPooledDataSource dataSource = (ComboPooledDataSource) new JpaConfigurator().getDataSource();

		for (int i = 0; i <= 10; i++) {
			dataSource.getConnection();

			System.out.println("numero de conexões: " + dataSource.getNumConnections());
			System.out.println("conexões ocupadas: " + dataSource.getNumBusyConnections());
			System.out.println("conexões ociosas: " + dataSource.getNumIdleConnections());
		}
	}

}
