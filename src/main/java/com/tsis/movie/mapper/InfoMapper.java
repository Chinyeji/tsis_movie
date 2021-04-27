package com.tsis.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tsis.movie.model.InfoVo;

@Mapper
public interface InfoMapper {

	@Select("SELECT * FROM movie.movie_info")
	List<InfoVo> getInfoList();
	
	@Insert("INSERT INTO movie.reservation(phone_number,people) VALUES (#{phone_number},#{people})")
	int infoinsertUser(@Param("phone_number") String phone_number, @Param("people") Integer people);
}
