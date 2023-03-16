package com.vtalent.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vtalent.insurance.model.CarModel;
import com.vtalent.insurance.model.MakeOfCar;
import com.vtalent.insurance.model.MakeOfYear;

public class VehicleDao {
	
	
	Connection con;
    PreparedStatement pst;
    String query;
    ResultSet rs;
    
    public VehicleDao(Connection con) {
        this.con = con;
    }
    
    public List<MakeOfYear> getAllYears(){
        List<MakeOfYear> list  = new ArrayList<>();
        try{
            query = "select * from yearofmake";
            pst = this.con.prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
                MakeOfYear makeyear = new MakeOfYear();
                makeyear.setId(rs.getInt("y_id"));
                makeyear.setYear(rs.getInt("years"));
                list.add(makeyear);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    
    
    public List<MakeOfCar> getcarMakeByyearId(int yearid){
        List<MakeOfCar> list = new ArrayList<>();
        try{
            query = "select * from carmake where y_id=?";
            pst = this.con.prepareStatement(query);
            pst.setInt(1, yearid);
            rs = pst.executeQuery();
            while(rs.next()){
                MakeOfCar carmake = new MakeOfCar();
                carmake.setId(rs.getInt("make_id"));
                carmake.setYearid(rs.getInt("y_id"));
                carmake.setMakeName(rs.getString("carmake"));
                list.add(carmake);
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
        return list;
    }
    
    
    public List<CarModel> getcarmodelByMakeOfCarId(int makeid){
        List<CarModel> list = new ArrayList<>();
        try{
            query = "select * from carmodel where make_id=?";
            pst = this.con.prepareStatement(query);
            pst.setInt(1, makeid);
            rs = pst.executeQuery();
            while(rs.next()){
                CarModel carmodel = new CarModel();
                carmodel.setId(rs.getInt("model_id"));
                carmodel.setYearid(rs.getInt("y_id"));
                carmodel.setMakeid(rs.getInt("make_id"));
                carmodel.setModelName(rs.getString("carmodel"));
                list.add(carmodel);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
   