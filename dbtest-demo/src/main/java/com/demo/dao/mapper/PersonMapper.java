package com.demo.dao.mapper;

import com.demo.dao.model.Person;
import com.demo.dao.model.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @SelectProvider(type=PersonSqlProvider.class, method="countByExample")
    long countByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @DeleteProvider(type=PersonSqlProvider.class, method="deleteByExample")
    int deleteByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @Delete({
        "delete from person",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @Insert({
        "insert into person (id, name, ",
        "age, address, mobile, ",
        "height, weight, marital_status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, #{mobile,jdbcType=CHAR}, ",
        "#{height,jdbcType=REAL}, #{weight,jdbcType=REAL}, #{maritalStatus,jdbcType=BIT})"
    })
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @InsertProvider(type=PersonSqlProvider.class, method="insertSelective")
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @SelectProvider(type=PersonSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.REAL),
        @Result(column="weight", property="weight", jdbcType=JdbcType.REAL),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.BIT)
    })
    List<Person> selectByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @Select({
        "select",
        "id, name, age, address, mobile, height, weight, marital_status",
        "from person",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.REAL),
        @Result(column="weight", property="weight", jdbcType=JdbcType.REAL),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.BIT)
    })
    Person selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @UpdateProvider(type=PersonSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @UpdateProvider(type=PersonSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @UpdateProvider(type=PersonSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Jun 16 20:34:10 CST 2021
     */
    @Update({
        "update person",
        "set name = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=CHAR},",
          "height = #{height,jdbcType=REAL},",
          "weight = #{weight,jdbcType=REAL},",
          "marital_status = #{maritalStatus,jdbcType=BIT}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Person record);
}