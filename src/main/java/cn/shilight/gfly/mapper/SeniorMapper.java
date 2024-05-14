package cn.shilight.gfly.mapper;

import cn.shilight.gfly.entity.Senior;
import cn.shilight.gfly.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SeniorMapper {

    @Insert("INSERT INTO senior (SeniorName, SeniorMapEn, SeniorViewEn, AutoEn, Others)VALUES (#{SeniorName}, #{SeniorMapEn}, #{SeniorViewEn}, #{AutoEn}, #{Others})")
    int insertSenior(Senior senior);

    @Select("SELECT * FROM senior")
    List<Senior> getAllSeniors();


    @Delete("DELETE FROM senior WHERE SeniorId = #{SeniorId}")
    int deleteUser(int SeniorId);




}
