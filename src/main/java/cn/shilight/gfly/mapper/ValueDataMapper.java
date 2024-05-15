package cn.shilight.gfly.mapper;

import cn.shilight.gfly.entity.ValueData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ValueDataMapper {

    @Insert("INSERT INTO valuedata (seniorid, ValueName, jd, wd, sampletime, valuedata,valueUnits) VALUES " +
            "(#{seniorId},#{valueName},#{JD},#{WD},#{sampleTime},#{valueData},#{valueUnits})")
    public int insertSeniorData(ValueData valueData);


    @Select("Select * from valuedata where SeniorId = #{seniorId}")
    public List<ValueData> getValueData(String seniorId);









}
