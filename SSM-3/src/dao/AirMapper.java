package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Air;

public interface AirMapper {
public List<Air> getAll(@Param("a")int indexpage,@Param("b")int index);
public List<Air> getAlldid();
//Ìí¼Ó
public int insert(Air a);
public int count();
}
