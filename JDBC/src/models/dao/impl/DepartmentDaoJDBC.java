package models.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import models.dao.DepartmentDAO;
import models.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDAO {

  Connection conn = null;

  public DepartmentDaoJDBC(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<Department> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Department findById(Integer id) {
    String sql = "SELECT * FROM department WHERE Id = ?";

    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      if (rs.next()) {
        Department dep = instantiateDepartment(rs);
        return dep;
      }
      return null;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(stmt);
      DB.closeResultSet(rs);
    }
  }

  @Override
  public void insert(Department obj) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Department obj) {
    // TODO Auto-generated method stub

  }

  private Department instantiateDepartment(ResultSet rs) throws SQLException {
    Department dep = new Department();
    dep.setId(rs.getInt("Id"));
    dep.setName(rs.getString("Name"));
    return dep;
  }

}
